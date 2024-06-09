package CSW_Sem_4.src.OOPs;
class Point {
    double x;
    double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
}   
public class Q3 {
    public static void main(String[] args) {
       
        Point point1 = new Point(3.0, 4.0);
        System.out.println("Initial Point 1: (" + point1.getX() + ", " + point1.getY() + ")");
        
       
        Point point2 = new Point(point1);
        
        System.out.println("Initial Point 2 (copy of Point 1): (" + point2.getX() + ", " + point2.getY() + ")");
        
        point1.setX(5.0);
        point1.setY(6.0);
        
        
        System.out.println("Modified Point 1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Values of Point 2 (copy of Point 1): (" + point2.getX() + ", " + point2.getY() + ")");
    }
}


