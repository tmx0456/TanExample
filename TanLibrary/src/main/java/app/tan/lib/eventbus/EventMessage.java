package app.tan.lib.eventbus;

import android.os.Bundle;

/**
 * EventBus使用传递信息的数据结构
 */
public class EventMessage {
    private int requestCode;
    private Bundle bundle;
    private String type;

    public EventMessage(int requestCode, String type, Bundle bundle) {
        setRequestCode(requestCode);
        setBundle(bundle);
        setType(type);
    }




    public int getRequestCode() {
        return requestCode;
    }

    public void setRequestCode(int requestCode) {
        this.requestCode = requestCode;
    }

    public Bundle getBundle() {
        return bundle;
    }

    public void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
