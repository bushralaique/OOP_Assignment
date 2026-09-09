package CircleDemo;
public class Main {
    public static void main(String[]args){

                try {
                    Point cen = new Point(0, 0);

                    // Valid circle
                    Circle c1 = new Circle(3, cen);
                    c1.display();  // Output: The area of circle is: 28.27

                    // Invalid circle - will throw exception
                    Circle c2 = new Circle(-5, cen);
                    c2.display();

                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
        }
}
