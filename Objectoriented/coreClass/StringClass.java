package coreClass;
/* java coreClass.StringClass
 * 这样做的原因是 Java 虚拟机需要知道要执行的类的完整路径，而包名就提供了这个信息。
 * 如果你省略了包名，Java 虚拟机将无法正确地定位并执行该类，从而导致报错。
    因此，即使你在包含该类的根目录中执行 java 命令，也需要使用完整的包名加上类名。
*/
//在Java中，String是一个引用类型，它本身也是一个class
    //Java字符串的一个重要特点就是字符串不可变
public class StringClass {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s);
        String upStr = s.toUpperCase();
        System.out.println(upStr + s);

        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        //对于通过方法调用生成的新字符串，编译器不会将其自动放入常量池中。
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}

//字符串比较  == 和 equals 比较的区别
/*
 * == 运算符用于比较两个对象的引用是否相等，即判断两个对象是否指向内存中的同一个地址。
 *  equals() 方法用于比较两个对象的内容是否相等，即判断两个对象的值是否相同。
    默认情况下，equals() 方法是从 Object 类继承而来的，它比较的是两个对象的引用是否相等，即与 == 运算符相同。
    所以一般引用型类型的变量比较要用equals 而不是 == 
 */
