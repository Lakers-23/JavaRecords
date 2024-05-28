package ExceptionAndError;
/**
 * Java内置了一套异常处理机制，总是使用异常来表示错误。
    异常是一种class，因此它本身带有类型信息。
    异常可以在任何地方抛出，但只需要在上层捕获，这样就和方法调用分离了：
 */

 /**  错误和异常的继承关系
  *      Object
            |
         Throwable
         |       |
      Error     Exception
               |           |           |||
         RuntimeException  IOException ...
      必须捕获的异常，包括Exception及其子类，但不包括RuntimeException及其子类，这种类型的异常称为Checked Exception。

      不需要捕获的异常，包括Error及其子类，RuntimeException及其子类。
  */
  /**
   * 捕获异常
      捕获异常使用try...catch语句，
      把可能发生异常的代码放到try {...}中，然后使用catch捕获对应的Exception及其子类：
   * 
   */
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class errorClass {
   public static void main(String[] args) {
      byte[] bs = toGBK("中文");
      System.out.println(Arrays.toString(bs));
      //如果不想写任何try代码，可以直接把main()方法定义为throws Exception
      try {
         byte[] bsNew = toGBKNew("处理异常");
         System.out.println(Arrays.toString(bsNew));
      } catch (UnsupportedEncodingException e) {
         System.out.println(e);
      }
      
   } 
   //跟JavaScript和golang的处理有点神似
   /*如果不捕获UnsupportedEncodingException，会出现编译失败的问题
      这是因为String.getBytes(String)方法定义是
      public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
         ...
      } 使用throws Xxx表示该方法可能抛出的异常类型。调用方在调用的时候，必须强制捕获这些异常，否则编译器会报错
   */
   static byte[] toGBK(String s) {
      try {
          // 用指定编码转换String为byte[]:
          return s.getBytes("GBK");
      } catch (UnsupportedEncodingException e) {
          // 如果系统不支持GBK编码，会捕获到UnsupportedEncodingException:
          System.out.println(e); // 打印异常信息
          return s.getBytes(); // 尝试使用用默认编码
      }
  }

  //还可以这样写 可以不用捕捉String.getBytes(String)方法的UnsupportedEncodingException 
  //但是调用这个方法的时候就要捕捉这个异常了，甩锅哈哈
  static byte[] toGBKNew(String s) throws UnsupportedEncodingException {
      return  s.getBytes();
  }
}

//可以写多个catch语句，每个catch分别捕捉对应的Exception及子类，但是子类必须写在前面 多个catch语句只有一个能被执行。
//finally语句 Java的try ... catch机制还提供了finally语句，finally语句块保证有无错误都会执行

/**
 * try {
      process1();
      process2();
      process3();
   } catch (UnsupportedEncodingException e) {
      System.out.println("Bad encoding");
   } catch (IOException e) {
      System.out.println("IO error");
   }  catch (IOException | NumberFormatException e) {
      同时处理多种exception
   }
   } finally {
      1、finally语句不是必须的，可写可不写；
      2、finally总是最后执行。
      System.out.println("END");
   }
 */
