package coreJava.chapters4;

public class ParamTest {
    public static void main(String[] args) {
        /**
         * Test1: 方法不能修改基本数据类型的参数
         */
        System.out.println("Test tripleValue:");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);

        /**
         *Test2: 方法可以改变对象参数的状态 
         */
        System.out.println("Test tripleSalary:");
        Employee harry = new Employee("Harry", 50000, 2024, 4, 10);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());

        /*
         * 方法不能让一个对象参数引用一个新的对象
         */
        System.out.println("Test swap:");
        Employee a = new Employee("Alice", 70000, 1990, 1, 1);
        Employee b = new Employee("Bob", 60000, 2020, 2, 10);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void tripleValue(double x){
        x = 3 * x;
        System.out.println("End of method: x=" + x);
    }

    public static void tripleSalary(Employee x) {
        x.raiseSalary(200);
        System.out.println("End of methods: salary=" + x.getSalary());
    }

    public static void swap(Employee x, Employee y){
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of methods: x=" + x.getName());
        System.out.println("End of methods: y=" + y.getName());
    }  
}
