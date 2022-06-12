import java.io.InputStream;
import java.util.Scanner;

public class MyExamE3_3 {
    public static void main(String[] args) {
        String num, name;
        float height;
        double average=0, weight;
        int grades[] = new int[10] ;
        int max = 0;
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
        System.out.println("请输入10科成绩：");
        for (int i=0; i<grades.length; i++) {
            grades[i] = scan.nextInt();
            average  += grades[i];
            max = max>grades[i] ? max : grades[i];
        }
        scan.close();
        average = average / 10.0;
        
        System.out.println("学生基本信息如下：");
        System.out.println("学号: " + num);
        System.out.println("姓名: " + name);
        System.out.println("身高: " + height + "米");
        System.out.println("体重: " + weight + "千克");
        System.out.print("10科成绩：");
        for (int i=0; i<grades.length; i++) {
            System.out.print(grades[i] + " ");
        }
        
        System.out.println("平均分为：" + average + "最高分为：" + max);
    }    
}
