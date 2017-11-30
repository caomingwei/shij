package observer;

/**
 * Created by hehe on 2017/11/30.
 */
public class Test {

/**
 作者：caomingwei
 时间：@date 2017/11/30 10:36
 类型：类
 */

public static void main(String[] args) {
    ShangJia shangJia=new ShangJia();
    KeHu keHu=new KeHu(shangJia,"zahngsan");
    KeHu keHu2=new KeHu(shangJia,"lisi");
    KeHu keHu3=new KeHu(shangJia,"wangwu");
    shangJia.tongzhi("商品降价了");
}
}
