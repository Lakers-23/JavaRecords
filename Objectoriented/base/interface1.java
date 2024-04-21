public class interface1 {
    
}

/*
    如果一个抽象类没有字段，所有方法全部都是抽象方法：
    abstract class Person {
        public abstract void run();
        public abstract String getName();
    }
    就可以把该抽象类改写为接口：interface

*/
//interfac比抽象类还要抽象，不能有字段 方法默认都是public abstract
interface Person {
    void run();
    String getName();
}
//当一个具体的class去实现一个interface时，需要使用implements关键字
//Java中，一个类只能继承自另一个类，不能从多个类继承。但是，一个类可以实现多个interface,
//例如：class Student implements Person, Hello...
class Student implements Person, GoodBye {
    private String name;

    public Student(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(this.name + " run");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void hello() {
        System.out.println(this.name + " hello");
    }

    @Override
    public void SayBye() {
        System.out.println(this.name + " byebye");
    }

}

//接口继承 一个interface可以继承自另一个interface

interface Hello {
    void hello();
}

interface GoodBye extends Hello {
    void SayBye();

    /**
     * 接口可以定义default方法
     *  default方法的目的是，当我们需要给接口新增一个方法时，会涉及到修改全部子类。
     * 如果新增的是default方法，那么子类就不必全部修改，只需要在需要覆写的地方去覆写新增方法。
        default方法和抽象类的普通方法是有所不同的。
        因为interface没有字段，default方法无法访问字段，而抽象类的普通方法可以访问实例字段。
     */
    default void goodAfternoon() {
        System.out.println(" good Afternoon");
    }
}