package study3;

import java.util.Scanner;

public class Test3 {
    public static String reverse(String str, int start, int end) {
        char[] ch = str.toCharArray();
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        //return new String(ch);
        return String.copyValueOf(ch);
    }
    public static String reverseKo(String str, int k) {
        if (str == null || k <= 0 || k >= str.length()) {
            return null;
        }
        str = reverse(str, 0, k - 1);
        str = reverse(str, k, str.length() - 1);
        str = reverse(str, 0, str.length() - 1);
        return str;
    }

    public static void main(String[] args) {
//3.String/StringBuilder/StringBuffer
        StringBuffer str =new StringBuffer("hellokworld");
        System.out.println(str.delete(5,6));//[5,10)
        System.out.println(str.insert(0,"你好"));
        /*String st="abc";
        StringBuilder str1=new StringBuilder();
        str1.append(st).append("def");//String-->StringBuilder
        st=str1.toString();//StringBuilder-->String
        System.out.println(st);*/
        /*StringBuffer str=new StringBuffer();//String-->StringBuffer
        String ret=str.append("defg").append("abc").toString();//StringBuffer-->String
        System.out.println(ret);*/
//2.2
        /*Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String str = scanner.next();
        String ret = reverseKo(str, k);
        System.out.println(ret);*/
//2.1输入3和字符串abcdefg--->defgabc
        /*String str="abcdefg";
        String ss=str.substring(0,3);//[0,1,2]
        System.out.println(ss);
        String ret=reverse(ss,0,ss.length()-1);
        System.out.println(ret);
        String ss1=str.substring(3,7);//[3,4,5,6]
        System.out.println(ss1);
        String ret1=reverse(ss1,0,ss1.length()-1);
        System.out.println(ret1);
        String ret2=ret.concat(ret1);
        System.out.println(ret2);
        System.out.println(reverse(ret2,0,ret2.length()-1));*/
//1.字符串逆置abcdef-->fedcba
        /*String str="abcdef";
        String ret=reverse(str,0,str.length()-1);
        System.out.println(ret);*/
    }
}
