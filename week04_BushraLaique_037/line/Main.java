package line;

public class Main {
    public static void main(String[]args){
        Vector1 v1=new Vector1(1,2);
        Vector1 v2=new Vector1();
        v1.display(v2);
        Point p1=new Point();
        Point p2=new Point(2,3);
        Point p3=new Point(3,4);
        Point p4=new Point(4,5);
        System.out.println("Free vector"+p1.sub(p2));//return free vector
        Line l1=new Line(p1,p2);
        Line l2=new Line(p3,p4);
        System.out.println(l1.intersect(l2));
        l1.display();
    }
}
