package designPatterns.factoryPattern;

/**
 * @ClassName ShapeFactory
 * @Descrcription 工厂类，使用getShape方法获取类型形状的对象
 * @Author zzc
 * @Date 2019/7/6 13:16
 * @Version 1.0
 */
public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
