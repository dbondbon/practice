package designPatterns.SingletonPattern;

/**
 * @ClassName RegistrationSingleton
 * @Descrcription 登记式单例（多线程安全，能达到和双重锁机制一样的效果且实现更简单，但是此方法只适用于静态域的情况）
 * @Author zzc
 * @Date 2019/7/6 15:57
 * @Version 1.0
 */
public class RegistrationSingleton {
    public static class RegistrationSingletonHolder {
        private static final RegistrationSingleton INSTANCE = new RegistrationSingleton();
    }
    private RegistrationSingleton(){}
    public static final RegistrationSingleton getInstance() {
        return RegistrationSingletonHolder.INSTANCE;
    }
}
