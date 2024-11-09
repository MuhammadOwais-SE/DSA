import java.util.ArrayList;

public class Greedy{

    public static void activitySelection(int[] start, int[] end){
        ArrayList<Integer> ans = new ArrayList<>();
        int maxActivity = 0;
        // activity
        ans.add(0);
        maxActivity = 1;
        int lastEnd = end[0];
        for(int i=1; i<end.length; i++){
            if(start[i] >= lastEnd){
                ans.add(i);
                lastEnd = end[i];
                maxActivity++;
            }
        }
        System.out.println("max Activity: "+ maxActivity);
        
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+ " ");
        }
    }
    public static void main(String args []){
        int[] startTime = {1, 3, 0, 5, 8, 5};
        int[] endTime   = {2, 4, 6, 7, 9, 9};

        activitySelection(startTime, endTime);
    }
}