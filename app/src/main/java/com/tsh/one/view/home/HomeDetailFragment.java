package com.tsh.one.view.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tsh.one.databinding.FragmentHomeDetailBinding;
import com.tsh.one.view.BaseFragment;

/**
 * Created by captain on 16/11/17.
 */
public class HomeDetailFragment extends BaseFragment {
    FragmentHomeDetailBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (binding == null) {
            binding = FragmentHomeDetailBinding.inflate(inflater);
        }
        return binding.getRoot();
    }
}
