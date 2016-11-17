package com.tsh.one.http;

/**
 * Created by captain on 16/11/17.
 */
public class HttpResponse<T> {
    private int res;
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
}
