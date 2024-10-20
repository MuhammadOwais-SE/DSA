import java.util.*;
public class stack26 {

    public static void nextGreater(int [] arr, int[] greater){
        Stack<Integer> s = new Stack<>();        
        for(int i = arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[i] >= arr[s.peek()]){
                s.pop();
            }if(s.isEmpty()){
                greater[i] = -1;
            }else{
                greater[i] = arr[s.peek()]; 
            }
            s.push(i);
        }
    }

    public static void stockSpan(int[] span, int[] stock){
        Stack<Integer> s = new Stack<>();
        span[0]= 1;
        for(int i=0; i<stock.length; i++){
            int currPrice = stock[i];
            while(!s.isEmpty() && currPrice > stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            } else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String arg[]){
        // int[] stock = {100, 80, 60, 70, 60, 85, 100};
        // int[] span = new int[stock.length];
        // stockSpan(span, stock);
        
        int[] arr = {2,4,0,9,6};
        int[] greater = new int [arr.length];
        nextGreater(arr, greater);
        for(int i=0; i<greater.length; i++){
            System.out.print(greater[i] +", ");
        }
    }
}
