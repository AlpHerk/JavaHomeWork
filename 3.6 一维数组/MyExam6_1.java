
public class MyExam6_1 {
    public static void main(String[] args) {
        double[] data = new double[6];
        data[1] =4.1;
        data[5] =9.7;
        double sum= 0.0;
        for (int i=0; i<data.length; i++) {
            sum += data[i];
            System.out.println( "sum =" + sum);
        }
    }
}
