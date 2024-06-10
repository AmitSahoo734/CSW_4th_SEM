package CSW_Sem_4.src.DataStructure;

public class q1BSTNode {
    int info;
    q1BSTNode left, right;

    public q1BSTNode(int item) {
        info = item;
        left = right = null;
    }

    public void insert(int item) {
        if (item < info) {
            if (left == null) {
                left = new q1BSTNode(item);
            } else {
                left.insert(item);
            }
        } else {
            if (right == null) {
                right = new q1BSTNode(item);
            } else {
                right.insert(item);
            }
        }
    }

    public static void main(String[] args) {
        q1BSTNode root = new q1BSTNode(10);

        root.insert(5);
        root.insert(15);
        root.insert(2);
        root.insert(7);
        root.insert(12);
        root.insert(20);
    }
}

