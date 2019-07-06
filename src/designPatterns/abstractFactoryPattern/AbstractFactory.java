package designPatterns.abstractFactoryPattern;

import common.Color;
import common.Shape;

/**
 * @ClassName AbstractFactory
 * @Descrcription 抽象工厂类
 * @Author zzc
 * @Date 2019/7/6 14:34
 * @Version 1.0
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shapeType);
}
