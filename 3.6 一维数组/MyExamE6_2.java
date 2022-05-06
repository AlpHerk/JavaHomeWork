import java.util.Arrays;

public class MyExamE6_2 {
    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8, 9};
        int[] arrays = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, arrays, 0, array1.length);
        System.arraycopy(array2, 0, arrays, array1.length, array2.length);
        System.out.println("源数组1：" + Arrays.toString(array1));
        System.out.println("源数组2：" + Arrays.toString(array2));
        System.out.println("两数组拼接：" + Arrays.toString(arrays));
    }
}
