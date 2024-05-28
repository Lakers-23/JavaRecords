public class staticMethod {   
    //Java程序的入口main()也是静态方法 没有创建任何实例却可以调用
    public static void main(String[] args) {
        //调用实例方法必须通过一个实例变量，而调用静态方法则不需要实例变量，通过类名就可以调用。
        Person.setNumber(99);
        System.out.println(Person.number);
    }
}


class Person {
    public static int number;
    //因为静态方法属于class而不属于实例，
    //因此，静态方法内部，无法访问this变量，也无法访问实例字段，它只能访问静态字段。
    //通过实例变量也可以调用静态方法，但这只是编译器自动帮我们把实例改写成类名而已。
    public static void setNumber(int value) {
        number = value;
    }
}

