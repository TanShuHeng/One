package com.tsh.one.view.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tsh.one.R;
import com.tsh.one.databinding.FragmentHomeBinding;
import com.tsh.one.http.HttpConfig;
import com.tsh.one.http.HttpResponse;
import com.tsh.one.http.HttpService;
import com.tsh.one.model.HomeDetail;
import com.tsh.one.view.BaseFragment;
import com.tsh.one.viewmodel.TitleViewModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by captain on 16/11/17.
 */
public class HomeFragment extends BaseFragment {
    public static final String TAG = HomeFragment.class.getSimpleName();
    private FragmentHomeBinding binding;
    private TitleViewModel titleViewModel;
    private List<HomeDetail> homeDetailList = new ArrayList<>();
    private HomePagerAdapter pagerAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        if (binding == null) {
            binding = FragmentHomeBinding.inflate(inflater);
//        }
        initView();
        loadData();
        return binding.getRoot();
    }

    private void initView() {
        titleViewModel = new TitleViewModel(R.mipmap.nav_title, R.mipmap.search, R.mipmap.individual_center);
        binding.setTitleViewModel(titleViewModel);
    }

    private void loadData() {
        pagerAdapter = new HomePagerAdapter(getChildFragmentManager());
        binding.viewPager.setAdapter(pagerAdapter);
        final HttpService service = new Retrofit.Builder()
                .baseUrl(HttpConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()
                .create(HttpService.class);

        service.getHomeIdList()
                .subscribeOn(Schedulers.io())
                .flatMap(new Func1<HttpResponse<List<String>>, Observable<String>>() {
                    @Override
                    public Observable<String> call(HttpResponse<List<String>> httpResponse) {
                        return Observable.from(httpResponse.getData());
                    }
                })
                .flatMap(new Func1<String, Observable<HttpResponse<HomeDetail>>>() {
                    @Override
                    public Observable<HttpResponse<HomeDetail>> call(String s) {
                        return service.getHomeDetail(s);
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<HttpResponse<HomeDetail>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onNext(HttpResponse<HomeDetail> response) {
                        homeDetailList.add(response.getData());
                        pagerAdapter.add(new HomeDetailFragment());
                    }
                });
    }
}
