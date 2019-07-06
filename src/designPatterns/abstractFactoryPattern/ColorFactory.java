package designPatterns.abstractFactoryPattern;

import common.*;

/**
 * @ClassName ColorFactory
 * @Descrcription 颜色工厂类
 * @Author zzc
 * @Date 2019/7/6 14:41
 * @Version 1.0
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
