import java.util.Scanner;

public class MyExamE6_1 {
    public static void main(String[] args) {
        int len = 6;
        Scanner io = new Scanner(System.in);
        double[] data = new double[len];
        System.out.println("请输入" + len + "个数初始化数组：");
        for (int i = 0; i < len; i++) {
            data[i] = io.nextDouble();
        }
        io.close();
        double sum = 0.0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        System.out.println("sum =" + sum);
    }
}
