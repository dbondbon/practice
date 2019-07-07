package designPatterns.builderPattern;

/**
 * @ClassName Burger
 * @Descrcription 汉堡
 * @Author zzc
 * @Date 2019/7/7 8:18
 * @Version 1.0
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
