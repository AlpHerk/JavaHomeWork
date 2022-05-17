
public class MyExam9_1 {
    public static void main(String[] a) {
        FinalClass fc = new FinalClass(85);
        fc.score = 58;
        fc.print();
    }
}

// MyExam9_1.java

class FinalClass {
    final String Language = "Java";
    public int score;

    public FinalClass(int s) { // 构造方法  
        score = s;
    }

    public void print() {
        System.out.println(Language + "成绩是：" + score + "分");
    }

}
