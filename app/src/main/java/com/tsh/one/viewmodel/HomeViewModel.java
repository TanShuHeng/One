package com.tsh.one.viewmodel;

import android.widget.RadioGroup;

/**
 * Created by captain on 16/11/17.
 */
public class HomeViewModel {
    private int homeResId;
    private int readingResId;
    private int musicResId;
    private int movieResId;

    private RadioGroup.OnCheckedChangeListener onCheckedChangeListener;

    public RadioGroup.OnCheckedChangeListener getOnCheckedChangeListener() {
        return onCheckedChangeListener;
    }

    public void setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    public int getHomeResId() {
        return homeResId;
    }

    public void setHomeResId(int homeResId) {
        this.homeResId = homeResId;
    }

    public int getMovieResId() {
        return movieResId;
    }

    public void setMovieResId(int movieResId) {
        this.movieResId = movieResId;
    }

    public int getMusicResId() {
        return musicResId;
    }

    public void setMusicResId(int musicResId) {
        this.musicResId = musicResId;
    }

    public int getReadingResId() {
        return readingResId;
    }

    public void setReadingResId(int readingResId) {
        this.readingResId = readingResId;
    }
}
