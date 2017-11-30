package factory.simple;

/**
 * Created by hehe on 2017/11/30.
 */
public class Chose {

/**
 作者：caomingwei
 时间：@date 2017/11/30 14:10
 类型：类
 */
 public Factory create(int i){

     switch (i){

         case 1:
             return new Car1("car1被生产");


         case 2:
             return new Car1("car2生产");

     }

         return null;
 }

}
