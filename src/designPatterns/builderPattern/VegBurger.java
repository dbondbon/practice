package designPatterns.builderPattern;

/**
 * @ClassName VegBurger
 * @Descrcription 蔬菜汉堡
 * @Author zzc
 * @Date 2019/7/7 8:24
 * @Version 1.0
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
