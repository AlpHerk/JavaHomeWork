public class MyExam4_3 {
    public static void main(String[] args) {
        int num, sum, flag;
        int a=0, b=0, c=0, d=0;
        num = Integer.parseInt(args[0]);
        if (num>9999 || num<0)
            System.out.println("该数字为"+num+"不符合要求！");
        else {
            if (num>999) {
                flag = 4;
                d = num % 10;
                c = num / 10 % 10;
                b = num / 100 % 10;
                a = num / 1000 % 10;
            }
            else if (num>99 && num<=999) {
                flag = 3;
                d = num % 10;
                c = num / 10 % 10;
                b = num / 100;
            }
            else if (num>9 && num<=99) {
                flag = 2;
                d = num % 10;
                c = num / 10;
            }
            else {
                flag = 1;
                d = num;
            }
            sum = a + b + c + d;
            System.out.println("数字"+num+"是个"+flag+"位数， 各个位数的和是"+sum);
        }   
    }
    
}
