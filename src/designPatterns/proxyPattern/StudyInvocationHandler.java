package designPatterns.proxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName StudyInvocationHandler
 * @Descrcription TODO
 * @Author zzc
 * @Date 2019/7/6 19:50
 * @Version 1.0
 */
public class StudyInvocationHandler implements InvocationHandler {

    Study basicStudy;

    public  StudyInvocationHandler(Study basicStudy) {
        this.basicStudy = basicStudy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("learnChinese")) {
            method.invoke(basicStudy, args);
            System.out.println("需要背书");
        } else if (method.getName().equals("learnMath")) {
            method.invoke(basicStudy, args);
            System.out.println("需要计算");
        } else if (method.getName().equals("learnEnglish")) {
            method.invoke(basicStudy, args);
            System.out.println("需要记单词");
        }
        return null;
    }
}
