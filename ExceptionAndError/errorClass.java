package ExceptionAndError;
/**
 * Java������һ���쳣������ƣ�����ʹ���쳣����ʾ����
    �쳣��һ��class��������������������Ϣ��
    �쳣�������κεط��׳�����ֻ��Ҫ���ϲ㲶�������ͺͷ������÷����ˣ�
 */

 /**  ������쳣�ļ̳й�ϵ
  *      Object
            |
         Throwable
         |       |
      Error     Exception
               |           |           |||
         RuntimeException  IOException ...
      ���벶����쳣������Exception�������࣬��������RuntimeException�������࣬�������͵��쳣��ΪChecked Exception��

      ����Ҫ������쳣������Error�������࣬RuntimeException�������ࡣ
  */
  /**
   * �����쳣
      �����쳣ʹ��try...catch��䣬
      �ѿ��ܷ����쳣�Ĵ���ŵ�try {...}�У�Ȼ��ʹ��catch�����Ӧ��Exception�������ࣺ
   * 
   */
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class errorClass {
   public static void main(String[] args) {
      byte[] bs = toGBK("����");
      System.out.println(Arrays.toString(bs));
      //�������д�κ�try���룬����ֱ�Ӱ�main()��������Ϊthrows Exception
      try {
         byte[] bsNew = toGBKNew("�����쳣");
         System.out.println(Arrays.toString(bsNew));
      } catch (UnsupportedEncodingException e) {
         System.out.println(e);
      }
      
   } 
   //��JavaScript��golang�Ĵ����е�����
   /*���������UnsupportedEncodingException������ֱ���ʧ�ܵ�����
      ������ΪString.getBytes(String)����������
      public byte[] getBytes(String charsetName) throws UnsupportedEncodingException {
         ...
      } ʹ��throws Xxx��ʾ�÷��������׳����쳣���͡����÷��ڵ��õ�ʱ�򣬱���ǿ�Ʋ�����Щ�쳣������������ᱨ��
   */
   static byte[] toGBK(String s) {
      try {
          // ��ָ������ת��StringΪbyte[]:
          return s.getBytes("GBK");
      } catch (UnsupportedEncodingException e) {
          // ���ϵͳ��֧��GBK���룬�Ჶ��UnsupportedEncodingException:
          System.out.println(e); // ��ӡ�쳣��Ϣ
          return s.getBytes(); // ����ʹ����Ĭ�ϱ���
      }
  }

  //����������д ���Բ��ò�׽String.getBytes(String)������UnsupportedEncodingException 
  //���ǵ������������ʱ���Ҫ��׽����쳣�ˣ�˦������
  static byte[] toGBKNew(String s) throws UnsupportedEncodingException {
      return  s.getBytes();
  }
}

//����д���catch��䣬ÿ��catch�ֱ�׽��Ӧ��Exception�����࣬�����������д��ǰ�� ���catch���ֻ��һ���ܱ�ִ�С�
//finally��� Java��try ... catch���ƻ��ṩ��finally��䣬finally���鱣֤���޴��󶼻�ִ��

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
      ͬʱ�������exception
   }
   } finally {
      1��finally��䲻�Ǳ���ģ���д�ɲ�д��
      2��finally�������ִ�С�
      System.out.println("END");
   }
 */
