public class interface1 {
    
}

/*
    ���һ��������û���ֶΣ����з���ȫ�����ǳ��󷽷���
    abstract class Person {
        public abstract void run();
        public abstract String getName();
    }
    �Ϳ��԰Ѹó������дΪ�ӿڣ�interface

*/
//interfac�ȳ����໹Ҫ���󣬲������ֶ� ����Ĭ�϶���public abstract
interface Person {
    void run();
    String getName();
}
//��һ�������classȥʵ��һ��interfaceʱ����Ҫʹ��implements�ؼ���
//Java�У�һ����ֻ�ܼ̳�����һ���࣬���ܴӶ����̳С����ǣ�һ�������ʵ�ֶ��interface,
//���磺class Student implements Person, Hello...
class Student implements Person, GoodBye {
    private String name;

    public Student(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(this.name + " run");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void hello() {
        System.out.println(this.name + " hello");
    }

    @Override
    public void SayBye() {
        System.out.println(this.name + " byebye");
    }

}

//�ӿڼ̳� һ��interface���Լ̳�����һ��interface

interface Hello {
    void hello();
}

interface GoodBye extends Hello {
    void SayBye();

    /**
     * �ӿڿ��Զ���default����
     *  default������Ŀ���ǣ���������Ҫ���ӿ�����һ������ʱ�����漰���޸�ȫ�����ࡣ
     * �����������default��������ô����Ͳ���ȫ���޸ģ�ֻ��Ҫ����Ҫ��д�ĵط�ȥ��д����������
        default�����ͳ��������ͨ������������ͬ�ġ�
        ��Ϊinterfaceû���ֶΣ�default�����޷������ֶΣ������������ͨ�������Է���ʵ���ֶΡ�
     */
    default void goodAfternoon() {
        System.out.println(" good Afternoon");
    }
}