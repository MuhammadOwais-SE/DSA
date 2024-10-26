

public class Sort3 {
    public static void main(String[] args) {
        System.out.print("Sort questions");
    }
}

//============ selectionSort
 // public static void selectionSort(int arr[]){
    //     for(int turn=0; turn<arr.length-1; turn++){
    //         int minVal = turn; // min postion wala element
    //         for(int j = turn+1; j<arr.length; j++){
    //             if (arr[minVal] > arr[j] ){  /// this will detect the smallest element in an array
    //                 minVal = j;
    //                 System.out.print("    "+arr[j] +" minval: " + arr[minVal]);
    //             }
    //         }
    //         //swap
    //         int temp = arr[minVal];
    //         arr[minVal] = arr[turn];
    //         arr[turn] = temp;
         
    //     }
    // }

// ------------ bubble sort
   // public static void bubbleSort(int arr[]){
    //     for(int turn = 0; turn<arr.length-1; turn++){
    //         for(int j = 0; j<arr.length-1-turn; j++){
    //             if(arr[j] > arr[j+1] ){
    //                 //swap 
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    // }
// ============ best buy and sell
// public static int Stock_maxProfit(int price[]){
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for ( int i = 0; i<price.length; i++){
//             if ( buyPrice < price[i]){
//                 int profit = price[i] - buyPrice;
//                 maxProfit = Math.max(maxProfit, profit);
//             }else{
//                 buyPrice = price[i]; 
//             }
//         }
//         return maxProfit;

//     }

    // public static int binarySearch(int numbers[], int key) {
    //     int start = 0;
    //     int end = numbers.length-1;
    //     while(start <= end){
    //         int mid = (start+end)/2;
    //         if ( numbers[mid] == key){// found
    //              return mid;
    //         }
    //         if ( numbers[mid] < key){ // right
    //             start = mid+1;
    //         }else{
    //             end = mid-1;
    //         }
    //     }
    //     return -1;
    // }
    
// public static void insertionSort(int arr[]){
//                 for (int i = 1; i<arr.length; i++){
//                         int curr = arr[i]; //
//                         int prev = i-1;
//                         while(prev >=0 && arr[prev] > curr){
//                                 arr[prev+1] = arr[prev]; 
//                                 prev--;
//                         }
//                         arr[prev+1] = curr;
//                 }
//         }

        //    public static void selectionSort(int arr []) {
       
        //         for(int i = 0; i<arr.length-1; i++ ){
        //                 int minPos = i;
        //                 for(int j = i+1; j<arr.length; j++){
        //                         if(arr[j] > arr[minPos]){
        //                                 minPos = j;
        //                         }
        //                 }
        //                 int temp = arr[i];
        //                 arr[i] = arr[minPos];
        //                 arr[minPos] = temp;
        //         }
                
        // }

