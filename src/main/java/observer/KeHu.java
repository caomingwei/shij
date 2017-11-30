package observer;

/**
 * Created by hehe on 2017/11/30.
 */
public class KeHu implements ObServer {

     private ShangJia shangJia;
     private String name;

    public KeHu(ShangJia shangJia,String name) {
        this.shangJia = shangJia;
        this.name=name;
        shangJia.addServer(this);
    }

    public void update(String str) {

        System.out.println(name+str);
    }

/**
 作者：caomingwei
 时间：@date 2017/11/30 10:21
 类型：类
 */

}
