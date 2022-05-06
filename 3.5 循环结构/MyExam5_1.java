public class MyExam5_1 {
    public static void main(String[] args) {
        int a = 1, b = 2, i = 1;
        int c = 0;
        double sum = 0;
        while (i < 11) {
            sum = sum + (double) b / a;
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        System.out.println(sum);

    }
}
