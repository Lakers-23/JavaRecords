package Objectoriented;
//�ڼ̳й�ϵ�У��������������һ���븸�෽��ǩ����ȫ��ͬ�ķ���������Ϊ��д��Override��
public class duotai {
    public static void main(String[] args) {
        Person p = new Student();
        p.run(); // Ӧ�ô�ӡStudent.run
    }
}

class Person {
    public void run() {
        System.out.println("Person.run");
    }
}
//Override��Overload��ͬ���ǣ��������ǩ����ͬ������Overload��Overload������һ���·�����
//�������ǩ����ͬ�����ҷ���ֵҲ��ͬ������Override��
//��������ͬ������������ͬ������������ֵ��ͬ��Ҳ�ǲ�ͬ�ķ�������Java�����У���������������������ᱨ��
class Student extends Person {
    //����@Override�����ñ�������������Ƿ��������ȷ�ĸ�д�� ����@Override���Ǳ���ġ�
    @Override   
    public void run() {
        System.out.println("Student.run");
    }
    //Overload
    public void run(String name){
        System.out.printf(name, ".run");
    }
}
