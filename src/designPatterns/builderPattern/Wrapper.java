package designPatterns.builderPattern;

/**
 * @ClassName Wrapper
 * @Descrcription 纸盒装
 * @Author zzc
 * @Date 2019/7/7 8:16
 * @Version 1.0
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
