package mvpdemo.yc.example.com.model_common.base;

import mvpdemo.yc.example.com.model_common.http.Http;
import mvpdemo.yc.example.com.model_common.http.HttpService;
import mvpdemo.yc.example.com.model_common.mvp.IModel;

/**
 * Created by YuChao
 * mvpdemo.yc.example.com.model_common.base
 */

public class BaseModel implements IModel {

    protected static HttpService httpService;

    //初始化httpService
    static {
        httpService = Http.getHttpService();
    }

}
