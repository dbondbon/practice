package designPatterns.prototypePattern;

/**
 * @ClassName Square
 * @Descrcription 正方形
 * @Author zzc
 * @Date 2019/7/7 8:56
 * @Version 1.0
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
