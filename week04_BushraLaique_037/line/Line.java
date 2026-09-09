package line;

public class Line {
    private Point p1;
    private Point p2;
    Line(){
        this.p1=new Point(8,2);
        this.p2=new Point(3,6);
    }
    Line(Point p1,Point p2){
        this.p1=new Point(p1);
        this.p2=new Point(p2);
    }
    Line(Line l){
        this.p1=new Point(l.p1);
        this.p2=new Point(l.p2);
    }
    public Point intersect(Line other){
        double A1=this.p2.getY()-this.p1.getY();
        double B1=this.p1.getX()-this.p2.getX();
        double C1=A1*this.p1.getX()+B1*this.p1.getY();
        double A2=other.p2.getY()-other.p1.getY();
        double B2=other.p1.getX()-other.p2.getX();
        double C2=A2*other.p1.getX()+B2*other.p1.getY();
//        double x= (C1*B2-C2*B1)/A1*B2-A2*B1;
//        double y=(C1*A2-C2*A1)/A1*B2-A2*B1;
        return new Point(((C1*B2-C2*B1)/A1*B2-A2*B1),((C1*A2-C2*A1)/A1*B2-A2*B1));
    }
    public String toString(){
        return "the point p1 of line is"+" "+this.p1+" "+" and p2 is"+" "+this.p2;
    }
    public void display(){
        System.out.println(toString());
    }
}
