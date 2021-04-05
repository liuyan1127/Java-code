package stu5;

import java.util.Arrays;

public class TestDemo5 {
    public static void swap(int[] arr1){
        int tmp=arr1[0];
        arr1[0]=arr1[1];
        arr1[1]=tmp;
    }

    public static String myString(int[] arr){
        if(arr==null){
            return null;
        }
        if(arr.length==0){
            return "[]";
        }
        String ret="[";
        for(int i=0;i<arr.length;i++){
            if(i!=arr.length-1){
                ret=ret+arr[i]+", ";
            }else{
                ret=ret+arr[i]+"]";
            }
        }
        return ret;
    }

    public static int jump(int n) {
        if (n==1||n==2) {
            return n ;
        }
        return jump(n - 1) + jump(n - 2);
    }

    public static int[] copyArr(int[] arr){
        int[] arr2=new int[arr.length];
        System.out.println(Arrays.toString(arr2));
        for(int i=0;i<arr.length;i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }
    public static void main(String[] args) {
        //4.5范围拷贝
        int[] arr={1,2,3,4,5};
        int[] arr1=Arrays.copyOfRange(arr,2,4);//[2,4)
        System.out.println(Arrays.toString(arr1));
        //4.4clone拷贝
       /* int[] arr1=arr.clone();
        System.out.println(Arrays.toString(arr1));*/
        //4.3System拷贝
       /* int[] arr1=new int[arr.length];
        System.arraycopy(arr,0,arr1,0,arr.length);
        System.out.println(Arrays.toString(arr1));*/
        //4.2Arrays.copyOf拷贝
        /*int[] ret=Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(ret));*/
        //4.1数组for循环拷贝
        /*int[] res=copyArr(arr);
        System.out.println(Arrays.toString(res));*/
        //3.青蛙跳台阶
         /*Scanner scan=new Scanner(System.in);
         System.out.print("请输入台阶数：");
         int num=scan.nextInt();
         System.out.println("跳法有"+jump(num)+"种");*/
        //2.2自己实现数组转字符串
        /*int[] arr=null;
        int[] arr={};
        int[] arr={1,2,3};
        String str=Arrays.toString(arr);
        System.out.println(str);
        System.out.println();
        String result=myString(arr);
        System.out.println(result);*/
        //2.1数组转字符串
        /*int[] arr={1,2,3};
        System.out.println(Arrays.toString(arr));*/
        //1.交换两个数字
        /*int[] arr={10,20};
        System.out.println(arr[0]+" "+arr[1]);
        swap(arr);
        System.out.println(arr[0]+" "+arr[1]);*/

    }
}
