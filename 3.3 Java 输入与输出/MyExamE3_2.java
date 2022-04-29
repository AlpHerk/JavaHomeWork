import java.io.*;
public class MyExamE3_2 {
    public static void main(String[] args) throws IOException {
        int a, b;
        BufferedReader br;
        boolean leap;
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入a: ");
        a = Integer.parseInt(br.readLine());
        System.out.println("输入b: ");
        b = Integer.parseInt(br.readLine());
        a = a + b;
        b = a - b;
        a = a - b; 
        leap = ((b!=0)&&(a%b==0)||(a!=0)&&(b%a==0))?true:false;
        System.out.println("a="+a+",b="+b);
        System.out.println("这两个整数存在倍数关系吗？" + leap);
        
    }
}
