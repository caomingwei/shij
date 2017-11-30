package observer;

/**
 * Created by hehe on 2017/11/30.
 */
public interface Subject {

/**
 作者：caomingwei
 时间：@date 2017/11/30 10:19
 类型：接口
 */

    public void addServer(ObServer obServer);
    public void removeServer(ObServer obServer);
    public void notifyServer();

}
