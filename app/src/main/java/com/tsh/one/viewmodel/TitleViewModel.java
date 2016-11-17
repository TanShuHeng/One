package com.tsh.one.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by captain on 16/11/17.
 */
public class TitleViewModel extends BaseObservable{
    private String title;
    private int centerImg;
    private int leftImg;
    private int rightImg;

    public TitleViewModel(int centerImg, int leftImg, int rightImg) {
        this.centerImg = centerImg;
        this.leftImg = leftImg;
        this.rightImg = rightImg;
    }

    public TitleViewModel(int leftImg, int rightImg, String title) {
        this.leftImg = leftImg;
        this.rightImg = rightImg;
        this.title = title;
    }

    public TitleViewModel(int leftImg, String title) {
        this.leftImg = leftImg;
        this.title = title;
    }

    @Bindable
    public int getCenterImg() {
        return centerImg;
    }

    public void setCenterImg(int centerImg) {
        this.centerImg = centerImg;
    }

    public int getLeftImg() {
        return leftImg;
    }

    public void setLeftImg(int leftImg) {
        this.leftImg = leftImg;
    }

    public int getRightImg() {
        return rightImg;
    }

    public void setRightImg(int rightImg) {
        this.rightImg = rightImg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
