package com.tsh.one.http;

import com.tsh.one.model.HomeDetail;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by captain on 16/11/17.
 */
public interface HttpService {
    @GET("hp/idlist/0?version=3.5.0&platform=android")
    Observable<HttpResponse<List<String>>> getHomeIdList();

    //    http://v3.wufazhuce.com:8000/api/hp/detail/1528?version=3.5.0&platform=android
    @GET("hp/detail/{id}?version=3.5.0&platform=android")
    Observable<HttpResponse<HomeDetail>> getHomeDetail(@Path("id") String id);


}
