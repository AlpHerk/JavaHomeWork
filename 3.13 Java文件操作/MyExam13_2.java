import java.io.*;

public class MyExam13_2 {
    public static void main(String[] args) {
        try {
            String fileName = "MyExam13_2.java";
            String backFileName = fileName + ".bak";
            File   backFile = new File(backFileName);

            // 注意 FileInputStream 的目录有没有 src
            FileInputStream  rfile = new FileInputStream("src\\" + fileName);
            FileOutputStream wfile = new FileOutputStream(backFile);

            int c;
            while((c=rfile.read()) != 1) {
                wfile.write(c);
            }
            rfile.close();
            wfile.close();
        } catch (IOException ex) {
            System.out.println("输出异常！");
        }
    }
}
