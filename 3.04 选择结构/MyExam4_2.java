import java.util.Scanner;

public class MyExam4_2 {
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

        if (a+b>c && a+c>b && b+c>a) {
            if (a==b && b==c)
                System.out.println("这是等边三角形");
            else if (a==b || b==c || a==c)
                System.out.println("这是等腰三角形");
            else
                System.out.println("这是一般三角形");

        } else {
            System.out.println("无法构成三角形");
        }
    }
}
