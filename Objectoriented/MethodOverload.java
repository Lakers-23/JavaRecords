package Objectoriented;


/*
 * 方法名相同，但各自的参数不同，称为方法重载（Overload）
 * 注意：方法重载的返回值类型通常都是相同的。
 * 方法重载的目的是，功能类似的方法使用同一名字，更容易记住，因此，调用起来更简单。
*/
public class MethodOverload {
    public static void main(String[] args) {
        Person ming = new Person();
        Person hong = new Person();
        ming.setName("xiao ming");
        hong.setName("xiao", "hong");
        System.out.println(ming.getName());
        System.out.println(hong.getName());
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setName(String firstName, String lastName){
        this.name = firstName + lastName;
    }
}
