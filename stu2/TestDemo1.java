import java.util.Scanner;

public class TestDemo1 {

    public static int findOnce(int[] arr){
        int num=0;
        for(int i=0;i<arr.length;i++){
            num=num^arr[i];
        }
        return num;
    }

    public static void swap(int [] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j) {
            while (i < j && arr[i] % 2 != 0) {
                i++;
            }
            while (i < j && arr[j] % 2 == 0) {
                j--;
            }
            int k = arr[i];
            arr[i] = arr[j];
            arr[j] = k;
        }
    }

    public static int max2(int a,int b){
        int ret=a>b?a:b;
        return ret;
    }
    public static int max3(int a,int b,int c){
        int result=max2(a,b);
        int max=max2(c,result);
        return max;
    }

    public static void main(String[] args) {
        //3.调用
        int num=max3(23,45,66);
        System.out.println(num);
        //2.调整数组顺序，奇数在偶数前面
//        int[] arr={1,3,4,5,6,7};
//        swap(arr);
//        for(int n=0;n<arr.length;n++){
//            System.out.print(arr[n]+" ");
//        }
        //1.有一组数据，只有一个出现一次，其他都是两次，请找出这个数
//        int[] arr={11,22,3,11,22};
//        int ret=findOnce(arr);
//        System.out.println(ret);
    }
}
