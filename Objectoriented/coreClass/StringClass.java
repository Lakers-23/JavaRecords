package coreClass;
/* java coreClass.StringClass
 * ��������ԭ���� Java �������Ҫ֪��Ҫִ�е��������·�������������ṩ�������Ϣ��
 * �����ʡ���˰�����Java ��������޷���ȷ�ض�λ��ִ�и��࣬�Ӷ����±���
    ��ˣ���ʹ���ڰ�������ĸ�Ŀ¼��ִ�� java ���Ҳ��Ҫʹ�������İ�������������
*/
//��Java�У�String��һ���������ͣ�������Ҳ��һ��class
    //Java�ַ�����һ����Ҫ�ص�����ַ������ɱ�
public class StringClass {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s);
        String upStr = s.toUpperCase();
        System.out.println(upStr + s);

        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        //����ͨ�������������ɵ����ַ��������������Ὣ���Զ����볣�����С�
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}

//�ַ����Ƚ�  == �� equals �Ƚϵ�����
/*
 * == ��������ڱȽ���������������Ƿ���ȣ����ж����������Ƿ�ָ���ڴ��е�ͬһ����ַ��
 *  equals() �������ڱȽ���������������Ƿ���ȣ����ж����������ֵ�Ƿ���ͬ��
    Ĭ������£�equals() �����Ǵ� Object ��̳ж����ģ����Ƚϵ�����������������Ƿ���ȣ����� == �������ͬ��
    ����һ�����������͵ı����Ƚ�Ҫ��equals ������ == 
 */
