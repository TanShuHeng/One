package com.tsh.one.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.tsh.one.R;
import com.tsh.one.databinding.ActivityHomeBinding;
import com.tsh.one.viewmodel.HomeViewModel;

public class HomeActivity extends BaseActivity {
    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        HomeViewModel homeViewModel = new HomeViewModel();
        homeViewModel.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                System.out.println();
            }
        });
        binding.setHomeViewModel(homeViewModel);
    }
}
