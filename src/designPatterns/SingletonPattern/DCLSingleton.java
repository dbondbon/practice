package designPatterns.SingletonPattern;

/**
 * @ClassName DCLSingleton
 * @Descrcription 双重锁实现单例(多线程安全且效率高)
 * @Author zzc
 * @Date 2019/7/6 15:49
 * @Version 1.0
 */
public class DCLSingleton {
    private static DCLSingleton instance;
    private DCLSingleton(){}

    private static DCLSingleton getInstance() {
        if (instance == null) {
            synchronized (DCLSingleton.class) {
                if (instance == null) {
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
}
