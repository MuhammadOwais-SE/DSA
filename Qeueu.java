public class Qeueu {
    static int []arr;
    static int size;
    static int rear;
    Qeueu(int n){
        arr = new int [n];
        size = n;
        rear = -1;
    }

    public static boolean isEmpty(){
        return rear == -1;
    }

    public static void add(int data){
        if(rear == size-1){
            System.out.println("Array is full, can not add more value: "+ data);
            return;
        }

        rear = rear +1; 
        arr[rear] = data;
    }

    public static int remove(){
        if(isEmpty()){
            System.out.print("list is empty");
            return -1;
        }

        int front = arr[0]; 

        for (int i = 0; i< rear; i++){
            arr[i] = arr[i+1];
        }
        rear--;
        return front;
    }

    public int peek(){
        if(isEmpty()){
            System.out.print("Array is empty. There is nothing to show");
            return -1;
        }
        return arr[0];
    }

    public static void main(String[] args){
        Qeueu q = new Qeueu(3);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(2);

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        
    }
}
