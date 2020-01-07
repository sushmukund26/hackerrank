import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

	public static int height(Node root) {
      	int height = -1;
        Queue<Node> nodes = new LinkedList<Node>();
        nodes.add(root);

        while(!nodes.isEmpty()) {
            int nodesCount = nodes.size();
            height++;

            while(nodesCount != 0) {
                //Remove current level nodes and add the next level nodes
                Node curr = nodes.poll();
                nodesCount--;
                if(curr.left != null) {
                    nodes.add(curr.left);
                }
                if(curr.right != null) {
                    nodes.add(curr.right);
                }
            }
        }
        return height;
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }	
}
