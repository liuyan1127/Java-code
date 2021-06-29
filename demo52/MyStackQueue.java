package data33;

import java.util.Deque;
import java.util.LinkedList;
//用栈实现队列
public class MyStackQueue {
    private Deque<Integer> s1;  // 准备出的
    private Deque<Integer> s2;  // 优先放的

    public MyStackQueue() {
        s1 = new LinkedList<>();//出
        s2 = new LinkedList<>();
    }

    public void push(int x) {//将元素放入队尾
        s2.push(x);
    }

    public int pop() {//首部移除元素
        if (s1.isEmpty()) {
            while (!s2.isEmpty()) {
                Integer e = s2.pop();
                s1.push(e);
            }
        }
        return s1.pop();
    }

    public int peek() {//返回队列首部元素
        if (s1.isEmpty()) {
            while (!s2.isEmpty()) {
                Integer e = s2.pop();
                s1.push(e);
            }
        }
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
