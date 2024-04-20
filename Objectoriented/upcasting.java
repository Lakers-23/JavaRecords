package Objectoriented;

public class upcasting {
    public static void main(String[] args) {
        Person p = new Person();
        //student �� person �̳������ģ����Կ�������ָ�� ����ת��
        //����ת��ʵ�����ǰ�һ�������Ͱ�ȫ�ر�Ϊ���ӳ���ĸ�����
        Person p1 = new Student();
    
        //�����һ����������ǿ��ת��Ϊ�������ͣ���������ת�ͣ�downcasting
        //���� Student s1 = (Student) p;//runtime error! ClassCastException! ��Ϊp�������Ǹ��� ���๦�ܱȸ���࣬��Ĺ����޷�ƾ�ձ����
        //����ת�ͺܿ��ܻ�ʧ�ܡ�ʧ�ܵ�ʱ��Java������ᱨClassCastException��
        //Ϊ�˱�������ת�ͳ���Java�ṩ��instanceof���������������ж�һ��ʵ�������ǲ���ĳ�����ͣ�
        Student s1 = (Student) p1;
        System.out.println(s1 instanceof Person);//true
        System.out.println(p instanceof Person); // true
        System.out.println(p instanceof Student); // false
        //��Java 14��ʼ���ж�instanceof�󣬿���ֱ��ת��Ϊָ�������������ٴ�ǿ��ת�͡�
        Object obj = "hello";
        if (obj instanceof String s) {      //���ﱨ������16����
            // ����ֱ��ʹ�ñ���s:
            System.out.println(s.toUpperCase());
        }
    }

}

class Person{
    protected  int      age;
    protected  String   name;
}

class Student extends Person{
    public int score;
}

class Teacher extends Person{
    public String subject;
}
