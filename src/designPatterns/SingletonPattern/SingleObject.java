package designPatterns.SingletonPattern;

/**
 * @ClassName SingleObject
 * @Descrcription 单例类
 * @Author zzc
 * @Date 2019/7/6 15:27
 * @Version 1.0
 */
public class SingleObject {

    //创建 SingleObject 的一个对象
    private static SingleObject instance = new SingleObject();

    //构造函数私有化
    private SingleObject(){};

    //对外提供获取实例的方法
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}

