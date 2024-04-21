package base;


/*
 * ��������ͬ�������ԵĲ�����ͬ����Ϊ�������أ�Overload��
 * ע�⣺�������صķ���ֵ����ͨ��������ͬ�ġ�
 * �������ص�Ŀ���ǣ��������Ƶķ���ʹ��ͬһ���֣������׼�ס����ˣ������������򵥡�
*/
public class MethodOverload {
    public static void main(String[] args) {
        Person ming = new Person();
        Person hong = new Person();
        ming.setName("xiao ming");
        hong.setName("xiao", "hong");
        System.out.println(ming.getName());
        System.out.println(hong.getName());
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setName(String firstName, String lastName){
        this.name = firstName + lastName;
    }
}
