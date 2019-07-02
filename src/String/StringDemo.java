package String;

/**
 * @ClassName StringDemo
 * @Descrcription String基础操作的演示类
 * @Author zzc
 * @Date 2019/7/2 15:11
 * @Version 1.0
 */
public class StringDemo {

    public static void main(String[] args) {

        String string = "abcdefgabc";

        //1、string.endsWith("aaa")
        System.out.println(string.endsWith("abc"));
        System.out.println(string.endsWith("efg"));

        //2、string.substring(a,b)
        System.out.println(string.substring(2,4));

        //3、string.lastIndexof('a')
        System.out.println(string.lastIndexOf('b'));
    }
}
