/**
 * Created by YAO on 2019-06-04.
 * 单例模式——兼顾线程安全和效率的写法-双重检查法
 */
public class Singleton1 {
private static volatile Singleton1 singleton=null;
private Singleton1(){}
public static Singleton1 getSingleton(){
    if(singleton==null){
        synchronized (Singleton1.class){
            if(singleton==null){
                singleton=new Singleton1();
            }

        }
    }
    return singleton;
}
}
