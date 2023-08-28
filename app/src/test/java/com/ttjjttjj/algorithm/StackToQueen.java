package com.ttjjttjj.algorithm;

import java.util.Stack;

/**
 * https://leetcode.cn/problems/implement-stack-using-queues/
 *
 * 225. Implement Stack using Queues
 *
 */
public class StackToQueen {

    /*用栈实现一个队列*/
    public static class DoubleStackQueen{
        public Stack<Integer> stackPush;
        public Stack<Integer> stackPop;
        public DoubleStackQueen() {
            this.stackPush = new Stack<Integer>();
            this.stackPop =  new Stack<Integer>();
        }
        public void pushToPop(){
            if(this.stackPush.isEmpty()){
                throw new RuntimeException("Your Queen is empty !");
            }
            // 从一个栈的顶部到底部，一个个循环添加到另外一个栈中，完成倒叙的，例如加入1-7，那么stackPush压栈从顶到底就是7-1，
            // 然后循环pop读取栈顶数据并删除，添加到stackPop栈中，就是从7-1变为1-7
            while(!this.stackPush.isEmpty()){
                this.stackPop.push(this.stackPush.pop());
            }
        }
        public void popToPush(){
            if(this.stackPop.isEmpty()){
                return;
            }
            // 重新方到stackPush栈中
            while(!this.stackPop.isEmpty()){
                this.stackPush.push(this.stackPop.pop());
            }
        }
        public void add(int pushInt){
            this.stackPush.push(pushInt);
            System.out.println("add---> pushInt=" + pushInt);
        }
        public int poll(){
            System.out.println("add---> poll");
            pushToPop();
            // read and remove first item
            int value =  this.stackPop.pop();
            popToPush();
            return value;
        }

        public int peek(){
            pushToPop();
            int value =  this.stackPop.peek();
            popToPush();
            return value;
        }
    }

    public static void main(String[] args) {
        DoubleStackQueen queen = new DoubleStackQueen();
        queen.add(1);
        queen.add(2);
        queen.add(3);
        queen.add(4);
        queen.add(5);
        queen.add(6);
        queen.add(7);
        System.out.println(queen.poll());
        queen.add(8);
        System.out.println(queen.poll());
        System.out.println(queen.poll());
        System.out.println(queen.poll());
        System.out.println(queen.poll());
        System.out.println(queen.poll());
        System.out.println(queen.poll());
        System.out.println(queen.poll());
    }
}
