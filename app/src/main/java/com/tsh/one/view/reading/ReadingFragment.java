package com.tsh.one.view.reading;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tsh.one.R;
import com.tsh.one.databinding.FragmentReadingBinding;
import com.tsh.one.view.BaseFragment;
import com.tsh.one.viewmodel.TitleViewModel;

/**
 * Created by captain on 16/11/17.
 */
public class ReadingFragment extends BaseFragment {
    public static final String TAG = ReadingFragment.class.getSimpleName();
    FragmentReadingBinding binding;
    TitleViewModel titleViewModel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (binding == null) {
            binding = FragmentReadingBinding.inflate(inflater);
            initView();
        }
        return binding.getRoot();
    }


    private void initView() {
        titleViewModel = new TitleViewModel(R.mipmap.search, R.mipmap.individual_center, "阅读");
        binding.setTitleViewModel(titleViewModel);
    }
}
