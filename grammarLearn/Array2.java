
/**
 * @author shiaozheng
 * @version 1.0.0 
 * 
 */

//javaDok 将注释生成可读的网页文档 需要在前面添加特殊标签
//javadoc -d 目标文件夹名 -标签1 -标签2 Demo3.java    
public class Array2 {
    //二维数组
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
