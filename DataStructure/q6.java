package CSW_Sem_4.src.DataStructure;
class q6Node {
    int val;
    q6Node left, right;
    public q6Node(int item) {
        val = item;
        left = right = null;
    }
}

class BinaryTree {
    q6Node root;
    public BinaryTree() {
        root = null;
    }
    public boolean isBST() {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private boolean isBSTUtil(q6Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.val <= min || node.val >= max) {
            return false;
        }
        return isBSTUtil(node.left, min, node.val) && isBSTUtil(node.right, node.val, max);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new q6Node(10);
        tree.root.left = new q6Node(5);
        tree.root.right = new q6Node(20);
        tree.root.left.left = new q6Node(2);
        tree.root.left.right = new q6Node(8);
        tree.root.right.left = new q6Node(15);
        tree.root.right.right = new q6Node(25);
        if (tree.isBST()) {
            System.out.println("The tree is a binary search tree.");
        } else {
            System.out.println("The tree is not a binary search tree.");
        }
    }
}
