package com.tsh.one.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioGroup;

import com.tsh.one.R;
import com.tsh.one.databinding.ActivityHomeBinding;
import com.tsh.one.view.home.HomeFragment;
import com.tsh.one.view.movie.MovieFragment;
import com.tsh.one.view.music.MusicFragment;
import com.tsh.one.view.reading.ReadingFragment;
import com.tsh.one.viewmodel.HomeViewModel;


public class HomeActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener {
    private ActivityHomeBinding binding;
    private HomeViewModel homeViewModel;
    FragmentManager fragmentManager;
    private HomeFragment homeFragment;
    private ReadingFragment readingFragment;
    private MusicFragment musicFragment;
    private MovieFragment movieFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        initView();
        binding.setHomeViewModel(homeViewModel);
    }

    private void initView() {
        homeViewModel = new HomeViewModel();
        homeViewModel.setHomeResId(R.drawable.checked_home);
        homeViewModel.setReadingResId(R.drawable.checked_reading);
        homeViewModel.setMusicResId(R.drawable.checked_music);
        homeViewModel.setMovieResId(R.drawable.checked_movie);
        homeViewModel.setOnCheckedChangeListener(this);
        initHome();
    }

    private void initHome() {
        homeFragment = new HomeFragment();
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.fl_fragment, homeFragment, HomeFragment.TAG).commit();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        switch (checkedId) {
            case R.id.rb_home:
                transaction.replace(R.id.fl_fragment, homeFragment, ReadingFragment.TAG);
                break;
            case R.id.rb_reading:
                if (readingFragment == null) {
                    readingFragment = new ReadingFragment();
                }
                transaction.replace(R.id.fl_fragment, readingFragment, ReadingFragment.TAG);
                break;
            case R.id.rb_music:
                if (musicFragment == null) {
                    musicFragment = new MusicFragment();
                }
                transaction.replace(R.id.fl_fragment, musicFragment, MusicFragment.TAG);
                break;
            case R.id.rb_movie:
                if (movieFragment == null) {
                    movieFragment = new MovieFragment();
                }
                transaction.replace(R.id.fl_fragment, movieFragment, MovieFragment.TAG);
                break;
        }
        transaction.commit();
    }
}
