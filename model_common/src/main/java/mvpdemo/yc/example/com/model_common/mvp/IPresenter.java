package mvpdemo.yc.example.com.model_common.mvp;

/**
 * Created by YuChao
 * mvpdemo.yc.example.com.model_common.base
 * mvp之P
 */

public interface IPresenter<V extends IView> {

    /**
     * @param view 绑定
     */
    void attachView(V view);


    /**
     * 防止内存的泄漏,清楚presenter与activity之间的绑定
     */
    void detachView();


    /**
     * @return 获取View
     */
    IView getIView();

}
