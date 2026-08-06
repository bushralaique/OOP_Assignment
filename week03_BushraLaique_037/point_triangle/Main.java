package point_triangle;

public class Main {
    public static void main(String[]args){
        Triangle t1=new Triangle();
        Triangle t2=new Triangle(2,3);
        Triangle t3=new Triangle(2,8,4,5);
        Triangle t4=new Triangle(1,2,3,4,5,6);
        Triangle t5=new Triangle(t2);
        Point p1=new Point(1,2);
        Point p2=new Point(3,4);
        System.out.println(t1.count);
        t3.display();//perimeter and rightangle check
        t4.display();//perimeter and rightangle check
        System.out.println(t1);
        p1.display(p2);//Adding and Subtracting two points using instance method
        System.out.println(Utility.add(p1,p2));//Adding two point using static method
        System.out.println(Utility.sub(p1,p2));//Subtracting two points using static method
    }
}

