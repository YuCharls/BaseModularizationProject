package mvpdemo.yc.example.com.model_common.utils;

import android.widget.Toast;

import mvpdemo.yc.example.com.model_common.base.BaseApplication;


/**
 * Created by YuChao
 * com.example.yc.myapplication.utils
 */

public class ToastUtil {
    public static Toast toast;

    public static void setToast(String str) {

        if (toast == null) {
            toast = Toast.makeText(BaseApplication.getIns(), str, Toast.LENGTH_SHORT);
        } else {
            toast.setText(str);
        }
        toast.show();
    }
}
