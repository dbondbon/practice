package designPatterns.abstractFactoryPattern;

/**
 * @ClassName FactoryProducer
 * @Descrcription 工厂生成器
 * @Author zzc
 * @Date 2019/7/6 14:54
 * @Version 1.0
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
