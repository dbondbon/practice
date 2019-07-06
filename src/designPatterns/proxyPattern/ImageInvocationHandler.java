package designPatterns.proxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName ImageInvocationHandler
 * @Descrcription 图片处理器对象（此为JDK自带的动态代理）
 * @Author zzc
 * @Date 2019/7/6 16:38
 * @Version 1.0
 */
public class ImageInvocationHandler implements InvocationHandler{

    /**
     * 传入真实角色
     */
    Image realImage;

    public ImageInvocationHandler(Image realImage) {
        this.realImage = realImage;
    }

    /**
     *
     * @param proxy 代理类
     * @param method 正在调用的方法
     * @param args 方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("display")) {
            System.out.println("调用了显示的方法");
            method.invoke(realImage, args);
        }
        return null;
    }
}
