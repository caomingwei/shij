package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hehe on 2017/11/30.
 */
public class ShangJia implements Subject {

    List<ObServer> list=new ArrayList<ObServer>();


    public void addServer(ObServer obServer) {

        list.add(obServer);

    }
    public void removeServer(ObServer obServer) {

    }

    public void notifyServer() {

        for(ObServer ob:list){
            ob.update("知道了");
        }
    }

/**
 作者：caomingwei
 时间：@date 2017/11/30 10:22
 类型：类
 */

    public void tongzhi(String tongzhi){

        System.out.println(tongzhi);
        this.notifyServer();

    }


}
