
//接受命令行参数 打印版本号
//命令行参数类型是String[]数组；
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
