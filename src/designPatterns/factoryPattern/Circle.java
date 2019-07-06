package designPatterns.factoryPattern;

/**
 * @ClassName Circle
 * @Descrcription 圆形
 * @Author zzc
 * @Date 2019/7/6 13:14
 * @Version 1.0
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("圆形");
    }
}
