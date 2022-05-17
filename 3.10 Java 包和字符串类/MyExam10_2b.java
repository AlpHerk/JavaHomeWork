import java.io.*;

public class MyExam10_2b {

    public static void main(String args[]) throws IOException {
        BufferedReader br;

        System.out.println("请输入字符串: ");

        br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuffer sb = new StringBuffer(s);

        sb.reverse(); // 将字符串缓冲区中的字符串逆序排列

        if (sb.toString().equals(s))
            System.out.println(s + " 是一个回文字符串");
        else
            System.out.println(s + " 不是一个回文字符串");
    }

}