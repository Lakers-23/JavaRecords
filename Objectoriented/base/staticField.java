/**
 * ʵ���ֶ���ÿ��ʵ���ж����Լ���һ���������ռ䡱��
 * ���Ǿ�̬�ֶ�ֻ��һ�������ռ䡱������ʵ�����Ṳ����ֶΡ�
 */
public class staticField {
    public static void main(String[] args) {
        Person ming = new Person("Xiao Ming", 12);
        Person hong = new Person("Xiao Hong", 15);
        ming.number = 88;
        System.out.println(hong.number);    //һ���Ĵ�ӡ88
        hong.number = 99;
        System.out.println(ming.number);   //һ���Ĵ�ӡ99

        /*
         * ��Java�����У�ʵ������û�о�̬�ֶΣ��ڴ����У�ʵ��������ͨ�� "ʵ������.��̬�ֶ�" ���ʾ�̬�ֶ�
         * ����Ϊ���������Ը���ʵ�������Զ�ת��Ϊ "����.��̬�ֶ�" �����ʾ�̬����
            ���õ�д����         
         */
        Person.number = 99;
        System.out.println(Person.number);
    } 
}

class Person {
    public String name;
    public int age;

    public static int number;       //����Person���ʵ��������һ���ֶ�

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
