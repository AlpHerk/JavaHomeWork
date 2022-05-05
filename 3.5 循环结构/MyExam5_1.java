public class MyExam5_1 {
    public static void main (String[] args){
        int a=1,b=2, i=0;
        int c=0;
        double sum=0;
        while(i < 11){
            sum=sum+b/a;
            c=a+b;
            a=b;
            b=c;
            i++;
            System.out.println(sum);
        }
    }
}
