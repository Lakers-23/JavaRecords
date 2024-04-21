package base;
//在继承关系中，子类如果定义了一个与父类方法签名完全相同的方法，被称为覆写（Override）
public class duotai {
    public static void main(String[] args) {
        Person p = new Student();
        p.run(); // 应该打印Student.run
        //如何确定这个run的方法是子类Student还是父类Person的呢？
        //java的实例方法调用是基于运行时的实际类型的动态调用Student、而非变量的声明类型Person
    }
}

class Person {
    public void run() {
        System.out.println("Person.run");
    }
}
//Override和Overload不同的是，如果方法签名不同，就是Overload（重载），Overload方法是一个新方法；
//如果方法签名相同，并且返回值也相同，就是Override。
//方法名相同，方法参数相同，但方法返回值不同，也是不同的方法。在Java程序中，出现这种情况，编译器会报错。
class Student extends Person {
    //加上@Override可以让编译器帮助检查是否进行了正确的覆写。 但是@Override不是必需的。
    @Override   
    public void run() {
        System.out.println("Student.run");
    }
    //Overload
    public void run(String name){
        System.out.printf(name, ".run");
    }
}
