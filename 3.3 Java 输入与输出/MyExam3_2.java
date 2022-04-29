import java.io.*;
public class MyExam3_2 {
    public static void main(String[] args) throws IOException {
        int a, b, t;
        BufferedReader br;
        boolean leap;
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入a: ");
        a = Integer.parseInt(br.readLine());
        System.out.println("输入b: ");
        b = Integer.parseInt(br.readLine());
        t = a;
        a = b;
        b = t;
        leap = ((b!=0)&&(a%b==0)||(a!=0)&&(b%a==0))?true:false;
        System.out.println("a="+a+",b="+b);
        System.out.println("这两个整数存在倍数关系吗？" + leap);
        
    }
}
