package app.tan.lib.retrofit.listener;


import app.tan.lib.retrofit.exception.ApiException;

/**
 * 成功回调处理
 */
public interface  HttpOnNextListener {
    /**
     * 成功后回调方法
     * @param resulte
     * @param mothead
     */
   void onNext(String resulte, String mothead);

    /**
     * 失败
     * 失败或者错误方法
     * 自定义异常处理
     * @param e
     */
    void onError(ApiException e);
}
