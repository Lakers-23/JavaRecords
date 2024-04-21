
/**
 *���η� ������������ ������(���������б�) {
    ���ɷ������;
    return ��������ֵ;
}

���÷������﷨��ʵ������.������(����);
 */
public class Methods {
    public static void main(String[] args) {
        Person zsa = new Person();
        zsa.setName("zsa");
        zsa.setBirth(1999);
        System.out.println(zsa.getName() + ", " + zsa.getAge());

        Group temp = new Group();
        temp.setNames("xiao ming", "xiao hong", "xiao jun");
    }
}


//��field��public�ĳ�private���ⲿ���벻�ܷ�����Щfield
//��Ҫʹ�÷�����method�������ⲿ������Լ���޸�field
//�ⲿ����ͨ��public��������ʵ�����ڲ�������Ե���private����
class Person{
    private String name;
    private int birth;

    //�ڷ����ڲ�������ʹ��һ�������ı���this����ʼ��ָ��ǰʵ����
    //���û��������ͻ������ʡ��this
    public String getName() {
        return this.name;
    }

    //����оֲ��������ֶ���������ô�ֲ��������ȼ����ߣ��ͱ������this
    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public int getAge() {
        return calcAge(2024); // ����private����
    }

    // private����:
    private int calcAge(int currentYear) {
        return currentYear - this.birth;
    }
}


/*
�ɱ����
�ɱ����������...���壬�ɱ�����൱����������; ��ȫ���԰ѿɱ������дΪString[]����
 */

class Group {
    private String[] names;

    public void setNames(String... names) {
        this.names = names;
    }

    /*�ȼ���
    public void setNames(String[] names) {
        this.names = names;
    }
    ���ǣ����÷���Ҫ�Լ��ȹ���String[]���Ƚ��鷳�����磺
    Group g = new Group();
    g.setNames(new String[] {"Xiao Ming", "Xiao Hong", "Xiao Jun"}); // ����1��String[]
    ��һ�������ǣ����÷����Դ���null��
    Group g = new Group();
    g.setNames(null);
    �ɱ������ʱ�յ�����һ�������������null����Ϊ�ɱ������Ϊ������0������
    */
}


/*
������
1���������Ͳ����Ĵ��ݣ��ǵ��÷�ֵ�ĸ��ơ�˫�����Եĺ����޸ģ�����Ӱ�졣
    �������͵�ֵ���ڴ��б�ֱ�Ӵ洢��������ǵ�ֵ�ڸ��ƻ򴫵�ʱ�ǰ�ֵ���ݵġ�
2���������Ͳ����Ĵ��ݣ����÷��ı������ͽ��շ��Ĳ���������ָ�����ͬһ������˫������һ�������������޸ģ�����Ӱ��Է���
    �������͵ı����洢���Ƕ�������ã����ڴ��ַ���������Ƕ�����
    �ࣨClass��
    �ӿڣ�Interface��
    ���飨Array��
*/ 

