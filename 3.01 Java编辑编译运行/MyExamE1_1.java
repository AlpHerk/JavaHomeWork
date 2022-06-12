public class MyExamE1_1 {
    public static double getArea(double r) {
        final double PI = 3.14;
        return PI * r * r;
    }

    public static double getPerimeter(double r) {
        final double PI = 3.14;
        return PI * r * 2;
    }

    public static void main(String args[]) {
        double radium, area, perimeter;
        radium = Double.parseDouble(args[0]);
        area = getArea(radium);
        perimeter = getPerimeter(radium);
        System.out.println("圆的半径是：" + radium + ", 面积是：" + area + "周长是：" + perimeter);

    }
}
