package programmingQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName ImplementQueuesWithTwoStacks
 * @Descrcription 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @Author zzc
 * @Date 2019/9/22 11:29
 * @Version 1.0
 */
public class ImplementQueuesWithTwoStacks {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
        List<Integer> list = new ArrayList<>();
        stack2.clear();
        int temp;
        while (!stack1.empty()) {
            temp = stack1.pop();
            list.add(temp);
        }
        int len = list.size();
        for (int i = 0; i < len; i++) {
            stack2.push(list.get(i));
            stack1.push(list.get(len - i - 1));
        }
        return;
    }

    public int pop() {
        int res = stack2.pop();
        List<Integer> list = new ArrayList<>();
        stack1.clear();
        int temp;
        while (!stack2.empty()) {
            temp = stack2.pop();
            list.add(temp);
        }
        int len = list.size();
        for (int i = 0; i < len; i++) {
            stack1.push(list.get(i));
            stack2.push(list.get(len - i - 1));
        }
        return res;
    }

    public static void main(String[] args) {
        ImplementQueuesWithTwoStacks myQue= new ImplementQueuesWithTwoStacks();
        myQue.push(1);
        myQue.push(2);
        int a = myQue.pop();
        int b = myQue.pop();
        System.out.println("a:" + a + "b:" + b);
    }
}
