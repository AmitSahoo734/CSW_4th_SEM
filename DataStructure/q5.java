package CSW_Sem_4.src.DataStructure;
class TreeNode {
    int val;
    q6Node left, right;

    // Constructor to create a new node
    public TreeNode(int item) {
        val = item;
        left = right = null;
    }
}
class BST {
    static q6Node root;
    public BST() {
        root = null;
    }

    public void createTree(int[] arr) {
        root = createTreeRec(arr, 0, arr.length - 1);
    }

    private q6Node createTreeRec(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start+(end-start)/2;
        q6Node node = new q6Node(arr[mid]);
        node.left = createTreeRec(arr, start, mid-1);
        node.right = createTreeRec(arr, mid+1, end);
        return node;
    }

    private void inOrder(q6Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] elements = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        BST tree = new BST();
        tree.createTree(elements);

        System.out.println("In-order traversal of the constructed BST:");
        tree.inOrder(root);
    }
}
