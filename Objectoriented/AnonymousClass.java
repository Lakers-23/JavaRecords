//匿名类
//还有一种定义Inner Class的方法，它不需要在Outer Class中明确地定义这个Class，而是在方法内部，通过匿名类（Anonymous Class）来定义。
public class AnonymousClass {
    public static void main(String[] args){
        Outer outer = new Outer("Nested");
        outer.asyncHello();
    }
}

class Outer{
    private String name;

    Outer(String name){
        this.name = name;
    }

    void asyncHello() {
        //Runnable是一个接口 接口不能实例化，因此实际上定义了一个实现Runnable接口的匿名类，并通过new进行实例化
        //后面再来补这块吧，教程不知道跳到哪里去了。。
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, " + Outer.this.name);
            }
        };
        new Thread(r).start();
    }
}
