class Calculator {
    public double getAverage(int x, int y, int z) {
        double result = 0.0;
        result = (x + y + z) / 3.0;
        return result;
    }
}

public class MyExamE1_2 {
    public static void main(String[] args) {
        int a = 2, b = 3, c = 5;
        double ave = 0;
        Calculator myObject= new Calculator();
        ave = myObject.getAverage(a, b, c);
        System.out.println("3个数的平均值为：" + ave);
    }
}
