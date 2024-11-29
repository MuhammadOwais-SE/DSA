
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class greedy{
// ================= activity selection without sorting 
    // public static void activitySelection(int[] start, int[] end){
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     int maxActivity = 0;
    //     // activity
    //     ans.add(0);
    //     maxActivity = 1;
    //     int lastEnd = end[0];
    //     for(int i=1; i<end.length; i++){
    //         if(start[i] >= lastEnd){
    //             ans.add(i);
    //             lastEnd = end[i];
    //             maxActivity++;
    //         }
    //     }
    //     System.out.println("max Activity: "+ maxActivity);
        
    //     for(int i=0; i<ans.size(); i++){
    //         System.out.print("A"+ans.get(i)+ " ");
    //     }
    // }


    // ================= activity selection with sorting 
    public static void activitySelection(int[] start, int[] end){
            ArrayList<Integer> ans = new ArrayList<>();
        
        // Create an array of indices and sort them based on the end times
        Integer[] indices = new Integer[start.length];
        for (int i = 0; i < start.length; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, Comparator.comparingInt(i -> end[i]));
        
        int maxActivity = 1;
        ans.add(indices[0]); // Select the first activity
        int lastEnd = end[indices[0]];
        
        // Loop through the sorted activities
        for (int i = 1; i < start.length; i++) {
            int activityIndex = indices[i];
            if (start[activityIndex] >= lastEnd) {
                ans.add(activityIndex);
                lastEnd = end[activityIndex];
                maxActivity++;
            }
        }
        
        System.out.println("Max Activity: " + maxActivity);
        
        System.out.print("Selected activities: ");
        for (int activity : ans) {
            System.out.print("A" + activity + " ");
        }
        System.out.println();
    }

    // public static void activitySelection2D(){
    //     int[] start = {1, 0, 5, 8, 3, 5};
    //     int[] end  =  {2, 6, 7, 9, 4, 9};
        
    //     int[][] act2D = new int[start.length][3];
    //     for (int i = 1; i < start.length; i++) {
    //         act2D [i][0]= i;
    //         act2D [i][1]= start[i];
    //         act2D [i][2]= end[i];
    //     }
    //     // Llambda function -> short form
    //     Arrays.sort(act2D,   Comparator.comparingDouble(o -> o[2]));
        
    //     int maxAct = 0;
    //     ArrayList <Integer> ans = new ArrayList<>();

    //     // 1st activity
    //     maxAct = 1;
    //     ans.add(0);
    //     int lastEnd = act2D[0][2];
    //     for(int i=1; i<end.length; i++){
    //         if(act2D[i][1] >= lastEnd){
    //             ans.add(act2D[i][0]); 
    //             lastEnd = act2D[i][2];
    //             maxAct++;
    //         }
    //     }

    //     System.out.println("Max Activity: " + maxAct);
        
    //     System.out.print("Selected activities: ");
    //     for (int activity : ans) {
    //         System.out.print("A" + activity + " ");
    //     }
    //     System.out.println();

    // }

    // ============================== Fraction knapsack

        public static void fractionKnapSack(int[] val, int[] w, int capacity ){
            int [] ratio = new int[val.length];
            for(int i=0; i<val.length; i++){
                ratio[i] = val[i]/w[i];
            }

            int maxVal = 0;
            for(int i=0; i<val.length; i++){
                if(capacity>0){
                    if(capacity> w[i]){
                        capacity = capacity - w[i];  
                        maxVal = maxVal + val[i];
                    }else{
                        maxVal = (ratio[i] * capacity) + maxVal;
                        capacity = 0;
                    }
                }
            }
            System.out.print(maxVal);
        }
        // =============== another simplified approach to solve knapsack in 2D
        // public static void optimiseKnapSack(int[] val, int[] w, int capacity ){
        //     Arrays.sort(boxTypes, (a, b) -> b[1] - a[1] );
        //     int maxValue = 0;
    
        //     for(int i=0; i<boxTypes.length; i++){
        //         int boxesTake = Math.min(truckSize, boxTypes[i][0]);
        //         truckSize -= boxesTake;
        //         maxValue += boxesTake * boxTypes[i][1];
        //         if (truckSize == 0){
        //             break;
        //         }
        //     }
        //     return maxValue;
        // }

// =============----------- india coin change problem
        // public static int coinChange(int[] coins, int amount) {
        //     Arrays.sort(coins, Collection.reverseOrder());
        //     int countCoins = 0;
        //    for(int i=0; i<coins.length; i++){
        //         if(coins[i]>amount){
        //             amount -= coins[i];
        //             countCoins += 1;
        //         }
        //    } 
        //    return countCoins;
        // }

// ===============---- Choco Probolem( Minimum amount of cost by horizontal and vertical cutting )
    public static void minCost(Integer[] costVer, Integer[] costHor, int m, int n) {
        int h = 0, v = 0; // Indices for horizontal and vertical cost arrays
        int hp = 1, vp = 1; // Pieces along horizontal and vertical
        int cost = 0;

        // Sort costs in descending order
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        // Process both arrays until one of them is exhausted
        while (v < costVer.length && h < costHor.length) {
            if (costVer[v] >= costHor[h]) {
                // Vertical cut
                cost += costVer[v] * hp; // Add cost of vertical cut
                vp++; // Increase vertical pieces
                v++;
            } else {
                // Horizontal cut
                cost += costHor[h] * vp; // Add cost of horizontal cut
                hp++; // Increase horizontal pieces
                h++;
            }
        }

        // Process remaining vertical cuts
        while (v < costVer.length) {
            cost += costVer[v] * hp;
            v++;
        }

        // Process remaining horizontal cuts
        while (h < costHor.length) {
            cost += costHor[h] * vp;
            h++;
        }

        System.out.println("Minimum cost: " + cost);
    }
    
    public static void main(String args []){
        int[] startTime = {1, 0, 5, 8, 3, 5};
        int[] endTime   = {2, 6, 7, 9, 4, 9};

        // activitySelection(startTime, endTime);
        // activitySelection2D();

        int[] val = {60, 100 , 120};
        int[] w ={10, 20, 30};
        int capacity = 50;
        // fractionKnapSack(val, w, capacity);

        int[] coins= {1,2,5};
        int amount = 11;
        // System.out.println(coinChange(coins, amount));
        // coinChange(coins, amount);

        int m= 4,  n=6;
        Integer[] costVer = {2, 1, 3, 1, 4};
        Integer[] costHor = {4, 1, 2};

        minCost(costVer, costHor, m, n);
    }
}