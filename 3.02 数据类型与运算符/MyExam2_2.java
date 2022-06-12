public class MyExam2_2 {
    public static void main(String args[]) {
        int a1, a2, a3, a4, a5, a6, a7, n = 3888;
        a1 = n / 100;
        a2 = (n - a1*100) / 50;
        a3 = (n - a1*100 - a2*50) / 20;
        a4 = (n - a1*100 - a2*50 - a3*20) / 10;
        a5 = (n - a1*100 - a2*50 - a3*20 - a4*10) / 5;
        a6 = (n - a1*100 - a2*50 - a3*20 - a4*10 - a5*5) / 2;
        a7 = (n - a1*100 - a2*50 - a3*20 - a4*10 - a5*5 - a6*2) / 1;
        System.out.println("100元的有：" + a1 + "\t50元的有：" + a2);
        System.out.println("20元的有：" + a3 + "\t10元的有：" + a4);
        System.out.println("5元的有：" + a5 + "\t2元的有：" + a6);
        System.out.println("1元的有：" + a7);
    }
}
