package designPatterns.SingletonPattern;

/**
 * @ClassName EagerSingleton
 * @Descrcription 饿汉式（多线程安全，基于classloader机制避免多线程问题）
 * @Author zzc
 * @Date 2019/7/6 15:45
 * @Version 1.0
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){}
    public  static EagerSingleton getInstance() {
        return instance;
    }
}
