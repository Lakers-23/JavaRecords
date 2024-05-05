package Reflection;
/**
 * �������Reflection��Java�ķ�����ָ�����������ڿ����õ�һ�������������Ϣ
 * 
 * ������Ϊ�˽���������ڣ���ĳ��ʵ��һ����֪������£���ε����䷽����
 * java����int�Ȼ��������⣬�������Ͷ���class ����interface
 * ÿ����һ��class��JVM��Ϊ�䴴��һ��Class���͵�ʵ����������������
 * �����Class������һ������Class��class
 * 
 *  public final class Class {
        private Class() {} ���Է���Class��Ĺ��췽����private��ֻ��JVM�ܴ���Classʵ���������Լ���Java�������޷�����Classʵ���ġ�
    }
    Class cls = new Class(String); ��String��Ϊ��
 */

public class reflection1 {
    public static void main(String[] args) {
        /**
         * ����JVMΪÿ�����ص�class�����˶�Ӧ��Classʵ��������ʵ���б����˸�class��������Ϣ��
         * �������������������ࡢʵ�ֵĽӿڡ����з������ֶεȣ���ˣ������ȡ��ĳ��Classʵ����
         * ���ǾͿ���ͨ�����Classʵ����ȡ����ʵ����Ӧ��class��������Ϣ��
            ����ͨ��Classʵ����ȡclass��Ϣ�ķ�����Ϊ���䣨Reflection����
         */
        String s = "Hello";
        Class cls1 = String.class;      //1��ֱ��ͨ��һ��class�ľ�̬����class��ȡ
        Class cls2 = s.getClass();      //2��ʵ�������ṩ��getClass()������ȡ
       // Class cls = Class.forName("java.lang.String"); 3�����֪��һ��class��������������Class.forName()��ȡ
       boolean sameClass = cls1 == cls2;   //true ��ΪClassʵ����JVM����Ψһ�ģ����ԣ�����������ȡ��Classʵ����ͬһ��ʵ��
       
       printClassInfo("".getClass());
       printClassInfo(Runnable.class);
       printClassInfo(java.time.Month.class);
       printClassInfo(String[].class);
       printClassInfo(int.class);
    
    }

    static void printClassInfo(Class cls) {
        System.out.println("Class name: " + cls.getName());
        System.out.println("Simple name: " + cls.getSimpleName());
        if (cls.getPackage() != null) {
            System.out.println("Package name: " + cls.getPackage().getName());
        }
        System.out.println("is interface: " + cls.isInterface());
        System.out.println("is enum: " + cls.isEnum());
        System.out.println("is array: " + cls.isArray());
        System.out.println("is primitive: " + cls.isPrimitive());
    }
}
