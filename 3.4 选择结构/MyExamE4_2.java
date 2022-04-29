import java.util.Scanner;

public class MyExamE4_2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("三角形各边长");
        System.out.print("a=");
        a = scan.nextInt();
        System.out.print("b=");
        b = scan.nextInt();
        System.out.print("c=");
        c = scan.nextInt();
        scan.close();

        System.out.println("\n三角形三边为：" + a + ", " + b + ", " + c);

        boolean dengbian = a==b && b==c;
        boolean dengyao  = a==b || b==c || a==c;
        boolean zhijiao  = a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a;

        if (a+b>c && a+c>b && b+c>a) {
            if (dengbian)
                System.out.println("这是等边三角形");            
            else if (dengyao && zhijiao) 
                System.out.println("这是等腰直角三角形");
            else if (dengyao)
                System.out.println("这是等腰三角形");
            else if (zhijiao)
                System.out.println("这是直角三角形");
            else
                System.out.println("这是一般三角形");
        } else {
            System.out.println("无法构成三角形");
        }

        float r;
        double s, area;
        r = (a + b + c) / 2.0f;
        s = (r * (r-a) * (r-b) * (r-c));
        area = Math.sqrt(s);
        System.out.println("三角形的面积是" + area);
    }
}
