package main.code.stack;

import java.util.Queue;
import java.util.Stack;

/**
 * @Author: zs
 * @Date: 2019/10/31 11:04
 * 用两个栈实现一个队列
 */
public class twoStackAsQueue {
    private Stack<Integer> stack0;
    private Stack<Integer> stack1;

    public twoStackAsQueue( Stack<Integer> stack0,Stack<Integer> stack1){
        this.stack0 = stack0;
        this.stack1 = stack1;
    }

    public twoStackAsQueue(){
    }

    public  void add(Integer num){
        stack0.push(num);
    }

    public Integer poll(){
        return null;
    }

    public static void main(String[] args) {
        Queue<Integer> q;

        Stack<Integer> s;

    }

}
