package DSA;

public class Array2 {
    public static void main(String[] args) {
        System.out.print("Array questions");
    }
    
}

   // public static void kadanes(int numbers[]){
        //         int max_sum = Integer.MIN_VALUE;
        //         int currsum = 0;
                
        //         for(int i = 0; i<numbers.length; i++){
        //                 currsum += numbers[i];
        //                 System.out.println(currsum);
        //                 if(currsum < 0){
        //                         currsum = 0;
        //                 }
        //                 max_sum = Math.max(max_sum, currsum);
        //                 if(max_sum < currsum){
        //                         max_sum = currsum;
        //                 }
        //         }
        //         System.out.print(max_sum);

        // }

// ------------------ Sum of subarray
        // public static void sum_array(int numbers[]) {
        //         int currsum = 0;
        //         int max = Integer.MIN_VALUE;
        //         int prefix[] = new int[numbers.length]; 
                
        //         prefix[0] = numbers [0];
        //         System.out.print(prefix[0]);
        //         for (int i = 1; i < prefix.length; i++) {
        //                 prefix[i] = prefix[i-1] + numbers[i];
        //         }
  
        //         for (int i = 0; i < numbers.length; i++) {
        //                 int start = i;
        //                 for (int j = i; j < numbers.length; j++) {
        //                         int end = j;
        //                         currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
        //                         // System.out.println("maximum: " + currsum + ", ");
        //                         if (max < currsum) {
        //                                 max = currsum;
        //                         }
        //                 }

        //         }
        //         System.out.print("max: " + max);
        // }
        // ----------------- Subarray
        // public static void sub_Array(int numbers[]) {
        // int size = numbers.length;
        // int total_p = (size * (size - 1)) / 2;
        // int sum = 0;
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        // for (int i = 0; i < numbers.length; i++) {
        // int start = i;
        // for (int j = i; j < numbers.length; j++) {
        // int end = j;
        // max = 0;
        // sum = 0;

        // // min = 0;
        // for (int k = start; k <= end; k++) {
        // // System.out.print(numbers[k] + " ");
        // sum += numbers[k];
        // }
        // System.out.print("sum : " + sum + " ");

        // if (max < sum) {
        // max = sum;
        // }
        // if (min > sum) {
        // min = sum;
        // }

        // System.out.println();

        // }
        // System.out.println("maximum : " + max);
        // System.out.println("minimum : " + min);
        // min = Integer.MAX_VALUE; // +infinity

     
        // -------------------Array in paris
        // public static void printArray(int numbers[]){
        // int tp = 0;
        // int size = numbers.length;
        // int formula_tp = size * (size-1)/2; //formula for total pairs count
        // for(int i = 0; i < numbers.length; i++){
        // int curr = numbers[i];
        // for( int j = i+1; j < numbers.length; j++){
        // System.out.print("(" + curr + "," + numbers[j] + ")" );
        // sum = curr + numbers[j];
        // }
        // System.out.println();

        // }
        // System.out.print("Total number of pairs :" + formula_tp);
        // }

        // ================Reverse Array (space complexcity is constant. Time complexcity is O(n))
        // public static void reverse_array(int numbers[]){
        // int first = 0, last = numbers.length-1;
        // int temp = 0;
        // while(first < last){
        // temp = numbers[last];
        // numbers[last] = numbers[first];
        // numbers[first] = temp;
        // first++;
        // last--;
        // }
        // }
// ------------------------ reverse array/ print the reverse digits (time and space complicity O(n)) bad for space
// 
// int n = 10899;
// while (n > 0){
// int last = n%10; /// this variable will save the last digit
// n = n/10; /// this varibale will remove the last digit
// rev = (rev*10) + last;  /// this equation will help to make a reverse array and save each digit
// System.out.print(last);
// }
// System.out.print("This value is store in a varibale :" + rev);


