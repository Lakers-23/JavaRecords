package ExceptionAndError;
/**
 * 抛出异常 异常的传播
 */
public class throwClass {
    public static void main(String[] args) {
        try {
            process1();
        } catch (Exception e) {
            System.out.println("catched");
            throw new RuntimeException(e);
           // e.printStackTrace();
        } finally {     //JVM会先执行finally，然后抛出异常 只能抛出一个异常 catch中准备抛出的异常就“消失”了
            System.out.println("finally");
            throw new IllegalArgumentException();
        }
    }

    static void process1() {
        try {
            process2();
        } catch (NullPointerException e) {
            throw new IllegalArgumentException(e);
            
        }
    }

    static void process2() {
        throw new NullPointerException();
    } 
}
