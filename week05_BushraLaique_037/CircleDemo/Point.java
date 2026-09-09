package CircleDemo;

import java.util.Objects;

public class Point implements Cloneable {
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
        public String toString(){
            return "(x,y):"+"("+this.x+","+this.y+")";
        }
        public boolean equals(Point other){
            if(this.x==other.x&&this.y==other.y){
                return true;
            }
            else{
                return false;
            }
        }
        @Override
        public int hashCode(){
            return Objects.hash(x,y);
        }
        @Override
    public Point clone()throws CloneNotSupportedException{
            return (Point)super.clone();
        }
    }
