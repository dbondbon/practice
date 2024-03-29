package programmingQuestion;

/**
 * @ClassName FibonacciSequence
 * @Descrcription 要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * @Author zzc
 * @Date 2019/9/22 12:10
 * @Version 1.0
 */
public class FibonacciSequence {
    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(7));
    }
}
