package point_triangle;
public class Point {
    private double x;
    private double y;
    Point(){
        this.x=0;
        this.y=0;
    }
    Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    Point(Point p){
        this.x=p.x;
        this.y=p.y;
    }
    public void set(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public String toString(){
        return "(x,y)"+"("+this.x+","+this.y+")";
    }
    Point add(Point other){
        return new Point(this.x+ other.x,this.y+ other.y);
    }
    Point sub(Point other){
        return new Point(this.x- other.x,this.y- other.y);
    }
    public void display(Point other){
        System.out.println(add(other));
        System.out.println(sub(other));
    }
    public double distance(Point anyVer){
        double X=this.x-anyVer.x;
        double Y=this.y-anyVer.y;
        return Math.sqrt(X*X+Y*Y);
    }
}
