package DSA.ArrayList;
import java.util.ArrayList;

public class Arraylist9 {
    //  pair sum using brute force
public static boolean pairSum(ArrayList<Integer> list, int target){
    for(int i = 0; i < list.size(); i++){
        for (int j = i+1; j<list.size(); j++){
            if (list.get(i)+list.get(j) == target){
                return true;
            }
        }
    } 
    return false;
}

// store maximum amount of water using 
// brute force
public static int waterStore(ArrayList<Integer> height){
    int maxWater = 0;
    for(int i = 0; i<height.size(); i++){
        for (int j = height.size()-1; j<height.size(); j++){
            int ht = Math.min(height.get(i), height.get(j));
            int width = j-i;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);
        }
    }
    return maxWater;
}


// =============================== waterStorePointer
// Optmise method using two pointer approach
public static int waterStorePointer(ArrayList<Integer> height){
    int maxWater = 0;
    int lp = 0;
    int rp = height.size() - 1;

    while (lp < rp) {
        // calculate the water
        int ht = Math.min(height.get(lp),height.get(rp));
        int width = rp - lp;
        int currWater = width * ht;
        maxWater = Math.max(currWater, maxWater);
        // update the pointer
        if (height.get(lp) < height.get(rp)){
            lp++;
        }else{
            rp--;
        }
    }
    return maxWater;
}

//  -=-=-=-==================pairsumRotate
// when the array is not in order 
// public static boolean pairSumRotate(ArrayList<Integer> list, int target){
//     int bp = -1;
//     int n =list.size();
//     for (int i = 0; i < list.size(); i++){
//         if (list.get(i) < list.get(i+1)){
//             bp = i;
//             break;
//         };
//     }

//         int rp = bp;
//         int lp = bp+1;
//         while (rp != lp){

//             if (list.get(lp)+list.get(rp) == target){
//                 System.out.println(list.get(lp)+ " + "+list.get(rp)+ " = " + target);
//                 return true;
//         }
//         if(list.get(lp)+list.get(rp) < target){
//               lp = (lp +1 )% n;
//         } else{
//             rp = (n +rp-1) % n;
//         }
//     }
//     return false;
// }


}
