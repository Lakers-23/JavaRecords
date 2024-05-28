package coreJava.chapters6.proxy;

import java.util.*;
import java.lang.reflect.*;

//代理
public class ProxyTest {
    public static void main(String[] args) {
        Object[] elements = new Object[1000];

        //首先在数组中填充整数1~1000的代理 实现Comparable接口
        for(int i = 0; i < elements.length; i++) {
            Integer value = i + 1;
            TraceHandler handler = new TraceHandler(value);
            //创建代理对象 使用Proxy类的newProxyInstance方法 三个参数
            //类加载器、Class数组 每个元素对应需要实现的接口、调用处理器
            Object proxy = Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), 
                new Class[] {Comparable.class}, handler);
            elements[i] = proxy;
        }

        Integer key = new Random().nextInt(elements.length) + 1;

        //调用 Arrays.binarySearch方法在数组中查找一个随机整数 
        int result = Arrays.binarySearch(elements, key);

        //最后打印出匹配的元素
        if(result >= 0) System.out.println(elements[result]);   //这里会调用代理对象的toString
    }
}

//定义一个TraceHandler包装器类存储包装的对象
class TraceHandler implements InvocationHandler {
    //代理对象
    private Object target;

    public TraceHandler(Object t) {
        target = t;
    }

    //打印所调用方法的名字和参数 实现的Comparable接口的compareTo方法会调用代理对象处理器的invoke方法
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

        //調用Integer的compareTo方法
        return m.invoke(target, args);
    }
}
