/**
 * 实例字段在每个实例中都有自己的一个独立“空间”，
 * 但是静态字段只有一个共享“空间”，所有实例都会共享该字段。
 */
public class staticField {
    public static void main(String[] args) {
        Person ming = new Person("Xiao Ming", 12);
        Person hong = new Person("Xiao Hong", 15);
        ming.number = 88;
        System.out.println(hong.number);    //一样的打印88
        hong.number = 99;
        System.out.println(ming.number);   //一样的打印99

        /*
         * 在Java程序中，实例对象并没有静态字段，在代码中，实例对象能通过 "实例变量.静态字段" 访问静态字段
         * 是因为编译器可以根据实例类型自动转换为 "类名.静态字段" 来访问静态对象。
            更好的写法：         
         */
        Person.number = 99;
        System.out.println(Person.number);
    } 
}

class Person {
    public String name;
    public int age;

    public static int number;       //所有Person类的实例共享这一个字段

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
