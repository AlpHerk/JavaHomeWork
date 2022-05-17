package MyExam10;

public class MyExam10_1 {

    public static void main(String[] args) {
        PDemo ob  = new PDemo();
        
        int total = ob.total();
        System.out.println("修改数量前的总价为：" + total);

        ob.num    = 10;
        ob.price  = 40;
        System.out.println("修改数量后的总价为：" + ob.getTotal());
    }
}
 