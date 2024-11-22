package DSA;
import java.util.ArrayList;
import java.util.Arrays;
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
        public static void optimiseKnapSack(int[] val, int[] w, int capacity ){
            Arrays.sort(boxTypes, (a, b) -> b[1] - a[1] );
            int maxValue = 0;
    
            for(int i=0; i<boxTypes.length; i++){
                int boxesTake = Math.min(truckSize, boxTypes[i][0]);
                truckSize -= boxesTake;
                maxValue += boxesTake * boxTypes[i][1];
                if (truckSize == 0){
                    break;
                }
            }
            return maxValue;
        }
    public static void main(String args []){
        int[] startTime = {1, 0, 5, 8, 3, 5};
        int[] endTime   = {2, 6, 7, 9, 4, 9};

        // activitySelection(startTime, endTime);
        // activitySelection2D();

        int[] val = {60, 100 , 120};
        int[] w ={10, 20, 30};
        int capacity = 50;
        fractionKnapSack(val, w, capacity);
    }
}