package CSW_Sem_4.src.DataStructure;
class Country {
    String name;
    int population;
    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }
    public int getPopulation() {
        return population;
    }
    @Override
    public String toString() {
        return name + ", Population:" + population;
    }
}
class BNode {
    Country info;
    BNode left, right;
    public BNode(Country item) {
        info = item;
        left = right = null;
    }
}
public class q3BST {
    BNode root;
    public q3BST() {
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
            System.out.print(root.info+" -> ");
            inOrderRec(root.right);
        }
    }

    public static void main(String[] args) {
        q3BST tree = new q3BST();

        tree.insert(new Country("USA", 331002651));
        tree.insert(new Country("India", 1380004385));
        tree.insert(new Country("China", 1439323776));
        tree.insert(new Country("Brazil", 212559417));
        tree.insert(new Country("Pakistan", 220892340));

        System.out.println("In-order traversal:");
        tree.inOrder();
    }
}
