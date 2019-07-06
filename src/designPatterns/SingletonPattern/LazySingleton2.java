package designPatterns.SingletonPattern;

/**
 * @ClassName LazySingleton2
 * @Descrcription 懒汉式（多线程安全，能在多线程环境下工作，但效率很低）
 * @Author zzc
 * @Date 2019/7/6 15:39
 * @Version 1.0
 */
public class LazySingleton2 {
    private static LazySingleton2 instance;
    private LazySingleton2(){}
    public static synchronized LazySingleton2 getInstance() {
        if (instance == null) {
            instance = new LazySingleton2();
        }
        return instance;
    }
}
