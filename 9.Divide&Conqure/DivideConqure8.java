

public class DivideConqure8 {
    public static void main(String[] args) {
        System.out.print("Divide and Conquer questions in java");
        }
};
// //  Quick Sort 
// public static void quickSort(int [] arr, int si, int ei){
//     // base case
//     if (si >= ei){
//         return;
//     }
//     int pIndex = pivotIndex(arr, si, ei);
//     quickSort(arr, si, pIndex-1); // left sort
//     quickSort(arr, pIndex+1, ei); // right sort

// }
// public static int pivotIndex(int []arr, int si, int ei ){
//     int i = si-1;
//     int pivot =  arr[ei];
    
//     for (int j = si; j <ei; j++){
//         if(arr[j] <= pivot){
//             i++;
//             // swap
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//         }
       
//     }
//     i++;
//     // swap
//     int temp = pivot;
//     arr[ei] = arr[i];
//     arr[i] = temp;
//     return i;
// }
// quickSort(arr, 0, arr.length-1);
// public static int sortRotated( int arr [],int si,int ei,int tar){
//     //   base case
//     if (si > ei){
//         return -1;
//     }
//     // kam kiya calculate mid
//     int mid = si +(ei-si)/2;
    
//     // found the target/case
//     if (arr[mid] == tar){
//         return mid;
//     }
//     // mid on L1
//     if (arr[si] <= arr[mid]){
//         // case a left
//         if (arr[si] <= tar && tar <= arr[mid]){
//           return sortRotated(arr, si, mid-1, tar);
//         }else { //case b right
//            return sortRotated(arr, mid+1, ei, tar);
//         }}
//     // mid on L2
//     else{
//         // case c right
//         if(arr[mid]  <= tar && tar  <= arr[ei]){
//             return sortRotated(arr, mid+1, ei, tar);
//         }else{ // case d left
//             return sortRotated(arr, si, mid-1, tar);
//         }
//     }
//     }
// int arr1[] = {3,4,5,6,0,1,2};
// int target = 6;
// System.out.print(sortRotated(arr1, 0, arr1.length-1, target));