package designPatterns.proxyPattern;

import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyPatternDemo
 * @Descrcription 代理模式演示类
 * @Author zzc
 * @Date 2019/7/6 16:29
 * @Version 1.0
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {

        /**
         * 普通的动态代理
         */
        Image image = new ProxyImage("test.jpg");
        //图像将从磁盘加载
        image.display();
        //图像不需要从磁盘加载
        image.display();

        /**
         * JDK自带的动态代理使用范例
         */
        //真实对象
        Image realImage = new RealImage("test2.jpg");
        //处理器
        ImageInvocationHandler imageInvocationHandler = new ImageInvocationHandler(realImage);
        //代理对象
        Image proxyClass = (Image) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Image.class}, imageInvocationHandler);

        proxyClass.display();

        /**
         * 自己使用JDK动态代理
         */
        Study basicStudy = new BasicStudy();
        StudyInvocationHandler studyInvocationHandler = new StudyInvocationHandler(basicStudy);
        Study studyProxy = (Study) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Study.class}, studyInvocationHandler);
        studyProxy.learnChinese();
        studyProxy.learnMath();
        studyProxy.learnEnglish();
    }
}
