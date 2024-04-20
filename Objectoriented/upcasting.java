package Objectoriented;

public class upcasting {
    public static void main(String[] args) {
        Person p = new Person();
        //student 是 person 继承下来的，所以可以这样指向 向上转型
        //向上转型实际上是把一个子类型安全地变为更加抽象的父类型
        Person p1 = new Student();
    
        //如果把一个父类类型强制转型为子类类型，就是向下转型（downcasting
        //不能 Student s1 = (Student) p;//runtime error! ClassCastException! 因为p本来就是父类 子类功能比父类多，多的功能无法凭空变出来
        //向下转型很可能会失败。失败的时候，Java虚拟机会报ClassCastException。
        //为了避免向下转型出错，Java提供了instanceof操作符，可以先判断一个实例究竟是不是某种类型：
        Student s1 = (Student) p1;
        System.out.println(s1 instanceof Person);//true
        System.out.println(p instanceof Person); // true
        System.out.println(p instanceof Student); // false
        //从Java 14开始，判断instanceof后，可以直接转型为指定变量，避免再次强制转型。
        Object obj = "hello";
        if (obj instanceof String s) {      //这里报错好像得16以上
            // 可以直接使用变量s:
            System.out.println(s.toUpperCase());
        }
    }

}

class Person{
    protected  int      age;
    protected  String   name;
}

class Student extends Person{
    public int score;
}

class Teacher extends Person{
    public String subject;
}
