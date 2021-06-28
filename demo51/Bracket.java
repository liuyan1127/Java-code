package data33;

import java.util.Deque;
import java.util.LinkedList;

//栈和队列  1.括号匹配问题
public class Bracket {
    public boolean isMatching(String str){
        // 1. 准备好一个栈
        Deque<Character> stack = new LinkedList<>();
        // 2. 遍历 str 的每一个字符
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                default: {
                    // 走到右括号
                    if (stack.isEmpty()) {
                        return false;
                    }
                    // 取出栈顶元素
                    char left = stack.pop();
                    // 进行左右括号的比较
                    if (!compareBracket(left, c)) {
                        // 左括号和右括号不匹配
                        return false;
                    }
                }
            }
        }
        //已经遍历完了字符
        if (stack.isEmpty()) {
            return true;
        } else {
            // 左括号多了
            return false;
        }
    }

    private boolean compareBracket(char left, char right) {
        if (left == '(' && right == ')') {
            return true;
        }
        if (left == '[' && right == ']') {
            return true;
        }
        if (left == '{' && right == '}') {
            return true;
        }
        return false;
    }
}
