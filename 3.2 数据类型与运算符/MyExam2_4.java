public class MyExam2_4 {
    public static void main(String[] args) {
        int num;
        int ge, shi, bai, qian, wan;
        boolean leap;
        num  = (int)(Math.random() * 100000);
        wan  = num / 10000;
        qian = (num - wan*10000) / 1000;
        bai  = (num - wan*10000 - qian*1000) / 100;
        shi  = (num - wan*10000 - qian*1000 - bai*100) /10;
        ge   = (num - wan*10000 - qian*1000 - bai*100 - shi*10) /1;
        leap = (ge==wan && shi==qian) ? true : false;
        System.out.println(num + "是回文数吗？" + leap);
    }
}
