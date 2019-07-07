package designPatterns.builderPattern;

/**
 * @ClassName Coke
 * @Descrcription 可口可乐
 * @Author zzc
 * @Date 2019/7/7 8:27
 * @Version 1.0
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.3f;
    }
}
