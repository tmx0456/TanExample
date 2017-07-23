package com.tmx.tanexamples.entity.api;



import com.tmx.tanexamples.entity.HttpTestService;

import app.tan.lib.retrofit.api.BaseApi;
import retrofit2.Retrofit;
import rx.Observable;

public class SubjectApi extends BaseApi {
    String userName;
    String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 默认初始化需要给定回调和rx周期类
     * 可以额外设置请求设置加载框显示，回调等（可扩展）
     * 设置可查看BaseApi
     */
    public SubjectApi() {
        setShowProgress(true);
        setCancel(true);
        setCache(false);
    }

    @Override
    public Observable getObservable(Retrofit retrofit) {
        HttpTestService httpService = retrofit.create(HttpTestService.class);
        return httpService.getUserNameAndPassWord(getUserName(),getPassWord());
    }

}
