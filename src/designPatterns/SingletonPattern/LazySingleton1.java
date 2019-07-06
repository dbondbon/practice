package designPatterns.SingletonPattern;

/**
 * @ClassName LazySingleton1
 * @Descrcription 懒汉式（多线程不安全，在多线程环境下不能正常工作）
 * @Author zzc
 * @Date 2019/7/6 15:36
 * @Version 1.0
 */
public class LazySingleton1 {
    private static LazySingleton1 instance;
    private LazySingleton1(){}

    public static LazySingleton1 getInstance() {
        if (instance == null) {
            instance = new LazySingleton1();
        }
        return instance;
    }
}

