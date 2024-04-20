package Objectoriented;
/*
 * 构造方法
 * 创建实例的时候就把内部字段全部初始化为合适的值
 */
public class Methods2 {
    public static void main(String[] args) {
        /*如果类本身就对字段进行了初始化，然后又有构造方法，那初始化的顺序是什么？
         * 1、先初始化字段
         * 2、执行构造方法的代码进行初始化
         */
        Person p = new Person("Xiao Ming", 15);
        System.out.println(p.getName());
    }
}

class Person{
    private String name;
    private int age;

    /*构造方法的名称就是类名，参数没有限制，方法内部也可以编写任意语句，
        但是构造方法没有返回值，也没有void 调用构造方法必须用new操作符 
        如果没有定义构造方法，编译器会自动生成一个方法体内啥也没有的默认构造方法
        如果定义了，编译器就不再自动创建默认构造方法；
        如果既要能使用带参数的构造方法，又想保留不带参数的构造方法，那么只能把两个构造方法都定义出来；
        这样 通过new调用时，编译器会通过构造方法的参数数量、位置、类型自动区分；
        */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(){
        this("Unnamed", 18);    //一个构造方法可以调用其他构造方法，便于代码复用？用this(...)调用；
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    } 
}
