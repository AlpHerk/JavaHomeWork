import java.util.Scanner;

public class MyExam4_4 {
    public static void main(String[] args) {
        int player, computer;
        System.out.println("请输入一个数(0：石头 1：剪刀 2：布)");
        Scanner scanner = new Scanner(System.in);
        player = scanner.nextInt();
        scanner.close();
        computer = (int)(Math.random()*10 % 3);
        
        if (computer == 0) {
            System.out.println("计算机随机产生的是石头");
        }
        if (computer == 1) {
            System.out.println("计算机随机产生的是剪刀");
        }
        if (computer == 2) {
            System.out.println("计算机随机产生的是布");
        }

        int flag = player - computer;
        if (flag == -1 || flag == 2) {
            System.out.println("player赢");
        } 
        else if (flag == 0) {
            System.out.println("平局");
        }
        else {
            System.out.println("computer赢");
        }
    }
}
