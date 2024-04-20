/**
 * 内部类
 */
public class NestedClass {
    public static void main(String[] args) {
        //要实例化一个Inner，我们必须首先创建一个Outer的实例，然后，调用Outer实例的new来创建Inner实例
        Outer outer = new Outer("Nested");    //实例化一个Outer
        Outer.Inner inner = outer.new Inner();  //实例化一个Inner
        inner.hello();
    }
}

class Outer {
    private String name;

    Outer(String name) {
        this.name = name;
    }

    class Inner {
        void hello() {
            System.out.println("Hello, " + Outer.this.name);
        }
    }
}
