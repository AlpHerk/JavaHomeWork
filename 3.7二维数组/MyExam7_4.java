
public class MyExam7_4 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.println(); 
        }

        boolean find = false;
        int row = 0;
        int max = 0;
        while (!find && row<mat.length) {
            max = 0;
            for (int i=0; i<mat[row].length; i++) {
                if (mat[row][i] > mat[row][max]) {
                    max = i;
                }
            }
            
            boolean yes = true;
            int j = 0;
            while (yes && j<mat.length) {
                if (mat[row][max] > mat[j][max]) 
                    yes = false;
                j++;
            }
            if (yes) find = true;
            else row++;

        }
        if (find) System.out.println("The dort: " + mat[row][max]);
        else System.out.println("The dort: null");
    }
}
