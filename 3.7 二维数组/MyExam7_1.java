public class MyExam7_1{

    public static void main(String[] args) { 
        int matrix[][] = {{23, 66, 85, 5}, {67, 48, 90}, {15,32,78,51}, {146,56}}; 
        int sum=0, minValue = Integer.MAX_VALUE, minRow = 0;

        for(int row=0; row<matrix.length; row++) { 
            sum = 0;
            for (int col=0; col<matrix[row].length; col++) {
                sum+=matrix[row][col];
            }
            System.out.println("row" + row + ", sum=" + sum);
            if(sum < minValue) { 
                minValue=sum;
                minRow = row;
            } 
        }
        System.out.println("row" + minRow + " has the Min-sum of " + minValue); 
    }
}
    
    