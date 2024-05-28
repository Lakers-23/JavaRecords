package coreJava.chapters4;

import java.time.*;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);


        for(Employee e : staff)
            e.raiseSalary(5);
        
        
        for(Employee e : staff){
            e.setId();
            System.out.println("name=" + e.getName() + ",slaray=" + e.getSalary() + ",hireDay=" + e.getHireDay());   
        }

        int n = Employee.getNextId();
        System.out.println("Next available id=" + n);
            
    }
}

class Employee{
    private static int nextId = 1;

    private String name;
    private double salary;
    private LocalDate hireDay;
    private int id;

    public Employee(String n, double s, int year, int month, int day){
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
        id = 0;
    }

    public static void main(String[] args) {    //unit test
        Employee e = new Employee("Romeo", 50000, 2003, 3, 31);
        e.raiseSalary(10);
        System.out.println(e.getName() + " " + e.getSalary());
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId() {     //基于类不依赖对象 用类名访问即可
        return nextId;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }


}
