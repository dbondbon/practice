package designPatterns.prototypePattern;

/**
 * @ClassName Rectangle
 * @Descrcription 矩形
 * @Author zzc
 * @Date 2019/7/7 8:53
 * @Version 1.0
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
