package DSA;
public class TwoDArray5 {
    public static void main(String[] args){
        System.out.print("Hello 2D Array");
    }
    
}

        // 2D matrix Spiral print
        //   public static void spiralPrint(int matrix [][]){
        //         int rowstart = 0;
        //         int colstart = 0;
        //         int rowend = matrix.length-1;
        //         int colend = matrix[0].length-1;

        //         while(rowstart < rowend && colstart < colend){
        //                 //top
        //                 for (int j=colstart; j<=colend; j++){
        //                         System.out.print(matrix[rowstart][j] + " ");
        //                 }

        //                 //right
        //                 for(int i=rowstart+1; i<=rowend; i++){
        //                         System.out.print(matrix[i][colend] + " ");
        //                 }

        //                 //bottom
        //                 for(int j=colend-1; j>=colstart; j--){
        //                         System.out.print(matrix[rowend][j] + " ");
        //                 }

        //                 //left
        //                 for(int i=rowend-1; i>rowstart; i--){
        //                         System.out.print(matrix[i][colstart] + " ");
        //                 }
        //                 rowstart++;
        //                 colstart++;
        //                 rowend--;
        //                 colend--;
        //         }
        //       System.out.println();
        //     }

        //==== digonal Sum
          // public static int digonalSum(int matrix [][]){
        //         // // brute force O(n2)
        //         // int sum = 0;
        //         // for (int i = 0; i<=matrix.length-1; i++){
        //         //         for (int j = 0; j<=matrix[0].length-1; j++){
        //         //                 //pd
        //         //                 if(i == j){
        //         //                         sum += matrix[i][j];            
        //         //                 } else if (i+j == matrix.length-1 ){   //sd
        //         //                         sum += matrix[i][j];
        //         //                 }
        //         //         }
        //         // }
        //         // System.out.print(sum + " ");
        //         // return sum;
        //         //optimise method O(n)
        //         int sum = 0;
        //         for(int i = 0; i<matrix.length; i++){
        //                 sum += matrix[i][i];
                            
        //                 if(i != matrix.length-1-i){
        //                         sum += matrix[i][matrix.length-1-i];
        //                 }
        //         }
        //         System.out.print(sum + " ");
        //         return sum;
        // }    

        // ==== SortMatrix using staircase Approach
        //     public static boolean searchSorted(int matrix [][], int key){
                //given matrix
                //    int matrix2 [][] = {{10, 20, 30, 40},
                //                    {15, 25, 35, 45},
                //                    {27, 29, 37, 48},
                //                    {32, 33, 39, 50}};
                // int key = 40;
        //         //Staircase
        //         int row = matrix.length-1; int col = 0; 
        //         while(col < matrix.length && row >= 0){
        //                 if(matrix[row][col] == key){
        //                         System.out.print(key + " is at" + "(" + row + "," + col + ")");
        //                         return true;
        //                 } else if (matrix[row][col] < key){
        //                         //right
        //                         col++;
        //                 } else if(matrix[row][col] > key){
        //                         //top
        //                         row--;
        //                 }
        //         }
        //         System.out.print("Key not found!");
        //         return false;
        // }

         // Q1) Print the number of 7's that are in the 2d array
        //     public static int countMatrix(int matrix [][]){
                //    int matrix [][] = {{4, 7, 8,},        //given matrix
                //                    {8, 8, 7}};
        
        //         int count = 0;
        //         for(int i = 0; i<matrix.length; i++){
        //                 for(int j = 0; j<matrix[0].length; j++){
        //                         if(matrix[i][j] == 7){
        //                                 System.out.println(i + "," + j + " " + matrix[i][j] );
        //                         count++;
        //                 }
        //                 }
        //         }
              
        //         System.out.print(count);
        //         return count;
        //     }

               // Q2) Print out the sum of the numbers in the second row of the "nums" array.
        // public static int sumRow(int matrix [][]){
        //           int nums [][] = {{1, 4, 9}, 
        //                          {11, 4, 3},
        //                          {2, 2, 3}};
        //         int row = 1, col = 0;
        //         int sum = 0;
        //         while( col < matrix[0].length){
        //                 sum += matrix[row][col];
        //                 col++;
        //         }  
        //         System.out.print(sum);
        //         return sum;
        //         // output 18
        // }