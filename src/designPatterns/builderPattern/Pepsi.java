package designPatterns.builderPattern;

/**
 * @ClassName Pepsi
 * @Descrcription 百事可乐
 * @Author zzc
 * @Date 2019/7/7 8:28
 * @Version 1.0
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
