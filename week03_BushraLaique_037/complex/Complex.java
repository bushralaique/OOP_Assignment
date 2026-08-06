package complex;

public class Complex {
    private double real;
    private double img;
    public static int count=0;
    Complex(){
        this.real=1;
        this.img=1;
        count++;
    }
    Complex(double real,double img){
        this.real=real;
        this.img=img;
        count++;
    }
    Complex(Complex other){
        this.real=other.real;
        this.img=other.img;
        count++;
    }
    public int objCount(){
        return count;
    }
    public void set(){
        this.real=real;
        this.img=img;
    }
    public double getReal(){
        return this.real;
    }
    public double getImg(){
        return this.img;
    }
    public Complex add(Complex other){
        return new Complex (real+other.real,this.img+other.img);
    }
    public Complex sub(Complex other){
        return new Complex (this.real-other.real,this.img-other.img);
    }
    public void display(Complex other){
        System.out.println("Addition:"+" "+add(other));
        System.out.println("Subtraction:"+" "+sub(other));
    }
    public String toString(){
        return "The real part is"+" "+this.real+" and the img part is"+" "+this.img;
    }
}
