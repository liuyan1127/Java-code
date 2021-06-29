package data33;

import java.util.LinkedList;
import java.util.Queue;
//用队列实现栈
public class MyQueueStack {
    private Queue<Integer> queue;
    public MyQueueStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {//元素入栈
        queue.add(x);
    }

    public int pop() {//移除栈顶元素
        int size = queue.size();
        for (int i = 0; i < size - 1; i++) {
            Integer e = queue.remove();
            queue.add(e);
        }
        return queue.remove();
    }

    public int top() {//获取栈顶元素
        int size = queue.size();
        for (int i = 0; i < size - 1; i++) {
            Integer e = queue.remove();
            queue.add(e);
        }
        Integer t = queue.remove();
        queue.add(t);
        return t;
    }

    public boolean empty() {//返回栈是否为空
        return queue.isEmpty();
    }
}
