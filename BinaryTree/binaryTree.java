import java.util.Queue;
import java.util.LinkedList;

public class binaryTree{
 static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }    
   } 
    
   static class BinaryTree{
   static int indx=-1;
   public static Node buildTree(int node[]){
      indx++;
      if(node[indx] == -1){
         return null;
      }
      Node newNode = new Node(node[indx]);
      newNode.left = buildTree(node);
      newNode.right = buildTree(node);
      return newNode;
   }
 
   public static void preOrder(Node root){
      if(root == null){
         return;
      }
      System.out.print(root.data + " ");
      preOrder(root.left);
      preOrder(root.right);
   }
   public static void inOrder(Node root){
      if(root == null){
         return;
      }
      preOrder(root.left);
      System.out.print(root.data + " ");
      preOrder(root.right);
   }
   public static void postOrder(Node root){
      if(root == null){
         return;
      }
      postOrder(root.left);
      postOrder(root.right);
      System.out.print(root.data + " ");
   }

   public static void levelOrder(Node root){
      if(root == null){
         return;
      }

      Queue<Node> q = new LinkedList<>();
      q.add(root);
      q.add(null);
      while(!q.isEmpty()){
         Node currNode = q.remove();
         if(currNode == null){
            if(!q.isEmpty()){
               q.add(null);
               System.out.println();
            }else{
               break;  
            }
         }else{
            System.out.print(currNode.data + " ");
            if(currNode.left != null){
               q.add(currNode.left);
            }
            if(currNode.right != null){
               q.add(currNode.right);
            }
         }
      }
   }

   public static int treeHeight(Node root){
      if(root == null){
         return 0;
      }
      int lh = treeHeight(root.left);
      int rh = treeHeight(root.right);
      return Math.max(lh, rh) + 1;
   }
}


public static void main(String arg[]){
   int nodes [] = {1,2,4,-1,-1,5,-1,-1,3, -1,6,-1,-1};
   BinaryTree tree = new BinaryTree();
   Node root = tree.buildTree(nodes);
   // tree.preOrder(root);
   // System.out.println(" ");
   // tree.inOrder(root);
   // System.out.println(" ");
   // tree.postOrder(root);
   // System.out.println(" ");
   tree.levelOrder(root);
   // System.out.println(root.data);
}

}