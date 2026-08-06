package point_triangle;

public class Utility {
        // Static function outside class
        static Point add(Point p1, Point p2) {
            return new Point(p1.getX() + p2.getX(), p1.getY() + p2.getY());
        }
        // Static function outside class
        static Point sub(Point p1, Point p2) {
            return new Point(p1.getX() - p2.getX(), p1.getY() - p2.getY());
        }
}
