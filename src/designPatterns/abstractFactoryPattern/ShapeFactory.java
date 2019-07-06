package designPatterns.abstractFactoryPattern;

import common.*;

/**
 * @ClassName ShapeFactory
 * @Descrcription 形状工厂类
 * @Author zzc
 * @Date 2019/7/6 14:36
 * @Version 1.0
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
