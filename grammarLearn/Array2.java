
/**
 * @author shiaozheng
 * @version 1.0.0 
 * 
 */

//javaDok ��ע�����ɿɶ�����ҳ�ĵ� ��Ҫ��ǰ����������ǩ
//javadoc -d Ŀ���ļ����� -��ǩ1 -��ǩ2 Demo3.java    
public class Array2 {
    //��ά����
    public static void main(String[] args) {
        int[][] ns = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 }
        };

        System.out.println(ns.length);
        for(int i = 0; i < ns.length; i++){
            for(int j = 0; j < ns[i].length; j++){
                System.out.println(ns[i][j]);
            }
        }
    }
    
   
}
