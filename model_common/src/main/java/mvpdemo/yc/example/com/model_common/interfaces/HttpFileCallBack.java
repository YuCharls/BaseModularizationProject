package mvpdemo.yc.example.com.model_common.interfaces;

public interface HttpFileCallBack {
    void onSuccess(String result);

    void onFiled(String errmsg);

    void onStart();

    void onLoading(long total, long current, boolean isUploading);
}
