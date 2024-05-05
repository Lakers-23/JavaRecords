package Reflection;
/**
 * 反射就是Reflection，Java的反射是指程序在运行期可以拿到一个对象的所有信息
 * 
 * 反射是为了解决在运行期，对某个实例一无所知的情况下，如何调用其方法。
 * java除了int等基本类型外，其他类型都是class 包括interface
 * 每加载一种class，JVM就为其创建一个Class类型的实例，并关联起来。
 * 这里的Class类型是一个名叫Class的class
 * 
 *  public final class Class {
        private Class() {} 可以发现Class类的构造方法是private，只有JVM能创建Class实例，我们自己的Java程序是无法创建Class实例的。
    }
    Class cls = new Class(String); 已String类为例
 */

public class reflection1 {
    public static void main(String[] args) {
        /**
         * 由于JVM为每个加载的class创建了对应的Class实例，并在实例中保存了该class的所有信息，
         * 包括类名、包名、父类、实现的接口、所有方法、字段等，因此，如果获取了某个Class实例，
         * 我们就可以通过这个Class实例获取到该实例对应的class的所有信息。
            这种通过Class实例获取class信息的方法称为反射（Reflection）。
         */
        String s = "Hello";
        Class cls1 = String.class;      //1、直接通过一个class的静态变量class获取
        Class cls2 = s.getClass();      //2、实例变量提供的getClass()方法获取
       // Class cls = Class.forName("java.lang.String"); 3、如果知道一个class的完整类名，用Class.forName()获取
       boolean sameClass = cls1 == cls2;   //true 因为Class实例在JVM中是唯一的，所以，上述方法获取的Class实例是同一个实例
       
       printClassInfo("".getClass());
       printClassInfo(Runnable.class);
       printClassInfo(java.time.Month.class);
       printClassInfo(String[].class);
       printClassInfo(int.class);
    
    }

    static void printClassInfo(Class cls) {
        System.out.println("Class name: " + cls.getName());
        System.out.println("Simple name: " + cls.getSimpleName());
        if (cls.getPackage() != null) {
            System.out.println("Package name: " + cls.getPackage().getName());
        }
        System.out.println("is interface: " + cls.isInterface());
        System.out.println("is enum: " + cls.isEnum());
        System.out.println("is array: " + cls.isArray());
        System.out.println("is primitive: " + cls.isPrimitive());
    }
}
