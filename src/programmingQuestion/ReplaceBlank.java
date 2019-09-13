package programmingQuestion;

/**
 * @ClassName ReplaceBlank
 * @Descrcription 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @Author zzc
 * @Date 2019/9/13 11:23
 * @Version 1.0
 */
public class ReplaceBlank {
    public static String replaceSpace(StringBuffer str) {
        String newStr =  str.toString();
        return newStr.replaceAll(" ", "%20");
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We Are Happy");
        String res = replaceSpace(str);
        System.out.println(res);
    }
}
