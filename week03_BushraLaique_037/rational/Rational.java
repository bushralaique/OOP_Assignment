package rational;

public class Rational {
    private int p;
    private int q;
    public static int count=0;
    Rational(){
        this.p=2;
        this.q=2;
        count++;
    }
    Rational(int p,int q){
        this.p=p;
        if(q!=0){
            this.q=q;
        }
        else {
            System.out.println("Denominator cannot be zero");
        }
        count++;
    }
    Rational(Rational other){
        this.p=other.p;
        if(other.q!=0){
            this.q=other.q;
        }
        else {
            System.out.println("Denominator cannot be zero");
        }
        count++;
    }
    public int objCount(){
        return count;
    }
    public void set(int p,int q){
        this.p=p;
        this.q=q;
    }
    public int getP(){
        return this.p;
    }
    public int getQ(){
        return this.q;
    }
    public String toString(){
        return "the numerator is"+" "+this.p+" "+"and the denominator is"+" "+this.q;
    }
    public Rational add(Rational other){
        int numerator= this.p*other.q+this.q*other.p;
        int denominator=this.q*other.q;
        return new Rational(numerator,denominator);
    }
    public Rational sub(Rational other){
        int numerator= this.p*other.q-this.q*other.p;
        int denominator=this.q*other.q;
        return new Rational(numerator,denominator);
    }
    public Rational mul(Rational other){
        int real=this.p* other.q-this.q*other.p;
        int img=this.p* other.q+this.q*other.p;
        return new Rational(real,img);
    }
    public Rational div(Rational other){
        int real=(this.p* other.q-this.q*other.p)/(other.p*other.p+other.q*other.q);
        int img=this.p* other.q+this.q*other.p/(other.p*other.p+other.q*other.q);
        return new Rational(real,img);
    }
    public void display(Rational other){
        System.out.println(add(other));
        System.out.println(sub(other));
        System.out.println(mul(other));
        System.out.println(div(other));
    }
}
