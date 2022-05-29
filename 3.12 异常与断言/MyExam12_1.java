import java.io.*;
import java.util.Scanner;

public class MyExam12_1 {

    public static void main(String[] args) {
        int sum = 0, n;
        try {
            Scanner sc = new Scanner(new File("C:\\numbers.txt"));
            while (sc.hasNextInt()) {
                n = sc.nextInt();
                System.out.println(n);
                sum += n;
            }
            System.out.println("Sum=" + sum);
            sc.close();
        } catch (FileNotFoundException e) {
            System.err.println("无法打开指定文件。");
        }
    }
}