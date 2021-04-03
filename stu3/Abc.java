import java.util.Scanner;
import java.util.Random;

 public class Abc {
 	 public static void main1(String[] args) {
 	 	//斐波那契
 	 	Scanner pc=new Scanner(System.in);
	    int n=pc.nextInt();
            int ret=fib(n);
            System.out.print(ret);
         }
          public static int fib(int n){
          	if(n==1||n==2){
          		return 1;
          	}else {
                int m = fib(n - 1) + fib(n - 2);
                return m;
            }
    }
 	public static void main2(String[] args) {
 		//方法调用求阶乘和
 		Scanner pc=new Scanner(System.in);
	    int num=pc.nextInt();
 		int sum=0;
 		for(int i=1;i<=num;i++){
 			sum=sum+fac(i);
 		}
 		System.out.println(sum);
 	}
 	// public static int fac(int n){
 	// 	int ret=1;
 	// 	for(int i=1;i<=n;i++){
 	// 		ret=ret*i;
 	// 	}
 	// 	return ret;
 	// }
 	public static void main3(String[] args) {
 		//递归求阶乘
 		Scanner pc=new Scanner(System.in);
	   	int n=pc.nextInt();
	   	int ret=fac(n);
	   	System.out.println(ret);
 	}
 	public static int fac(int n){
 		if(n==1){
 			return 1;
 		}else {
 			return n*fac(n-1);
 		}
 	}
 	public static void main4(String[] args) {
 		//登录
 		String password="1127";
 		for(int i=2;i>=0;i--){
 			Scanner pc=new Scanner(System.in);
 			System.out.print("请输入四位数密码：");
 			String inputWord=pc.next();
 			if(inputWord.equals(password)){
 				System.out.println("登录成功！");
 				break;
 			}else if(i==0){
 				System.out.println("对不起，三次密码输入错误!");
 			}else{
 				System.out.println("输入错误，还有"+i+"次机会");
 			}
 		}

 	}
 	public static void main5(String[] args) {
 		//判断年龄
 		Scanner pc=new Scanner(System.in);
	  	int age=pc.nextInt();
	  	if(age>0&&age<=18){
	  		System.out.println("少年");
	  	}else if(age<=28){
	  		System.out.println("青年");
	  	}else if(age<=55){
	  		System.out.println("中年");
	  	}else {
	  		System.out.println("老年");
	  	}
 	}
	public static void main6(String[] args) {
		//2-100的素数
		int count=0;
		int i;
		for(int num=2;num<100;num++){
			for(i=2;i<num;i++){
				if(num%i==0){
					break;
				}
			}
			if(i==num){
				count++;
				System.out.print(num+"\t");
				if(count%5==0){
					System.out.println();
				}
			}
		}
	}
 	public static void main7(String[] args) {
 		//拆分整数每一位
 		Scanner pc=new Scanner(System.in);
 	 	int x=pc.nextInt();
 	 	while(x!=0){
 	 		int num=x%10;
 	 		System.out.print(num+" ");
 	 		x=x/10;
 	 	}
 	}
 	public static void main8(String[] args) {
 		//打印n的乘法表
 		Scanner pc=new Scanner(System.in);
 		int n=pc.nextInt();
 		for(int i=1;i<=n;i++){
 			for(int j=1;j<=i;j++){
 				System.out.print(j+"*"+i+"="+(i*j)+" ");
 			}
 			System.out.println();
 	    }
 	}
	public static void main9(String[] args) {
		//求和
		int sign=1;
		double deno=2.0,sum=1.0,term=1.0;
		while(deno<=100){
			sign=-sign;
			term=sign/deno;
			sum=sum+term;
			deno=deno+1;
		}
		System.out.println(sum);
	}
	public static void main10(String[] args) {
		//打印水仙花（三位数）
		for(int n=0;n<=999;n++){
			int i=n/100;
			int j=n/10-i*10;
			int k=n%10;
			if(n==i*i*i+j*j*j+k*k*k)
				System.out.println(n);
		}
	}
	public static void main11(String[] args) {
		//求1001以内9的个数
		int times=0;
		for(int i=1;i<=100;i++){
			if(i/10==9){
				times++;
			}
			if(i%10==9){
				times++;
			}
		}
		System.out.println(times);
	}
	public static void main12(String[] args) {
		//判断闰年1000-2000
		int year=1000;
		for(;year<=2000;year++){
			if((year%4==0&&year%100!=0)||(year%400==0)){
				System.out.print(year+" ");
			}
		}
	}
	public static void main13(String[] args) {
		//求最大公约数
		Scanner pc=new Scanner(System.in);
		Scanner wc=new Scanner(System.in);
		int a=pc.nextInt();
		int b=wc.nextInt();
		int t;
		if(a<b){
			t=a;
			a=b;
			b=t;
		}
		while(a%b!=0){
			t=a%b;
			a=b;
			b=t;
		}
		System.out.println(b);
	}
	public static void main(String[] args) {
		int sum=0;
		int num=1;
		while(num<=5){
			int ret=1;
			int i=1;
			while(i<=num){
				ret=ret*i;
				i++;
			}
			sum=sum+ret;
			num++;
		}
		System.out.println(sum);
	}
}

