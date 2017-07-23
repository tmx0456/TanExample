package com.tmx.tanexamples.entity;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;
import rx.Observable;

/**
 * 测试接口service
 * Created by WZG on 2016/12/19.
 */

public interface HttpTestService {


    @GET("user/login")
    Observable<String> getUserNameAndPassWord(@Query("loginname") String loginname,
                                 @Query("password") String password);


}
