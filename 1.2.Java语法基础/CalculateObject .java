import java.io.*;
import java.util.Scanner;

public class CalculateObject {
    public static void main(String[] args) {
        q3Circle(); // 编程题-3
        q5Sphere(); // 编程题-5
    }

    private static void q3Circle() {
        /**
         * 编程题-3 圆的半径为3m, 求其周长和面积
         */
        double r = 3.4;
        double perimeter = 2 * Math.PI * r;
        double area = Math.pow(Math.PI, 2);

        System.out.println("圆的周长：" + String.format("%.2f", perimeter) + "米");
        System.out.println("圆的面积：" + String.format("%.2f", area) + "平方米\n");
    }

    private static void q5Sphere() {
        /** 
         * 编程题-5，球圆球的体积
        */
        double r1 = 10;
        double r2 = Math.random() * 10;

        InputStream is = System.in;
        Scanner scan = new Scanner(is);
        System.out.print("请输入球体的半径R：");
        double r3 = scan.nextDouble();
        scan.close();

        double v1 = calcVolume(r1);
        double v2 = calcVolume(r2);
        double v3 = calcVolume(r3);

        System.out.println("直接赋值r为10的球的体积：" + String.format("%.4f", v1) + "立方米");
        System.out.println("随机生成r值的球的体积：" + String.format("%.4f", v2) + "立方米");
        System.out.println("键盘输入r值的球的体积：" + String.format("%.4f", v3) + "立方米");
    }

    public static double calcVolume(double r) {
        return 4.0 / 3 * Math.PI * Math.pow(r, 3);
    }
}
