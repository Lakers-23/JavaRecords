package coreJava.chapters4;

import java.util.*;

public class ConstructorTest {
    public static void main(String[] args) {
        Emplyee2[] staff = new Emplyee2[3];

        staff[0] = new Emplyee2("Harry", 40000);
        staff[1] = new Emplyee2(6000);
        staff[2] = new Emplyee2();

        for(Emplyee2 e : staff)
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
            + e.getSalary());
    }
}

class Emplyee2{
    private static int nextId;

    private int id;
    //实例字段初始化块
    private String name = "";
    private double salary;
    //静态初始化块
    static
    {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }
    //对象初始化块
    {
        id = nextId;
        nextId++;
    }

    public Emplyee2(String n, double s){
        name = n;
        salary = s;
    }
    //重载构造器
    public Emplyee2(double s){
        //用this(...)调用另一个构造器
        this("Employee #" + nextId, s);
    }
    //无参数构造器
    public Emplyee2() {

    }

    public String getName(){
        return name;
    }
    public Double getSalary(){
        return salary;
    }
    public int getId(){
        return id;
    }
}
