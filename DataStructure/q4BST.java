package CSW_Sem_4.src.DataStructure;
//      using BNode ,Country from q3BST
public class q4BST {
    BNode root;
    static BNode max = new BNode(new Country("X" , Integer.MIN_VALUE));
    static BNode min = new BNode(new Country("X" , Integer.MAX_VALUE));
    public q4BST() {
        root = null;
    }

    public void insert(Country item) {
        root = insertRec(root, item);
    }
    private BNode insertRec(BNode root, Country item) {
        if (root == null) {
            root = new BNode(item);
            return root;
        }
        if (item.getPopulation() < root.info.getPopulation()) {
            root.left = insertRec(root.left, item);
        } else if (item.getPopulation() > root.info.getPopulation()) {
            root.right = insertRec(root.right, item);
        }
        return root;
    }
    public void inOrder() {
        inOrderRec(root);
    }
    private void inOrderRec(BNode root) {
        if (root != null) {
            inOrderRec(root.left);
            if(root.info.population < min.info.population){
                min = root ;
            }
            if(root.info.population > max.info.population){
                max = root ;
            }
            System.out.println(root.info+" -> ");
            inOrderRec(root.right);
        }
    }

    public static void main(String[] args) {
        q4BST tree = new q4BST();

        tree.insert(new Country("USA", 331002651));
        tree.insert(new Country("India", 1380004385));
        tree.insert(new Country("China", 1439323776));
        tree.insert(new Country("Brazil", 212559417));
        tree.insert(new Country("Pakistan", 220892340));

        System.out.println("In-order traversal:");
        tree.inOrder();
        System.out.println("MAXIMUM-: "+max.info.name+", "+max.info.population);
        System.out.println("MINIMUM-: "+min.info.name+", "+min.info.population);
    }
}
