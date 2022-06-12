public class MyExamE2_1 {
    public static void main(String[] args) {
        int a = 4, b = 4, c = 8;
        if (isTriangle(a, b, c) == 0) {
            System.exit(0);
        }
        float r;
        double s, area;
        r = (a + b + c) / 2.0f;
        s = (r * (r-a) * (r-b) * (r-c));
        area = Math.sqrt(s);
        System.out.println("三条边是：a=" + a + " b=" + b + " c=" + c);
        System.out.println("三角形的面积是" + area);
    }
    public static int isTriangle(double a, double b, double c) {
        if (a+b>c && a+c>b && b+c>a) {
            boolean dengbian = a==b && b==c;
            boolean dengyao  = a==b || b==c || a==c;
            boolean zhijiao  = a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a;

            if (dengbian) {
                System.out.println("这是等边三角形");
                return 1;
            }
            if (dengyao) {
                System.out.println("这是等腰三角形");
                return 2;
            }  
            if (zhijiao) {
                System.out.println("这是直角三角形");
                return 3;
            }  
            System.out.println("这是一般三角形");
            return 4;

        } else {
            System.out.println("无法构成三角形");
            return 0;
        }
    }
}
