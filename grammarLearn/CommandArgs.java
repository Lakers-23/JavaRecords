
//���������в��� ��ӡ�汾��
//�����в���������String[]���飻
public class CommandArgs {
    public static void main(String[] args) {
        for(String arg : args) {
            if ("-version".equals(arg)) {
                System.out.println("v 1.0");
                break;
            }
        }
    }
}
