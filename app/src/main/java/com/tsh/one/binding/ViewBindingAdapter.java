package com.tsh.one.binding;

import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;

/**
 * Created by captain on 16/11/17.
 */
public class ViewBindingAdapter {
    @BindingAdapter("android:background")
    public static void setBackground(View v, int resId) {
        v.setBackgroundResource(resId);
    }

    @BindingAdapter("android:background")
    public static void setBackground(ImageView v, int resId) {
        v.setBackgroundResource(resId);
    }

    @BindingAdapter("android:src")
    public static void setSrc(ImageView iv, int resId) {
        iv.setImageResource(resId);
    }

    @BindingAdapter("onCheckedChange")
    public static void setOnCheckedChange(RadioGroup radioGroup, RadioGroup.OnCheckedChangeListener listener) {
        radioGroup.setOnCheckedChangeListener(listener);
    }
}
