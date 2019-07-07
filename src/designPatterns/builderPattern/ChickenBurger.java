package designPatterns.builderPattern;

/**
 * @ClassName ChickenBurger
 * @Descrcription 鸡肉汉堡
 * @Author zzc
 * @Date 2019/7/7 8:25
 * @Version 1.0
 */
public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
