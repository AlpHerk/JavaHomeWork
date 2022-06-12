//杨辉三角测试用类
public class MyExam7_3 {

    public static void main(String args[]) { 
        YangHui obj = new YangHui();
        int n=10;

        //定义输出杨辉三角的行数变量
        int[][] array = obj.creatYanghui(n); //创建杨辉三角数组
        //输出杨辉三角

        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) { 
                System.out.print(" "+array[i][j]);
            }
            System.out.println(); 
        }
    }
}

class YangHui {
    public int[][] creatYanghui(int length) {
        int array[][] = new int[length][];
        for (int i=0; i<array.length; i++) {
            array[i] = new int[length];
            array[i][0] = 1;
            array[i][i] = 1;

            for (int j=1; j<i; j++)
                array[i][j] = array[i-1][j-1] + array[i-1][j];
        }
        return array;
    }
}