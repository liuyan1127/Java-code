package study2;
//字符串的使用
import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static boolean isNumber(String str) {
        //1.3.1
        char[] chars=str.toCharArray();
        for(int i=0;i<chars.length;i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
            return true;
        //1.3.2
       /* for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch<'0'||ch>'9'){
                return false;
            }
        }
        return  true;*/
    }
    public static String func(String str){
        String ret="";
        String[] s=str.split(" ");
        for(String ss:s){
            ret=ret+ss;
        }
        return ret;
    }
//自己实现以空格进行拆分的方法
//    public static String[] mySplit(String splitStr){
//
//    }
    public static void main(String[] args) {
//7.截取字符串
        String str="abcdefgh";
        System.out.println(str.substring(5));//从5到结尾
        System.out.println(str.substring(0,5));//[0,5)
//8.其他方法
        /*String str="  abc defg";
        System.out.println(str.trim());//去掉首空格
        String str1="abc";
        System.out.println(str1.toUpperCase());//转大写
        String str2="ABC DEF";
        System.out.println(str2.toLowerCase());//转小写
        System.out.println(str1.concat("defh"));//拼接
        String str3="";
        System.out.println(str3.isEmpty());
        System.out.println(str1.isEmpty());*/
//6.2用字符串库函数实现拼接两个字符串(每一行包括两个字符串）
       /*Scanner scanner=new Scanner(System.in);
       String str= scanner.nextLine();
       String ret=func(str);
       System.out.println(ret);*/
//6.1字符串拆分
        /*String str ="liu 21-study#java";
        String[] ret =str.split(" |-|#");
        for(String st:ret){
            System.out.println(st);
        }*/
        /*String str="liu#21-study#java";
        String[] ret=str.split("-");
        for(String r:ret){
            System.out.println(r);
        }
        for(String s:ret){
            String[] ss=s.split("#");
            for(String sss:ss){
                System.out.println(sss);
            }
        }*/
        /*String str1="192-168-0-1-1";
        String[] arr=str1.split("-");*/
        /*String str="192.168.0.1";
        String[] arr=str.split("\\.");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/
       /*String str="abc def gh jk lmn";
       String[] ret=str.split(" ");
       String[] ret=str.split(" ",3);
       for(String s:ret){
           System.out.println(s);
       }*/
//5.字符串替换
       /* String str="abcdabc";
        System.out.println(str.replaceAll("ab","tt"));
        String str1="abcdab";
        String ret=str.replaceFirst("ab","gg");
        System.out.println(ret);*/
//4.字符串查找
        /*String str="abcdcd";
        System.out.println(str.contains("cde"));
        System.out.println(str.indexOf("cd"));
        System.out.println(str.indexOf("cd",2));
        System.out.println(str.lastIndexOf("cd"));
        System.out.println(str.lastIndexOf("cd",3));
        System.out.println(str.startsWith("abd"));
        System.out.println(str.startsWith("cd",2));
        System.out.println(str.endsWith("cd"));*/
//3.字符串比较
        /*String str="abcdef";
        String str1="Abcdef";
        System.out.println(str.equals(str1));//false
        System.out.println(str.equalsIgnoreCase(str1));//true,不分大小写
        System.out.println(str.compareTo(str1));*/
//2.2字符串变字节
        /*String str1="abcde";
        byte[] bytes=str1.getBytes();
        System.out.println(Arrays.toString(bytes));*/
 //2.1字节变字符串
        /*byte[] bytes1={97,98,99,100};
        String str=new String(bytes1);
        System.out.println(str);*/
//1.3给定字符串，判断是否全部由数字组成
        /*Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        System.out.println(isNumber(str));*/
//1.2字符串转字符
       /* String str2="hello";
        char ch=str2.charAt(0);
        System.out.println(ch);
        char[] chars=str2.toCharArray();*/
        //变字符数组
        //System.out.println(Arrays.toString(chars));
//1.1字符变字符串
        /*char[] value={'a','b','c'};
        String str=new String(value);
        System.out.println("字符串："+str);
        String str1=new String(value,1,1);//不能越界
        System.out.println(str1);*/
    }
}
