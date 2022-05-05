
public class MyExam6_2 {
    public static void main(String[] args) {
        char array[] = {'a','D','w','f','q','P','i','o'};
        int count = 0;
        for (int i =0; i< array.length; i++) {
            if(array[i] > 'Z') {
                array[i] = (char)(array[i] - 32);
                count++;
            }
        }
        System.out.println("其中小写字母有"+count +"个。");System.out.print("变换后的字符数组元素:");
        for (int i =0; i<array. length; i++)
            System.out.print(array[i]);
        System.out.println();
    }
}
