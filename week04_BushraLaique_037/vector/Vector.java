package vector;

public class Vector {
    private double a;
    private double b;
    Vector(double a,double b){
        this.a=a;
        this.b=b;
    }
    public Vector projectionOnto(Vector v){
        double dp=this.a*v.a+this.b*v.b;
        double mag=Math.sqrt(v.a*v.a+v.b*v.b);
        double x= (dp/(mag*mag))*v.a;
        double y=(dp/(mag*mag))*v.b;
        return new Vector(x,y);
    }
    public String toString(){
        return "(a,b):"+this.a+","+this.b;
    }
    public void display(Vector v){
        System.out.println(projectionOnto(v));
    }
}
