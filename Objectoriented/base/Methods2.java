package base;
/*
 * ���췽��
 * ����ʵ����ʱ��Ͱ��ڲ��ֶ�ȫ����ʼ��Ϊ���ʵ�ֵ
 */
public class Methods2 {
    public static void main(String[] args) {
        /*����౾���Ͷ��ֶν����˳�ʼ����Ȼ�����й��췽�����ǳ�ʼ����˳����ʲô��
         * 1���ȳ�ʼ���ֶ�
         * 2��ִ�й��췽���Ĵ�����г�ʼ��
         */
        Person p = new Person("Xiao Ming", 15);
        System.out.println(p.getName());
    }
}

class Person{
    private String name;
    private int age;

    /*���췽�������ƾ�������������û�����ƣ������ڲ�Ҳ���Ա�д������䣬
        ���ǹ��췽��û�з���ֵ��Ҳû��void ���ù��췽��������new������ 
        ���û�ж��幹�췽�������������Զ�����һ����������ɶҲû�е�Ĭ�Ϲ��췽��
        ��������ˣ��������Ͳ����Զ�����Ĭ�Ϲ��췽����
        �����Ҫ��ʹ�ô������Ĺ��췽�������뱣�����������Ĺ��췽������ôֻ�ܰ��������췽�������������
        ���� ͨ��new����ʱ����������ͨ�����췽���Ĳ���������λ�á������Զ����֣�
        */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(){
        this("Unnamed", 18);    //һ�����췽�����Ե����������췽�������ڴ��븴�ã���this(...)���ã�
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    } 
}
