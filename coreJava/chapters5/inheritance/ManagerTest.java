package coreJava.chapters5.inheritance;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Carl Craker", 80000, 1987, 7, 10);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 8, 10);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 10, 12);

        for(Employee e : staff) {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary());
        }
    }
}
