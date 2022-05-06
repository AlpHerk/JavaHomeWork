public class MyExamE5_1 {
    public static void main(String[] args) {
        int a = 1, b = 2, i = 1;
        int c = 0;
        double sum = 0;
        for (; i < 11; i++) {
            sum = sum + (double) b / a;
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(sum);
    }
}
