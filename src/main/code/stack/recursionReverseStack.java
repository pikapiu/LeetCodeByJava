package main.code.stack;

import java.util.Stack;

/**
 * @Author: zs
 * @Date: 2019/10/31 9:29
 * 用递归逆序一个栈
 */
public class recursionReverseStack {

    public  static Integer getAndRemoveBottom(Stack<Integer> stack) {
        Integer bottomItem = stack.pop();
        if (stack.isEmpty()) {
            return bottomItem;
        } else {
            Integer last = getAndRemoveBottom(stack);
            stack.push(bottomItem);
            return last;
        }
    }



    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        Integer bottom = getAndRemoveBottom(stack);
        reverse(stack);
        stack.push(bottom);
    }


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(99);
        reverse(s);
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

}
