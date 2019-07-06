package designPatterns.proxyPattern;

/**
 * @ClassName BasicStudy
 * @Descrcription TODO
 * @Author zzc
 * @Date 2019/7/6 20:05
 * @Version 1.0
 */
public class BasicStudy implements Study{

    public void learnChinese() {
        System.out.println("学习语文");
    }

    public void learnMath() {
        System.out.println("学习数学");
    }

    public void learnEnglish() {
        System.out.println("学习英语");
    }
}
