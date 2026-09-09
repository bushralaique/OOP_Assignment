package line;

public class Point {
    private double x;
    private double y;
    Point(){
        this.x=1;
        this.y=1;
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
    public Vector1 sub(Point other){
        return new Vector1(this.x-other.x,this.y-other.y);
    }
    public String toString(){
        return "(x,y):"+"("+this.x+","+this.y+")";
    }
}
