public class MyExam5_2 {
    public static void main (String[] args){
        int num, i;
        num = Integer.parseInt(args[0]);
        for(i=2; i<num; i++) {
            if(num%i == 0){
                System.out.println(num + "不是素数");
                return;
            }
        }
        if(num != 1) 
            System.out.println(num + "是素数");
        else
            System.out.println(num + "不是素数");
    }
}
