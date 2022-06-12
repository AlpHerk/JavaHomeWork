public class MyExam3_1 {
    public static void main(String[] args) {
        double radius, area;
        radius = Double.parseDouble(args[0]);
        area = 4 * 3.14 * Math.pow(radius, 2);
        System.out.print("圆的半径是" + radius + "，表面积是" + area);
    }
}
