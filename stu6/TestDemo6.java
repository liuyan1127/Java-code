package stu6;

import java.util.Arrays;
import java.util.Scanner;

public class TestDemo6 {
    public static int[] myNew(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
        return arr;
    }

    public static int mySum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    public static double myAverage(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        double average=sum*1.0/(arr.length);
        return average;
    }

    public static int myMax(int[] arr){
        if(arr==null||arr.length==0){
            return -1;//标识
        }
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int myIndex(int[] arr,int key){
        if(arr==null||arr.length==0){
            return -1;//标识
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int binarySe(int[] arr,int num) {
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(num<arr[mid]){
                right=mid-1;
            }else if(num>arr[mid]){
                left=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
  }

    public static void main(String[] args) {
        //5.3调用方法求下标，手动输入数组
        int[] arr=new int[5];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);//使数组有序
        System.out.println(Arrays.toString(arr));
        int index=Arrays.binarySearch(arr,3);
        System.out.println(index);
        //5.2二分查找（有序数组）
        /*int[] arr={12,21,36,39,51,66,75};
        int index= binarySe(arr,51);
        System.out.println(index);*/
        //5.1查找指定元素下标（顺序查找，可能需要遍历整个数组）
        /*int[] arr={11,22,33,44,55,33};
        int index=myIndex(arr,34);
        System.out.println(index);*/
        //4.求数组最大值
        /*int[] arr={1,2,3,4,5};
        int max=myMax(arr);
        System.out.println(max);*/
        //3.求数组平均值
        /*int[] arr={1,21,31,4,5};
        double ret=myAverage(arr);
        System.out.println(ret);*/
        //2.求数组和
        /*int[] arr={1,2,3,4,5};
        int ret=mySum(arr);
        System.out.println(ret);*/
        //1.创建1-100的数组
        /*int[] arr=new int[100];
        myNew(arr);
        System.out.println(Arrays.toString(arr));*/
    }
}
