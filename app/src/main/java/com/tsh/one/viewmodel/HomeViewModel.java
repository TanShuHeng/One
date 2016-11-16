package com.tsh.one.viewmodel;

import android.widget.RadioGroup;

/**
 * Created by captain on 16/11/17.
 */
public class HomeViewModel {
    private RadioGroup.OnCheckedChangeListener onCheckedChangeListener;

    public RadioGroup.OnCheckedChangeListener getOnCheckedChangeListener() {
        return onCheckedChangeListener;
    }

    public void setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }
}
