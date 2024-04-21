package base;

/*
 * 阻止继承
    正常情况下，只要某个class没有final修饰符，那么任何类都可以从该class继承。
    从Java 15开始，允许使用sealed修饰class，并通过permits明确写出能够从该class继承的子类名称。
 */
public sealed class Shape permits Rect Circle, Triangle {
    
}

/* 一个类声明称final后，他的子类有两种 final 和 非final ，
   final类不能有子类 非final类可以有子类，
   
*/
public final class Circle implements Shape {
   // 实现圆形类
}

public final class Rectangle implements Shape {
   // 实现矩形类
}

public final class Triangle implements Shape {
   // 实现三角形类
}
