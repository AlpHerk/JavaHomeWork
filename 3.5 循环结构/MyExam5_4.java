import java.util.Scanner;

public class MyExam5_4 {
    public static void main(String[] args) {
        int player, computer;
        int i=0, j=0;
        System.out.println("请输入一个数(0：石头 1：剪刀 2：布)");
        Scanner scanner = new Scanner(System.in);
        while(i<2 && j<2) {
            player = scanner.nextInt();
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
                i++;
                System.out.println("player第" + i + "次赢");
            } 
            else if (flag == 0) {
                System.out.println("平局，继续比赛");
            }
            else {
                j++;
                System.out.println("computer第" + j + "次赢");
            }
        }
        if (i==2) {
            System.out.println("最终：player赢");
        } else {
            System.out.println("最终：computer赢");
        }
        scanner.close();
    }
}
