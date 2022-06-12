import java.io.InputStream;
import java.util.Scanner;

public class MyExam3_3 {
    public static void main(String[] args) {
        String num, name;
        float height;
        double average, weight;
        int Chinese, maths, English, max;
        InputStream is = System.in;
        Scanner scan = new Scanner(is);
        System.out.println("请输入学生学号：");
        num    = scan.next();
        System.out.println("请输入学生姓名：");
        name   = scan.next();
        System.out.println("请输入学生身高(米)：");
        height = scan.nextFloat();
        System.out.println("请输入学生体重(千克)：");
        weight = scan.nextDouble();
        System.out.println("请输入3科成绩：");
        Chinese= scan.nextInt();
        maths  = scan.nextInt();
        English= scan.nextInt();
        scan.close();
        average= (Chinese+maths+English) / 3.0;

        max = Chinese>=maths ? Chinese : maths;
        max = max>=English ? max : English;

        System.out.println("学生基本信息如下：");
        System.out.println("学号: " + num);
        System.out.println("姓名: " + name);
        System.out.println("身高: " + height + "米");
        System.out.println("体重: " + weight + "千克");
        System.out.println("3科成绩：" + Chinese + "," + maths + "," + English);
        System.out.println("平均分为：" + average + "最高分为：" + max);
    }    
}
