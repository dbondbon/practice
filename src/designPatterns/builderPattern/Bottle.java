package designPatterns.builderPattern;

/**
 * @ClassName Bottle
 * @Descrcription 瓶装
 * @Author zzc
 * @Date 2019/7/7 8:17
 * @Version 1.0
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
