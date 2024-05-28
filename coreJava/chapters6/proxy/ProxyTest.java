package coreJava.chapters6.proxy;

import java.util.*;
import java.lang.reflect.*;

//����
public class ProxyTest {
    public static void main(String[] args) {
        Object[] elements = new Object[1000];

        //�������������������1~1000�Ĵ��� ʵ��Comparable�ӿ�
        for(int i = 0; i < elements.length; i++) {
            Integer value = i + 1;
            TraceHandler handler = new TraceHandler(value);
            //����������� ʹ��Proxy���newProxyInstance���� ��������
            //���������Class���� ÿ��Ԫ�ض�Ӧ��Ҫʵ�ֵĽӿڡ����ô�����
            Object proxy = Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), 
                new Class[] {Comparable.class}, handler);
            elements[i] = proxy;
        }

        Integer key = new Random().nextInt(elements.length) + 1;

        //���� Arrays.binarySearch�����������в���һ��������� 
        int result = Arrays.binarySearch(elements, key);

        //����ӡ��ƥ���Ԫ��
        if(result >= 0) System.out.println(elements[result]);   //�������ô�������toString
    }
}

//����һ��TraceHandler��װ����洢��װ�Ķ���
class TraceHandler implements InvocationHandler {
    //�������
    private Object target;

    public TraceHandler(Object t) {
        target = t;
    }

    //��ӡ�����÷��������ֺͲ��� ʵ�ֵ�Comparable�ӿڵ�compareTo��������ô������������invoke����
    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
        System.out.print(target);
        System.out.print("." + m.getName() + "(");
        if (args != null) {
            for(int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if(i < args.length - 1) System.out.print(", ");
            }
        }
        System.out.println(")");

        //�{��Integer��compareTo����
        return m.invoke(target, args);
    }
}
