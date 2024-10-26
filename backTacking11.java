
public class backTacking11 {
    public static void main(String[] args) {

        // int n=3, m=3 ;
        // System.out.print(girdWays(0, 0, n, m));

        System.out.print("bitManuplation in java");
        
        int n = 4;
        char board[] [] = new char[n][n];
        //initialize
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'x';
            }
        }
    }
    // System.out.print("Total Count: " + count);
    // System.out.print(ans);
}

// - ------------------------ n grid to find the any possible solution in grid. TIme complexsity is O(2 exponent n+m ) which is very terrible
// public static int girdWays(int i, int j, int n, int m){
//     if (i == n-1 && j == m-1){
//         return 1;
//     }else if(i == n || j == m){
//         return 0;
//     }
//     int w1 = girdWays(i+1, j, n, m);
//     int w2 = girdWays(i, j+1, n, m);
//     return w1+w2;
// }




// ----------------------
// Backtracking question 1) printing arr using bracktracking
// public static void changeArr(int arr[], int i, int val){
//     // Base Case
//     if (i == arr.length ){
//         printArr(arr);
//         return;
//     }
//     // Kam kia Recursion
//     arr[i] = val;
//     changeArr(arr, i+1, val+1);   
//     arr[i] = arr[i] - 2; 
// }
//         changeArr(arr, 0, 1);


// =================== print sebset of string "abc" using backtracking 
// public static void subSet(String str, String ans, int i ){
//     // base Case
//     if (i == str.length()){
//         if (str.length() == 0){
//          System.out.println("null");
//         }else{
//             System.out.println(ans);
//         }
//         return;
//     }
//     // Kam kia Recusrsion
//     // yes
//     subSet(str, ans + str.charAt(i), i+1);

//     // No
//     subSet(str, ans, i+1);
// }


// ============== print the permutation of String "abc" n!
// public static void permutation(String str, String ans){
//     // Base Case
//     if (str.length() == 0){
//         System.out.println(ans);
//         return;
//     }

//     // kam kiya recursion
//     for (int i = 0; i < str.length(); i++){
//         char curr = str.charAt(i);
//         String revCharString = str.substring(0, i) + str.substring(i+1);
//         permutation(revCharString, ans+curr);
//     };

// }