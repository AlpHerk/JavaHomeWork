public class MyExam2_3 {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;
        float r;
        double s, area;
        r = (a + b + c) / 2.0f;
        s = (r * (r-a) * (r-b) * (r-c));
        area = Math.sqrt(s);
        System.out.println("三条边是：a=" + a + " b=" + b + " c=" + c);
        System.out.println("三角形的面积是" + area);
    }
}
