//java Hello.java 编译成字节码文件 Hello.class
//javac Hello 给java虚拟机传递参数 (类名) 虚拟机自动查找对应的class文件并执行
public class Hello {
   //      
   public static void main(String[] args) {
      System.out.println("hello java word!");
     }
}

//编译后，每一个类都会生成一个.class文件
class Dog{
   public static void main(String[] args) {
      System.out.println("hello!");
   }
}