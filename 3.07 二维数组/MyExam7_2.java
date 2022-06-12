public class MyExam7_2 {
    public static void main(String[] args) {
        int array[][] = {{21,54,83,72}, {75,32,78,51}, {67,48,90,50},{23,66,85,5}};
        int tmp;
        for (int i=0; i<array.length; i++) {
            tmp = array[i][i];
            array[i][i] = array[i][3-i];
            array[i][3-i] = tmp;
        }
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) 
                System.out.print(array[i][j] + "\t");
            System.out.println();
        }
    }
}
