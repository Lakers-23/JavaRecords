public class duotai3 {
    
}

/*
 * 因为所有的class最终都继承自Object，而Object定义了几个重要的方法：
    toString()：把instance输出为String；
    equals()：判断两个instance是否逻辑相等；
    hashCode()：计算一个instance的哈希值。
 */

class Person {
    protected String name;
    protected int age;
    // 显示更有意义的字符串:
    @Override
    public String toString() {
        return "Person:name=" + name;
    }

    public String hello() {
        return "Hello, " + name;
    }

    /* final:
        继承可以允许子类覆写父类的方法。
        1、如果一个父类不允许子类对它的某个方法进行覆写，可以把该方法标记为final。用final修饰的方法不能被Override
        2、如果一个类不希望任何其他类继承自它，那么可以把这个类本身标记为final。用final修饰的类不能被继承
        3、对于一个类的实例字段，同样可以用final修饰。用final修饰的字段在初始化后不能被修改。可以在构造方法中初始化final字段
            这种方法更为常用，因为可以保证实例一旦创建，其final字段就不可修改。
    */
    public final String nihao() {
        return "nihao, " + name;
    }

    // 比较是否相等:
    @Override
    public boolean equals(Object o) {
        // 当且仅当o为Person类型:
        //Java提供了instanceof操作符，可以先判断一个实例究竟是不是某种类型：
        if (o instanceof Person) {
            Person p = (Person) o;
            // 并且name字段相同时，返回true:
            return this.name.equals(p.name);
        }
        return false;
    }

    // 计算hash:
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}

class Student extends Person {
    @Override
    public String hello() {
        // 在子类的覆写方法中，如果要调用父类的被覆写的方法，可以通过super来调用
        return super.hello() + "!";
    }
}
