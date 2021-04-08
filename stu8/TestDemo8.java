package stu8_1;

class MyChange{
    //public int num;
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

public class TestDemo8 {

    /*public static void swap(MyChange change,MyChange change1){
        int temp=change.getNum();
        change.setNum(change1.getNum());
        change1.setNum(temp);
    }
    public static void main(String[] args) {
        //1.2
        MyChange a=new MyChange();
        a.setNum(20);
        MyChange b=new MyChange();
        b.setNum(30);
        System.out.print(a.getNum()+" "+b.getNum());
        swap(a,b);
        System.out.println();
        System.out.print(a.getNum()+" "+b.getNum());
    }*/
    /*public static void swap(MyChange change,MyChange change1){
        int temp=change.num;
        change.num=change1.num;
        change1.num=temp;
    }
    public static void main(String[] args) {
        //1.1交换两个数字
        MyChange a=new MyChange();
        a.num=10;
        MyChange b=new MyChange();
        b.num=20;
        System.out.print(a.num+" "+b.num);
        swap(a,b);
        System.out.println();
        System.out.print(a.num+" "+b.num);
    }*/
}
