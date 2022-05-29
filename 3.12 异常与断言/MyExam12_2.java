import java.io.*;
import java.util.Arrays;


public class MyExam12_2 {
    public static void reverse(String srcFilePath, String destFilePath) 
        throws IOException {
        try(FileReader in  = new FileReader(srcFilePath); 
            FileWriter out = new FileWriter(destFilePath)) {
            char[] buf = new char[4096];
            int n = in.read(buf);
            buf = Arrays.copyOf(buf, n);
            reverse(buf);
            out.write(buf);
        } 
    }
    public static void reverse(char[] buf) {
        char t;
        for(int i=0; i<buf.length; ++i) {
            t = buf[i];
            buf[i] = buf[buf.length-1-i];
            buf[buf.length-1-i] = t;
        }
    }

    public static void main(String[] args) {
        char[] buf = "人随雁远边城暮，雨映疏帘绣阁空".toCharArray();
        System.out.println("原文：" + String.valueOf(buf));
        reverse(buf);
        System.out.println("反转：" + String.valueOf(buf));

        try {
            reverse("D:\\src.txt", "D:\\dest.txt");
            System.out.println("翻转结果已保存到D:\\dest.txt");
        } catch(Exception err) {
            System.out.println("待反转的文件不存在或无法创建反转解结果");
        }
    }
}
