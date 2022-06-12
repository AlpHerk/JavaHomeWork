import java.util.Scanner;

public class MyExam5_3 {
    public static void main(String[] args) {
        int guessnum = -1, i;
        int rnumber = (int) (Math.random() * 101);
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("请输入你猜的数(0~100)");
            for (i = 0; i < 100; i++) {
                guessnum = scanner.nextInt();
                if (guessnum == rnumber)
                    System.out.print("恭喜你,第" + i + "次猜对了");
                else if (guessnum > rnumber)
                    System.out.println("猜大了");
                else
                    System.out.println("猜小了");
            }
            scanner.close();
        }
    }

}
