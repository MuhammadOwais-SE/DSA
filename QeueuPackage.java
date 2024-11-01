import java.util.*;

public class QeueuPackage {
    // Queue<Integer> q1;
    // Queue<Integer> q2;
    





public static void nonRepeat(String str){
    Queue<Character> q = new LinkedList<>();
    int[] freq = new int [26];
    for(int i=0 ; i<str.length() ; i++){
        char ch = str.charAt(i);
        q.add(ch);
        freq[ch-'a']++;
        while (!q.isEmpty() && freq[q.peek()-'a'] > 1) {
            q.remove();
        }

        if(q.isEmpty()){
            System.out.print(-1+ " "); 
        }else{
            System.out.print(q.peek()+ " ");
        }
    }
        
}




public static void main(String arg[]){
    String str = "aabccxb";
    nonRepeat(str);
}












    //-------------- build stack using Qeueu ---- making the push function big of O(n)
    //     static class myStack{ 
    //     Queue<Integer> q1;
    //     Queue<Integer> q2;

    //     public myStack(){
    //         q1 = new ArrayDeque<>();
    //         q2 = new ArrayDeque<>();
    //     }
        
    //     public void add(int data){
    //         while(!q1.isEmpty()){
    //             q2.add(q1.remove());
    //         } 
    //         q1.add(data);
    //         while(!q2.isEmpty()){
    //             q1.add(q2.remove());
    //         } 
    //     }

    //     public int remove(){
    //         if(q1.isEmpty()){
    //             return -1;
    //         }
    //         return q1.remove();
    //     }

    //     public int peek(){
    //         if(q1.isEmpty()){
    //             return -1;
    //         }
    //         return q1.peek();
    //     }

    //     public boolean isEmpty(){
    //         return q1.isEmpty();
    //     }

    //     public static void main(String arg[]){
    //         myStack s = new myStack();
    //         s.add(1);
    //         s.add(2);
    //         s.add(3);

    //         System.out.println(s.remove());
    //         System.out.println(s.peek());
    //     }

    // }


    // ------------- build Qeueu using stacks. 
    // static class Qeueu{
    //     static Stack<Integer> s1 = new Stack<>();
    //     static Stack<Integer> s2 = new Stack<>();
        
    //     public static boolean isEmpty(){ 
    //         return s1.isEmpty();
    //     }

    //     public static void add(int data){
    //         while(!s1.isEmpty()){
    //             s2.add(s1.pop());
    //         }

    //         s1.add(data);

    //         while(!s2.isEmpty()){
    //             s1.add(s2.pop());
    //         }
            
    //     }

    //     public static int remove(){
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return s1.pop();
    //     }

    //     public static int peek(){
    //         return s1.peek();
    //     }
    // }
    // public static void main(String arg[]){
    //     Qeueu q = new Qeueu();
    //     q.add(1);
    //     q.add(2);
    //     q.add(3);

    //     while (!q.isEmpty()) {
    //         System.out.println(q.remove());
            
    //     }

    // }
}
