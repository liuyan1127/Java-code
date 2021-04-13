package study4;
//内部类学习（四种）
//本地内部类不常用

/*class OuterClass{
    public int data1=999;
    private int data2;
    public static int data6;

    public void func(){

    }*/

    /*static class InnerClass2{//静态内部类
        public int data4;
        private int data1;
        public static int data6=8888;

        //OuterClass out;
        OuterClass out=new OuterClass();
        *//*public InnerClass2(OuterClass o){
            this.out=o;
        }*//*
        public void func(){
            System.out.println("静态内部类func");

            System.out.println(data1);
            System.out.println(this.data1);
            System.out.println(this.out.data1);

            System.out.println(data4);

            System.out.println(data6);
            System.out.println(OuterClass.data6);
        }
    }*/
    /*class InnerClass{//实例内部类
        public int data1=100;
        public int data4;
        private int data5;
        public static final int data6=10;//1.

        public void func2(){
            System.out.println(data1);
            System.out.println(data2);
            System.out.println(data3);
            System.out.println(data4);
            System.out.println(data5);
            System.out.println(data6);
            System.out.println(this.data1);
            System.out.println(OuterClass.this.data1);//3.
        }
    }*/
//}
class OuterClass3 {
    public void func() {
        System.out.println("class3的匿名类");
    }
}
public class Test4 {
    public static void main(String[] args) {
        new OuterClass3();//匿名对象
        new OuterClass3(){//匿名内部类
            public int data1;

            @Override
            public void func() {
                System.out.println("重写了Class3的方法");
            }
        }.func();
        /*OuterClass.InnerClass2 innerClass=new OuterClass.InnerClass2(new OuterClass());//静态内部类对象
        OuterClass.InnerClass2 innerClass=new OuterClass.InnerClass2();
        innerClass.func();*/
        /*OuterClass outerClass=new OuterClass();
        OuterClass.InnerClass innerClass=outerClass.new InnerClass();//2.实例化内部类对象
        innerClass.func2();*/
    }
}
