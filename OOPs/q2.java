package CSW_Sem_4.src.OOPs;

class Rectangle{
    private double length;
    private double width;

    public Rectangle() {
        this.length=1.0;
        this.width = 1.0;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    public double calculateArea() {
        return length * width;
    }
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
public class q2 {
    public static void main(String[]args){
        Rectangle r1=new Rectangle();
        r1.setLength(56.0);
        r1.setWidth(4.0);
        System.out.println(" Length: " + r1.getLength());
        System.out.println(" Width: " + r1.getWidth());
        System.out.println("Area of the Rectangle: " + r1.calculateArea());
        System.out.println("Perimeter of the Rectangle: " + r1.calculatePerimeter());
    }
}
