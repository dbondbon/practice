package designPatterns.builderPattern;

/**
 * @ClassName ColdDrink
 * @Descrcription 冷饮
 * @Author zzc
 * @Date 2019/7/7 8:20
 * @Version 1.0
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
