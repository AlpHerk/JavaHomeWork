import java.io.*;
import java.util.Scanner;

public class MyExam13_4 {
    public static void main(String[] args) throws IOException {
        String fileName = "mySongList.txt";

        Scanner    sc = new Scanner(System.in);
        FileWriter fw = new FileWriter(fileName, true);

        while(true) {
            System.out.println("请输入歌曲，end结束：");
            String str = sc.next();
            if(str.equals("end")) {
                break;
            }
            fw.write(str + "\n");

        }
        sc.close();
        fw.close();
    }    
}   
