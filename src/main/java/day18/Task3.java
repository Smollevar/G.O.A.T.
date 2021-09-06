package day18;

import com.sun.source.tree.BinaryTree;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        Task3.creatingTree(14, root);
        Task3.creatingTree(23, root);
        Task3.creatingTree(11, root);
        Task3.creatingTree(16, root);
        Task3.creatingTree(22, root);
        Task3.creatingTree(27, root);
        Task3.creatingTree(5, root);
        Task3.creatingTree(15, root);
        Task3.creatingTree(18, root);
        Task3.creatingTree(24, root);
        Task3.creatingTree(150, root);
        Task3.creatingTree(8, root);
        Task3.dfs(root);
    }

    private static Node creatingTree(int i, Node root) {
        if (root == null) {
            return new Node(i);
        }
        if (i < root.getNode()) {
            root.left = creatingTree(i, root.left);
        } else if (i > root.getNode()) {
            root.right = creatingTree(i, root.right);
        } else {
            return root;
        }
        return root;
    }

    public static void dfs(Node node) {
        if (node != null) {
            dfs(node.left);
            System.out.print(" " + node.getNode());
            dfs(node.right);
        }
    }
}
