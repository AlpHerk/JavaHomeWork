public class MyExam1_3 {
    public static double getArea(double r) {
        final double PI = 3.14;
        return PI * r * r;
    }

    public static void main(String args[]) {
        double radium, area;
        radium = Double.parseDouble(args[0]);
        area = getArea(radium);
        System.out.println("圆的半径是" + radium + ", 面积是" + area);
    }
}
