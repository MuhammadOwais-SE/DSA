public class QeueuLinkList {
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Qeueu{
        static Node head = null;
        static Node tail = null;

        static boolean isEmpty(){
            return head == null && tail == null;
        }

        static void add(int data){
            Node newNode = new Node(data);
            
            if(isEmpty()){
                head = tail = newNode;
            }

            tail.next = newNode;
            tail = newNode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.print("Link List is empty.");
                return -1;
            }
            int front = head.data;
            if(tail == head ){
                head = tail = null;
            }else{
                head = head.next;
            }

            return front;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
}
