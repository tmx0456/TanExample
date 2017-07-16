package app.tan.lib.imageload;

import android.content.Context;
import android.support.annotation.NonNull;

public interface IImageLoaderstrategy {
    void showImage(@NonNull ImageLoaderOptions options);
    void cleanMemory(Context context);
    // 在application的oncreate中初始化
    void init(Context context);
}
