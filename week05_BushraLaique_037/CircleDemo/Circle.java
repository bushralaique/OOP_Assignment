package CircleDemo;

import java.util.Objects;

public class Circle{
    private double rad;
    private Point cen;
    Circle(){
        this.rad=1;
        this.cen=new Point(0,0);
    }
    Circle(double rad,Point p){
        this.rad=rad;
        this.cen=new Point(p);
    }
    Circle(Circle c){
        this.rad=c.rad;
        this.cen=new Point(c.cen);
    }
    public double area(){
        return 2*Math.PI*this.rad;
    }
    public void display(){
        System.out.println(area());
    }
}

