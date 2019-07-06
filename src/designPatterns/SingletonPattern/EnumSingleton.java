package designPatterns.SingletonPattern;

/**
 * @ClassName EnumSingleton
 * @Descrcription 枚举单例（多线程安全，支持序列化机制，防止反序列化重新创建新的对象）
 * @Author zzc
 * @Date 2019/7/6 16:03
 * @Version 1.0
 */
public enum  EnumSingleton {
    INSTANCE;
    public void whateverMethod() {
    }
}
