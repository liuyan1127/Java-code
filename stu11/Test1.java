package study1;

import java.util.Arrays;
//1.自定义类型对象比较Comparable
class Student implements Comparable<Student>{
    public String name;
    public int age;
    public double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age == o.age) {
            return 0;
        } else {
            return -1;
        }
    }
}
//2.Cloneable接口
class Person implements Cloneable{
    public String name;
    public Money m;

    public Person(String name) {
        this.name = name;
        this.m=new Money();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //2.2
        Person person=(Person) super.clone();
        person.m=(Money) this.m.clone();
        return person;
        //2.1
        //return super.clone();
    }
}
//2.1浅拷贝
/*class Money{
    public double money=12.6;
}*/
//2.2深拷贝
class Money implements Cloneable{
    public double money=12.6;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class Test1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //2.
        Person person=new Person("liu");
        Person person1=(Person)person.clone();
        //System.out.println(person1);
        System.out.println(person.m.money);
        System.out.println(person1.m.money);
        person1.m.money=18.9;
        System.out.println(person.m.money);
        System.out.println(person1.m.money);
        //1.
        /*Student[] student=new Student[3];
        student[0] = new Student("liu", 13, 67.9);
        student[1] = new Student("wang", 10, 37.9);
        student[2] = new Student("yang", 23, 97.9);
        System.out.println(Arrays.toString(student));
        Arrays.sort(student);
        System.out.println("==========");
        System.out.println(Arrays.toString(student));*/
    }
}
