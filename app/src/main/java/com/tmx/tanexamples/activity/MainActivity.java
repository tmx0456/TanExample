package com.tmx.tanexamples.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.tmx.tanexamples.R;
import com.tmx.tanexamples.entity.api.SubjectApi;

import app.tan.lib.base.BaseCompatActivity;
import app.tan.lib.imageload.ImageLoaderManager;
import app.tan.lib.retrofit.exception.ApiException;
import app.tan.lib.retrofit.http.HttpManager;
import app.tan.lib.util.NetUtils;
import butterknife.BindView;


/**
 * 主页面
 */
public class MainActivity extends BaseCompatActivity {
//    @BindView(R.id.text)
    TextView text;
//    @BindView(R.id.image)
    ImageView image;
    private HttpManager manager;
    private SubjectApi subEntity;

    @Override
    protected boolean toggleOverridePendingTransition() {
        return false;
    }

    @Override
    protected TransitionMode getOverridePendingTransitionMode() {
        return null;
    }

    @Override
    protected boolean isApplyKitKatTranslucency() {
        return false;
    }

    @Override
    protected boolean isApplyStatusBarTranslucency() {
        return false;
    }

    @Override
    protected void getBundleExtras(Bundle extras) {

    }

    @Override
    protected void onNetworkConnected(NetUtils.NetType type) {


    }

    @Override
    protected void onNetworkDisConnected() {

    }

    @Override
    protected int getContentViewLayoutID() {

        return R.layout.activity_main;
    }

    @Override
    protected View getLoadingTargetView() {
        return null;
    }

    @Override
    protected void initView() {
        text = (TextView) findViewById(R.id.text);
        image = (ImageView) findViewById(R.id.image);

    }

    @Override
    protected void processLogic(Bundle savedInstanceState) {
        HttpManager manager = new HttpManager(this, this);
        subEntity = new SubjectApi();
        subEntity.setUserName("ABCD");
        subEntity.setPassWord("1234");

        String url="http://i1.juyouqu.com/uploads/content/2013/09/1379337214350.jpg";
        ImageLoaderManager.getInstance().showImage(ImageLoaderManager.getDefaultOptions(image,url));
    }

    @Override
    protected void setListener() {
        image.setOnClickListener(this);
        text.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.text:
                manager.doHttpDeal(subEntity);
             break;
            case  R.id.image:
                Toast.makeText(this, "别点我", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onNext(String resulte, String mothead) {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError(ApiException e) {
        Toast.makeText(this, "登录失败" + e.getMessage(), Toast.LENGTH_SHORT).show();
    }

}
