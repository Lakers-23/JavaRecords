public class abstractClass {
    /*�޷�ʵ����һ�������ࣺ
        Person p = new Person(); // �������
    */
    public static void main(String[] args) {
        Person p = new Student();
        p.run();
    }

}

/*  ��̬��ʱ�����าд@Override����ķ���
*   ����ķ������붨�壬��Ȼ���าд˭�ģ�
    ����ķ���������ִ����䣿һ�������Ķ��������ʵ�ַ��������
    �������ķ���������Ҫʵ���κι��ܣ�������Ϊ�˶��巽��ǩ����Ŀ����������ȥ��д����
    ��ô�����԰Ѹ���ķ�������Ϊ���󷽷� abstract
*/

//�����Person�౾��Ҳ����Ϊabstract��������ȷ��������
abstract class Person {
    public abstract void run();
}

class Student extends Person {
    //Person�ඨ���˳��󷽷�run()����ô����ʵ������Student��ʱ�򣬾ͱ��븲дrun()����, ������뱨��
    //The type Student must implement the inherited abstract method Person.run()
    @Override
    public void run() {
        System.out.println("Student.run");
    }
}
/*
 * �޷�ʵ�����ĳ�������ʲô�ã�
 * ��Ϊ�����౾����Ƴ�ֻ�����ڱ��̳У���ˣ����������ǿ������ʵ���䶨��ĳ��󷽷����������ᱨ��
 * ��ˣ����󷽷�ʵ�����൱�ڶ����ˡ��淶����
 * 
*/




