package CSW_Sem_4.src.DataStructure;
public class q2BSTNode {
    int info;
    q2BSTNode left, right;

    q2BSTNode(int item) {
        info = item;
        left = right = null;
    }

    public void insert(int item) {
        if (item < info) {
            if (left == null) {
                left = new q2BSTNode(item);
            } else {
                left.insert(item);
            }
        } else {
            if (right == null) {
                right = new q2BSTNode(item);
            } else {
                right.insert(item);
            }
        }
    }

    public void preOrder() {
        System.out.print(info + " ");
        if (left != null) left.preOrder();
        if (right != null) right.preOrder();
    }

    public void inOrder() {
        if (left != null) left.inOrder();
        System.out.print(info + " ");
        if (right != null) right.inOrder();
    }

    public void postOrder() {
        if (left != null) left.postOrder();
        if (right != null) right.postOrder();
        System.out.print(info + " ");
    }

    public static void main(String[] args) {
        q2BSTNode root = new q2BSTNode(10);

        root.insert(5);
        root.insert(15);
        root.insert(2);
        root.insert(7);
        root.insert(12);
        root.insert(20);

        System.out.print("Pre-order traversal: ");
        root.preOrder();
        System.out.println();

        System.out.print("In-order traversal: ");
        root.inOrder();
        System.out.println();

        System.out.print("Post-order traversal: ");
        root.postOrder();
        System.out.println();
    }
}
