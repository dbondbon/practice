package designPatterns.prototypePattern;

/**
 * @ClassName Circle
 * @Descrcription 圆形
 * @Author zzc
 * @Date 2019/7/7 9:13
 * @Version 1.0
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
