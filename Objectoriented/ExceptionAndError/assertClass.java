package ExceptionAndError;
//����assert
public class assertClass {
    public static void main(String[] args) {
        int x = -1;
        //JVMĬ�Ϲرն���ָ�������assert�����Զ������ˣ���ִ�С�
        //Ҫִ��assert��䣬�����Java���������-enableassertions���ɼ�дΪ-ea���������ö��ԡ�
        assert x > 0 : "x must >= 0";
        System.out.println(x);
    } 
}
