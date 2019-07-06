package designPatterns.abstractFactoryPattern;

import common.Color;
import common.Shape;

/**
 * @ClassName AbstractFactoryDemo
 * @Descrcription 抽象工厂模式演示类
 * @Author zzc
 * @Date 2019/7/6 14:56
 * @Version 1.0
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //获取圆形对象
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        //获取矩形对象
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        //获取正方形对象
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //获取红色对象
        Color color1 = colorFactory.getColor("RED");
        //获取绿色对象
        Color color2 = colorFactory.getColor("GREEN");
        //获取蓝色对象
        Color color3 = colorFactory.getColor("BLUE");

        //调用获取到shape对象的draw方法和color对象的fill方法
        shape1.draw();
        shape2.draw();
        shape3.draw();
        color1.fill();
        color2.fill();
        color3.fill();
    }
}
