package designPatterns.prototypePattern;

/**
 * @ClassName PrototypePatternDemo
 * @Descrcription 原型模式演示类
 * @Author zzc
 * @Date 2019/7/7 9:15
 * @Version 1.0
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }

}
