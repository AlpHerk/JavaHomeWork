
public class MyExam12_3 {
    public static int sum(int ... a) {
        int sum = 0;
        for(int n : a) {
            if(n < 0) {
                throw new IllegalArgumentException();
            } else if(n == 0) {
                sum = 0;
            } else {
                sum += n;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4}, b = {1, -2, 3, -4};
        assert sum(1, 2, 3) == 6;
        assert sum(1, 0, 6) == 6;
        System.out.println("Sum of [1, 2, 3, 4] is: " + sum(a));
        System.out.println("Sum of [1, -2, 3, -4] is: " + sum(b));  
    }
}
