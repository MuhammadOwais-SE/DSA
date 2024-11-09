public class backtracking8 {
    public static void main(String[] args) {
    System.out.print("Recursion questions in java");
    }

//  ------------------------------ find the n queen
        // public static boolean isSafe(char board[][], int row, int col){
    //     // move vertical
    //     for (int i=row-1; i>=0; i-- ){
    //         if (board[i][col]== 'Q'){
    //             return false;
    //         }
    //     }   

    //     // move dignonally right
    //     for (int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++ )
    //        if(board[i][j] == 'Q'){
    //         return false;
    //        }
        
    //     // move digonally left
    //     for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
    //         if(board[i][j]== 'Q'){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // static int count = 0;

    // public static boolean nQueens(char board[][], int row){
    //     // base case
    //     if(row == board.length){
    //         printBoard(board);
    //         count++;
    //         return true;
    //     }
        
    //     for (int j =0; j<board.length; j++){
    //         if (isSafe(board, row, j  )){
                
    //             board[row][j] = 'Q';
    //             if(nQueens(board, row+1)){
    //                 return true;
    //             }
    //                     board[row][j] = 'x';
    //         }
     
    //     }
    //     return false;
    // }

    // public static void printBoard (char board[][]){
    //     System.out.println("---------------chess board--------------------");
    //     for (int i=0; i < board.length; i++){
    //         for (int j=0; j < board.length; j++){
    //             System.out.print( board[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // } 
    // n quen ended.


// ========================== grid ways
// public static int girdWays(int row, int col, int n, int m){
//     // base case  
//     if (row == n-1 && col == m-1 ){ 
//     // if (row < n && col < m ){
//         return 1;
//     }else if(row == n || col == m ){
//         return 0;
//     }

//     // recursion
//     // int factorial = girdWays(row-1, col-1, n, m);
//     int nFact =  girdWays(row-1, col, n, m);     
//     int mFact =  girdWays(row, col-1, n, m);
//     return nFact + mFact/ (nFact * mFact);

//     // int w1 =  girdWays(row+1, col, n, m);
//     // int w2 =  girdWays(row, col+1, n, m);
//     // return w1+w2;

// }




//  ======================== sdoku solver

// public static boolean isSafe(int sudoku[][], int row, int col, int digit){
//     // row
//     for(int i = 0; i<9; i++ ){
//         if (sudoku[row][i] == digit){
//             return false;
//         }
//     }
//     // col
//     for(int i = 0; i<9; i++ ){
//         if (sudoku[i][col] == digit){
//             return false;
//         }
//     } 
    
//     // 3x3 grid check
//      int startRow = 3 * (row /3); int startCol = 3 * (col /3);
//      for (int i = startRow; i<startRow+3; i++){
//         for (int j = startCol; j< startCol+3; j++){
//             if (sudoku[i][j] == digit){
//                 return false;
//             }
//         }
//      }
//     return true;
//     }
    
    
//     public static boolean sudokuSolver(int sudoku[][], int row, int col ){
//         // base case 
//         if(row == 9){
//             return true;
//         }
    
//         int nextRow = row; int nextCol = col+1;
//         if(col+1 == 9){
//             nextRow = row+1; 
//             nextCol = 0;
//         } 
//         //  if number is already place
//         if (sudoku [row][col] !=0 ){
//             return sudokuSolver(sudoku, nextRow, nextCol);
//         }
//         //  checking the sudoku
//         for (int digit = 0; digit<=9 ; digit++ ) {
//             if(isSafe(sudoku, row, col, digit)){
//                 sudoku [row][col] = digit;
//                 if(sudokuSolver(sudoku, nextRow, nextCol)){ // soln exist
//                     // sudokuSolver(sudoku, nextRow, nextCol);
//                    return true;
//                 }
//                 sudoku [row][col] = 0;
//             }
//         }
//         return false;
    
//     }
    
}

