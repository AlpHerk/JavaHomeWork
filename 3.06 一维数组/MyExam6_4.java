
public class MyExam6_4 {
    // 方法—:通过创建新数组实现原数组元素的逆序存储
    public static void main(String[] args) {

        MyExam6_4_1.main(args);
        MyExam6_4_2.main(args);
    }
}

class MyExam6_4_1 {
    // 方法—:通过创建新数组实现原数组元素的逆序存储
    public static void main(String[] args) {
        int[] fromArray = { 101, 102, 103, 104, 105, 106 }; // 原数组
        int[] toArray = new int[fromArray.length]; // 目标数组
        // 通过循环结构将原数组元素逆序赋值给目标数组元素
        for (int i = 0; i < fromArray.length; i++) {
            toArray[fromArray.length - i - 1] = fromArray[i];
        }
        // 输出目标数组元素
        System.out.println("\n通过循环结构将原数组元素逆序赋值给目标数组元素");
        for (int i = 0; i < toArray.length; i++) {
            System.out.println(i + ": " + toArray[i]);
        }
    }
}

class MyExam6_4_2 {
    public static void main(String[] args) {
        int[] array = { 101, 102, 103, 104, 105, 106 };
        int tmp; // 用于实现数组元素交换的临时变量
        // 使用循环结构通过对数组元素首尾交换实现逆序存储
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        // 输出数组元素
        System.out.println("\n使用循环结构通过对数组元素首尾交换实现逆序存储");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ": " + array[i]);
        }
    }
}
