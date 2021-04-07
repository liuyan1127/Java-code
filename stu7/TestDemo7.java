package stu7;

import java.util.Arrays;

public class TestDemo7 {
    public static boolean isSort(int[] arr) {
        if(arr==null||arr.length==0){
            return false;//标识
        }
        for (int i = 0; i < arr.length-1; i++) {//[0,7)-->[0,6)  0,1;1,2;2,3;3,4;4,5;6,7
            if (arr[i]>arr[i + 1]) {//检查是否升序
                return false;
            }
        }
        return true;
    }

    public static void bubSort(int[] arr1) {
        boolean sign=true;
        for (int i = 0; i < arr1.length - 1; i++) {
            sign=true;
            for (int j = 0; j < arr1.length - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1]) {//升序冒泡（降序arr[j]<arr[j+1])
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                    sign=false;
                }
            }
            if(sign=true){//判断此时是否有序，若有序，不进行冒泡
                break;
            }
        }
    }

    public static void mySwap(int[] arr,int[] brr) {
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            arr[i]=brr[i];
            brr[i]=temp;
        }
    }

    public static void myReverse(int[] arr1){
        int i=0;
        int j=arr1.length-1;
        while (i<j){
            int temp=arr1[i];
            arr1[i]=arr1[j];
            arr1[j]=temp;
            i++;
            j--;
        }
    }
    public static void myShow(int[][] arr1){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //5.二维数组
        //int[][] array=new int[2][3];//默认都是0
        //int[][] array1=new int[2][];//不规则二维数组
        //int[][] arr={{1,2,3},{4,5,6}};
        int[][] arr2=new int[][]{{11,22,33},{41,51,61}};
        myShow(arr2);
        System.out.println("=====================");
        System.out.println(Arrays.deepToString(arr2));
        //4.将数组元素逆序排列
        /*int[] arr={1,2,3};
        System.out.println(Arrays.toString(arr));
        myReverse(arr);
        System.out.println(Arrays.toString(arr));*/
        //3.交换数组内容
         /*int[] arr={1,2,3};
         int[] brr={11,22,33};
         mySwap(arr,brr);
         System.out.println("arr:"+Arrays.toString(arr));
         System.out.println("brr:"+Arrays.toString(brr));*/
        //2.冒泡排序
        /*int[] arr={12,2,36,99,1,6,75};
        bubSort(arr);
        System.out.println(Arrays.toString(arr));*/
        //1.检查有序性
        /*int[] arr={12,21,36,999,51,66,75};
        System.out.println(isSort(arr));*/
    }
}
