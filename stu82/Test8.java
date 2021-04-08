package stu8_2;
//类和对象的学习
class Person{
    public String name;//成员变量、字段、成员属性（堆）
    private int age=22;//封装
    //public static int phone=11;//静态成员变量，不属于对象（放在方法区）
    /* public int getAge(){
        return age;
    }
    public void setAge(int myAge){
        age=myAge;
    }*/
    //alt+insert快捷键自动生成get,set
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //自动重写tostring方法
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //构造方法，支持重载
    public Person() {
//        this("hhh");//此处指调用带有一个参数的构造方法，而且必须写在第一行
        System.out.println("every1");
    }

    public Person(String name) {
        System.out.println("every2");
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    static {//同时为static定义，执行看定义顺序,后定义的被打印
        phone=1;
        System.out.println("静态代码块every4");
    }
    {
        this.age=2;
        System.out.println("实例代码块every3");
    }
    public static int phone=11;
    public void eat(){//成员方法
        int a=10;//局部变量（栈）
        System.out.println("成员吃饭"+a);
    }
    public void sleep(){
        //public static int phone;非静态方法内部，不能定义静态变量
        //phone=20;非静态方法可以访问静态变量
        System.out.println("成员睡觉");
        play();//非静态方法可以调用静态方法，相反不能调用
    }
    public static void play(){//静态方法
        System.out.println("静态打游戏");
        //phone=20;静态方法可以使用更改静态成员变量，但静态不能使用非静态成员
    }
}

public class Test8 {
    public static void fun(int[] arr){

    }
    public static void fun1(int...a){//可变参数编程

    }
    
    public static void main(String[] args) {
        int[] arr={1,2,3};
        fun(arr);

        fun(new int[]{1,2,3,4});//匿名数组
        //new Person().eat();//匿名对象
        //Person per=new Person();//new实例化对象，创建一个对象  per对象在栈上
        //System.out.println("======");
        //Person per1=new Person();//静态只执行一次，不论new几个对象
        //System.out.println(per);
        //per.age=15;
        //per.name="haha";
        //System.out.println(per.age);
//        System.out.println(per.name);
//        per.eat();
//        per.sleep();
//        Person.phone=10;
        //System.out.println(Person.phone);
//        Person.play();
//        Person person2=new Person("hello");
//        System.out.println(person2);
//        Person person3=new Person("world",10);
//        System.out.println(person3);
//        per.setAge(50);
        //System.out.println(per.getAge());
    }
}
