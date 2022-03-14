import java.util.Stack;

public class FindKthSmallestBST {
    static class Node {
        int val;
        Node left;
        Node right;
        Node(int data){
            this.val = data;
        }
    }
    public static int findKthSmallest(Node root, int k){
        Stack<Node> stack = new Stack<>();
        int n = 0;
        Node current = root;
        while (current != null || !stack.isEmpty()){
            if(current != null){
                stack.push(current);
                current = current.left;
                continue;
            }

            current= stack.pop();
            n += 1;
            if (n == k)
                return current.val;
            current = current.right;
        }
        return -1;
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        Node one = new Node(1);
        Node four = new Node(4);
        Node two = new Node(2);
        root.left = one;
        root.right = four;
        one.right = two;
        System.out.println(findKthSmallest(root, 2));
    }
}
