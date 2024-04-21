package base;

//Java使用extends关键字来实现继承
public class inherit {
    
}

class Person {
    // * 子类无法访问父类的private字段或者private方法
    // * 为了让子类可以访问父类的字段，我们需要把private改为protected
    protected String name;
    protected int age;

    /*
     * 定义了构造方法后，子类必须显示的调用父类的构造方法，因为
     * 在Java中，任何class的构造方法，第一行语句必须是调用父类的构造方法。
     * 如果没有明确地调用父类的构造方法，编译器会帮我们自动加一句super(); 但是如果父类没有无参数的构造方法，所以会编译失败
     * 可以发现 子类不会继承任何父类的构造方法。子类默认的构造方法是编译器自动生成的，不是继承的。
    */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this.name = "unName";
        this.age = 8;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

/*
 * 子类自动获得了父类的所有字段，严禁定义与父类重名的字段！
 * 在OOP的术语中，我们把Person称为超类（super class），父类（parent class），基类（base class），
 * 把Student称为子类（subclass），扩展类（extended class）。
 * 在Java中，没有明确写extends的类，编译器会自动加上extends Object。
 * 继承树：
 * Object
 *  /|\
 *   |
 * Person
 *  /|\
 *   | 
 * Student
 * 
 * Java只允许一个class继承自一个类，因此，一个类有且仅有一个父类。只有Object特殊，它没有父类。

 */
class Student extends Person {
    // 不要重复name和age字段/方法,
    // 只需要定义新增score字段/方法:
    private int score;

    public Student (String name, int age, int score){
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}

/*  super关键字表示父类（超类）。子类引用父类的字段时，可以用super.fieldName
    实际上，这里使用super.name，或者this.name，或者name，效果都是一样的。编译器会自动定位到父类的name字段
*/
class Teacher extends Person {
    public String hello() {
        return "hello, " + super.name;
    }
    
}
