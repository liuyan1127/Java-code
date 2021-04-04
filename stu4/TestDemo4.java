import java.util.Arrays;
import java.util.Scanner;

public class TestDemo4 {

    public static int add(int a,int b){
        int s=a+b;
        return s;
    }
    public static double add(double a,double b){
        double u=a+b;
        return u;
    }
    public static double add(double a,double b,double c){
        double t=a+b+c;
        return t;
    }

    public static int sum(int num){
        if(num==1){
            return 1;
        }
        return num+sum(num-1);
    }

    public static int addSum(int num){
        if(num<9){
            return num;
        }
        return num%10+addSum(num/10);
    }

    public static void move(char place1,char place2){
        System.out.print(place1+"->"+place2+" ");
    }
    public static void hanoi(int n,char place1,char place2,char place3){
        if(n==1){
            move(place1,place3);
        }else{
            hanoi(n-1,place1,place3,place2);
            move(place1,place3);
            hanoi(n-1,place2,place1,place3);
        }
    }
    public static void fun(int[] arr){//传的是引用
        arr[1]=88;
    }

    public static int[] fun2(int[] arr2){
        for(int i=0;i<arr2.length;i++){
            arr2[i]=arr2[i]*2;
        }
        return arr2;
    }
    public static int[] fun3(int[] arr1){
        int[] array=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            array[i]=arr1[i]*2;
        }
        return array;
    }

    public static void main(String[] args) {
        //6.将数组的每个元素*2
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(fun3(arr)));//不改变原数组
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(fun2(arr)));//改变原数组
        System.out.println(Arrays.toString(arr));
        //5.数组传参
       /* int[] arr={1,2,3};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        fun(arr);
        System.out.println();
        for(int i:arr){
            System.out.print(i+" ");
        }*/
        //4.汉诺塔
        /*hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');*/
        //3.递归1+2+3+...+n
        //2.1234-->10
        /*Scanner pc=new Scanner(System.in);
        int n=pc.nextInt();
        //int ret=sum(n);
        int ret=addSum(n);
        System.out.println(ret);
        System.out.println(ret);*/
        //1.重载
        /*int t =add(11,22);
        System.out.println(t);
        double m=add(1.0,2.3);
        System.out.println(m);
        double n=add(1.4,2.0,3.0);
        System.out.println(n);*/
    }
}
