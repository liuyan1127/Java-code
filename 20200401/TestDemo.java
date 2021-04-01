import java.util.Random;
import java.util.Scanner;
public class TestDemo {
	public static void main(String[] args) {
		//分别输出二进制序列中，偶数位和奇数位
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=1;i<=31;i+=2){
			int n = (num>>i)&1;
			System.out.print(n+" ");
		}
		System.out.println();
		for(int i=0;i<=30;i+=2){
			int n = (num>>i)&1;
			System.out.print(n+" ");
		}
		
	}
	public static void main4(String[] args) {
		//求一个数二进制中1的个数
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;
		while (num != 0) {
			count++;
			num = num & (num-1);
		}
		// for(int i=0;i<31;i++){
		// 	if(((num>>i)&1) !=0) {
		// 		count++;
		// 	}
		// }
		System.out.println(count);
	}
	public static void main3(String[] args) {
		//水仙花
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
		for(int i=0;i<=num;i++){
			int count=0;
			int n=i;
			while(n!=0){
				n=n/10;
				count++;
			}
			n=i;
			int sum=0;
			while(n!=0){
				sum+=Math.pow(n%10,count);
				n=n/10;
			}
			if(sum==i){
				System.out.println(i);
			}
		}
	}
	public static void main2(String[] args) {
		//判断素数
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
		if(num<=1){
			System.out.println("num不是素数！" + num);
		}else if(num==2){
			System.out.println("num是素数！" + num);
		}else{
		int i=2;
		//i<num    i<num/2   i<开平方
		for(; i <=Math.sqrt(num);i++){
			if(num % i==0){
				System.out.println(num +"不是素数！");
				break;
			}
		}
		if(i>Math.sqrt(num)){
			System.out.println(num +"是素数！" );
		}
	}
}
	public static void main1(String[] args) {
		//猜数字
		Scanner scan =new Scanner(System.in);
		Random rnd =new Random();
		int random=rnd.nextInt(100)+1;
		while(true){
			System.out.println("数字：");
			int n =scan.nextInt();
			if(n<random){
				System.out.println("猜小了：");
			}else if(n==random){
				System.out.println("猜对了：");
				break;
			}else{
				System.out.println("猜大了！：");
			}
		}
	}
}

