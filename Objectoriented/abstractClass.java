public class abstractClass {
    /*无法实例化一个抽象类：
        Person p = new Person(); // 编译错误
    */
    public static void main(String[] args) {
        Person p = new Student();
        p.run();
    }

}

/*  多态的时候，子类覆写@Override父类的方法
*   父类的方法必须定义，不然子类覆写谁的？
    父类的方法必须有执行语句？一个方法的定义必须有实现方法的语句
    如果父类的方法本身不需要实现任何功能，仅仅是为了定义方法签名，目的是让子类去覆写它，
    那么，可以把父类的方法声明为抽象方法 abstract
*/

//必须把Person类本身也声明为abstract，才能正确编译它：
abstract class Person {
    public abstract void run();
}

class Student extends Person {
    @Override
    public void run() {
        System.out.println("Student.run");
    }
}




