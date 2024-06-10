package CSW_Sem_4.src.DataStructure;
class TreeNode {
    int val;
    TreeNode left, right;

    // Constructor to create a new node
    public TreeNode(int item) {
        val = item;
        left = right = null;
    }
}

class BinarySearchTree {
    TreeNode root;

    // Constructor to initialize the BST with an empty root
    public BinarySearchTree() {
        root = null;
    }

    // Method to insert a new node into the BST
    public void insert(int val) {
        root = insertRec(root, val);
    }

    // Recursive method to insert a new node into the BST
    private TreeNode insertRec(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insertRec(root.left, val);
        } else if (val > root.val) {
            root.right = insertRec(root.right, val);
        }

        return root;
    }

    // Method to delete a node from the BST
    public void delete(int val) {
        root = deleteRec(root, val);
    }

    // Recursive method to delete a node from the BST
    private TreeNode deleteRec(TreeNode root, int val) {
        if (root == null) {
            return root;
        }

        // Recur down the tree
        if (val < root.val) {
            root.left = deleteRec(root.left, val);
        } else if (val > root.val) {
            root.right = deleteRec(root.right, val);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.val = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.val);
        }

        return root;
    }

    // Method to find the node with the minimum value in a tree
    private int minValue(TreeNode root) {
        int minValue = root.val;
        while (root.left != null) {
            minValue = root.left.val;
            root = root.left;
        }
        return minValue;
    }

    // Method for in-order traversal to verify the tree
    public void inOrder() {
        inOrderRec(root);
    }

    // Recursive method for in-order traversal
    private void inOrderRec(TreeNode root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.val + " ");
            inOrderRec(root.right);
        }
    }

    public static void main(String[] args) {
        // Creating the BST
        BinarySearchTree tree = new BinarySearchTree();
        int[] elements = {50, 30, 20, 40, 70, 60, 80};

        // Inserting elements into the BST
        for (int el : elements) {
            tree.insert(el);
        }

        // In-order traversal before deletion
        System.out.println("In-order traversal before deletion:");
        tree.inOrder();
        System.out.println();

        // Deleting a node with no children
        tree.delete(20);
        System.out.println("In-order traversal after deleting node with no children (20):");
        tree.inOrder();
        System.out.println();

        // Deleting a node with one child
        tree.delete(30);
        System.out.println("In-order traversal after deleting node with one child (30):");
        tree.inOrder();
        System.out.println();

        // Deleting a node with two children
        tree.delete(50);
        System.out.println("In-order traversal after deleting node with two children (50):");
        tree.inOrder();
        System.out.println();
    }
}
