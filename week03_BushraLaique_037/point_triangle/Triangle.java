package point_triangle;
public class Triangle {
    private Point verA;
    private Point verB;
    private Point verC;
    private double sideA;
    private double sideB;
    private double sideC;
    static int count=0;
    Triangle(){
        this.verA=new Point(1,2);
        this.verB=new Point(4,5);
        this.verC=new Point(5,9);
        sides();
        count++;
    }
    Triangle(double x1,double y1 ){

        this.verA=new Point(x1,y1);
        this.verB=new Point(x1,y1);
        this.verC=new Point(x1,y1);
        sides();
        count++;
    }
    Triangle(double x1,double y1,double x2,double y2){

        this.verA=new Point(x1,y1);
        this.verB=new Point(x1,y1);
        this.verC=new Point(x2,y2);
        sides();
        count++;
    }

    Triangle(double x1,double y1,double x2,double y2,double x3,double y3 ){

        this.verA=new Point(x1,y1);
        this.verB=new Point(x2,y2);
        this.verC=new Point(x3,y3);
        sides();
        count++;
    }
    Triangle(Triangle p){
        this.verA=new Point(p.verA);
        this.verB=new Point(p.verB);
        this.verC=new Point(p.verC);
        p.sides();
        count++;
    }
    public double perimeter(){
        return  this.sideA+this.sideB+this.sideC;
    }
    public boolean isRightAngle(){
       if( (sideA*sideA+sideB*sideB==sideC*sideC)||(sideA*sideA+sideC*sideC==sideB*sideB)||(sideC*sideC+sideB*sideB==sideA*sideA)){
            return true;
        }
        else{
            return false;
        }
    }
    public double objCount(){
        return count;
    }
    public String toString(){
        return "The verA is"+" "+verA+" "+",verB is"+" "+verB+" "+" and verC is"+" "+verC;
    }
    public void display(){
        System.out.println(perimeter());
        System.out.println(isRightAngle());
    }
    public void sides(){
        this.sideA=verA.distance(verB);
        this.sideB=verB.distance(verC);
        this.sideC=verC.distance(verA);
    }
}
