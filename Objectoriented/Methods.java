
/**
 *修饰符 方法返回类型 方法名(方法参数列表) {
    若干方法语句;
    return 方法返回值;
}

调用方法的语法是实例变量.方法名(参数);
 */
public class Methods {
    public static void main(String[] args) {
        Person zsa = new Person();
        zsa.setName("zsa");
        zsa.setBirth(1999);
        System.out.println(zsa.getName() + ", " + zsa.getAge());

        Group temp = new Group();
        temp.setNames("xiao ming", "xiao hong", "xiao jun");
    }
}


//把field从public改成private，外部代码不能访问这些field
//需要使用方法（method）来让外部代码可以间接修改field
//外部代码通过public方法操作实例，内部代码可以调用private方法
class Person{
    private String name;
    private int birth;

    //在方法内部，可以使用一个隐含的变量this，它始终指向当前实例。
    //如果没有命名冲突，可以省略this
    public String getName() {
        return this.name;
    }

    //如果有局部变量和字段重名，那么局部变量优先级更高，就必须加上this
    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public int getAge() {
        return calcAge(2024); // 调用private方法
    }

    // private方法:
    private int calcAge(int currentYear) {
        return currentYear - this.birth;
    }
}


/*
可变参数
可变参数用类型...定义，可变参数相当于数组类型; 完全可以把可变参数改写为String[]类型
 */

class Group {
    private String[] names;

    public void setNames(String... names) {
        this.names = names;
    }

    /*等价于
    public void setNames(String[] names) {
        this.names = names;
    }
    但是，调用方需要自己先构造String[]，比较麻烦。例如：
    Group g = new Group();
    g.setNames(new String[] {"Xiao Ming", "Xiao Hong", "Xiao Jun"}); // 传入1个String[]
    另一个问题是，调用方可以传入null：
    Group g = new Group();
    g.setNames(null);
    可变参数此时收到的是一个空数组而不是null，因为可变参数视为传入了0个参数
    */
}


/*
参数绑定
1、基本类型参数的传递，是调用方值的复制。双方各自的后续修改，互不影响。
    基本类型的值在内存中被直接存储，因此它们的值在复制或传递时是按值传递的。
2、引用类型参数的传递，调用方的变量，和接收方的参数变量，指向的是同一个对象。双方任意一方对这个对象的修改，都会影响对方。
    引用类型的变量存储的是对象的引用（即内存地址），而不是对象本身
    类（Class）
    接口（Interface）
    数组（Array）
*/ 

