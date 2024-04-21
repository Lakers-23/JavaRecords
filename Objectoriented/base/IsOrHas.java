package base;
//�̳���is��ϵ�������has��ϵ��
public class IsOrHas {
    public static void main(String[] args) {
        Person p = new Person("С��", 12);
        Student s = new Student("С��", 20, 99);
        // TODO: ����PrimaryStudent����Student�̳У�����grade�ֶ�:
        Student ps = new PrimaryStudent("С��", 9, 100, 5);
        System.out.println(ps.getScore());
    }
}


class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

class Student extends Person {
    protected int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() { return score; }
}

class PrimaryStudent extends Student{
    protected int grade;

    public PrimaryStudent(String name, int age, int score, int grade){
        super(name, age, score);
        this.grade = grade;
    }

}