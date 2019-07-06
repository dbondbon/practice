package designPatterns.SingletonPattern;

/**
 * @ClassName SingletonPatternDemo
 * @Descrcription 单例模式演示类
 * @Author zzc
 * @Date 2019/7/6 15:31
 * @Version 1.0
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        //获取唯一可用的对象
        SingleObject singleObject = SingleObject.getInstance();

        //显示消息
        singleObject.showMessage();
    }
}
