/**
 * �ڲ���
 */
public class NestedClass {
    public static void main(String[] args) {
        //Ҫʵ����һ��Inner�����Ǳ������ȴ���һ��Outer��ʵ����Ȼ�󣬵���Outerʵ����new������Innerʵ��
        Outer outer = new Outer("Nested");    //ʵ����һ��Outer
        Outer.Inner inner = outer.new Inner();  //ʵ����һ��Inner
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
