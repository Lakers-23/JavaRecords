package ExceptionAndError;
//断言assert
public class assertClass {
    public static void main(String[] args) {
        int x = -1;
        //JVM默认关闭断言指令，即遇到assert语句就自动忽略了，不执行。
        //要执行assert语句，必须给Java虚拟机传递-enableassertions（可简写为-ea）参数启用断言。
        assert x > 0 : "x must >= 0";
        System.out.println(x);
    } 
}
