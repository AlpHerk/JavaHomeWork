import java.io.InputStream;
import java.util.Scanner;

public class MyExam3_4 {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        double x0, y0, distance;
        InputStream is = System.in;
        Scanner scan = new Scanner(is);
        System.out.println("请输入点p1的坐标：");
        x1 = scan.nextInt();
        y1 = scan.nextInt();
        System.out.println("请输入点p2的坐标：");
        x2 = scan.nextInt();
        y2 = scan.nextInt();
        scan.close();

        distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        x0 = (x1 + x2) / 2.0;
        y0 = (y1 + y2) / 2.0;

        System.out.print("点p1" + "("+x1+","+y1+")"+ "与");
        System.out.println("点p2" + "("+x2+","+y2+")" + "的距离为：" + distance);
        System.out.print("中心点p0坐标为0：" + "("+x0+","+y0+")");
    }    
}
