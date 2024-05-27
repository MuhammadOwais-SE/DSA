package DSA;

public class Recursion7 {
    public static void main(String[] args) {
    System.out.print("Recursion questions in java");
    }
}
//--------------------Q1 Print the number in Increment 
    // public static void printIncre(int n){
    //     if(n ==1){
    //         System.out.print(1);
    //         return;
    //     }
    //     printIncre(n-1);
    //     System.out.print("  "+n);
    // }

    // public static void printDecre(int n){
    //     if(n ==1){
    //         System.out.print(" "+1);
    //         return;
    //     }
    //     System.out.print("  "+ n);
    //     printDecre(n-1);
    // }

//-------------------- Is the array is sorted or not?
    // public static boolean isSort(int array [], int i){
    //     if (i == array.length-1){
    //         return true;
    //     }
    //     if (array[i] > array[i+1]){
    //         return false;
    //     }
    //     return  isSort(array, i+1);
    // }

//------------------Fibonacci
    // public static int fibonacci(int n){
    //     if(n==1 || n==0){
    //         return n;
    //     }
    //     int sum = fibonacci(n-1) + fibonacci(n-2);
    //     return sum;
    // }

//-------------------------------FisrtOccurance 
    //     public static int firstOccur(int arr [], int key, int i){
    //     if (arr[i] == key){
    //         return i;
    //     }if (i < arr.length-1){
    //         return -1;
    //     }
    //     return firstOccur(arr, key, i+1);
    // }
//--------------------------- lastOccurance
    //     public static int lastOccur(int arr [], int key, int i){
    //     if  (i == arr.length){
    //         return -1;
    //     }
    //     int isFound = lastOccur(arr, key, i+1); 
    //     if(isFound != -1 ){
    //         return isFound;
    //     } 
    //     if(key == arr[i]){
    //         return i;
    //     }
    //     return isFound;
    // OR
    //     // if(isFound == -1 && key == arr[i]){
    //     //     return i;
    //     // }
    // }
    // --------------Q9 calculatte the power O(n)
        //   public static int powerNum(int x,int n){
        // //    base case
        // if (n == 0){
        //     return 1;
        // }
        // // power calculation:
        // return x * powerNum(x, n-1);
        // }

        //-----------------------Q10 calculate the power in optimise way O(logn) 
        // public static int optimisePower(int x, int n){
        //     // base  case 
        //     if(n == 0 ){
        //         return 1;
        //     }
        //     // even case:
        //     int powerhalf = optimisePower(x, n/2);
        //     int powerhalfSq = powerhalf * powerhalf;
            
        //     // odd case
        //     if(n%2 != 0){
        //         powerhalfSq = x * powerhalfSq;
        //     }
        //     return powerhalfSq;
        // }

        //--------   Q11 Tiling Problem Given a "2xn" board or floor and tiles of size "2x1" count number of ways to the given  board using the 2x1 tiles(horizontally or vertically)
    //    public static int tilesProblem(int n){
    //     // base case
    //     if (n == 1 || n == 0){
    //         return 1;
    //     }
    //     // vertical case 
    //     int fnm1 = tilesProblem(n-1);

    //     // horizontal case 
    //     int fnm2 = tilesProblem(n-2);

    //     int totalTiles = fnm1 + fnm2;
    //     return totalTiles;
    //    }

//------------ Q12 Remove the dupicate from the String 
    //   public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
    //         // Base Case:
    //         if(idx == str.length()){
    //             System.out.print(newStr);
    //             return;
    //         }
    //         char currChar = str.charAt(idx);
    //         if(map[currChar - 'a'] == true){
    //             removeDuplicate(str, idx+1, newStr, map);
    //         }else {
    //             map[currChar - 'a'] = true;
    //             removeDuplicate(str, idx+1, newStr.append(currChar), map);
    //         }

    //     }

        //-----Q13 Given n friends, each one can remain singe or can be pair up with some other firend.Each friend can be paired only once.
        // Find out the total number of ways in which friends can remain single or can be paired up
        // public static int pairFrnd(int n){
        //     // base case 
        //     if(n==0 || n==1){
        //         return 1;
        //     }
        //     // single
        //     int fnm1 = pairFrnd(n-1);
        //     // pair up
        //     int fnm2 = pairFrnd(n-2);
        //     int totchoice = (n-1) * fnm2;
            
        //     int totways = fnm1 + totchoice;
        //     return totways;
        // }
             //  Q)14 Consective of 1
        // public static void binString(int n, int lastPlace, String str){
        //     // base case
        //     if (n == 0){
        //         System.out.println(str);
        //         return;
        //     }
        //     binString(n-1, 0, str+"1");
        //     if(lastPlace == 0){
        //         binString(n-1, 1, str+"1");
        //     }
        // }

        // Extra problem 
        //-----------------   Q Find the index of the occurance number
    // public static void indexOccur(int key, int indx, int[] arr){
    //     // base case 
    //     if(indx == arr.length){
    //         return;
    //     }
    //     if(key == arr[indx]){
    //         System.out.println(indx);
          
    //     }     
    //     indexOccur(key, indx+1, arr);
    // }
   