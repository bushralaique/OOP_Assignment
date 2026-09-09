package line;

public class Vector1 {
    private double a;
    private double b;
    Vector1(){
        this.a=1;
        this.b=2;
    }
    Vector1(double a,double b){
        this.a=a;
        this.b=b;
    }
    Vector1(Vector1 v){
        this.a=v.a;
        this.b=v.b;
    }
    public double magnitude() {
        return Math.sqrt(a * a + b * b);
    }

    public Vector1 add(Vector1 other) {
        return new Vector1(this.a + other.a, this.b + other.b);
    }

    public Vector1 subtract(Vector1 other) {
        return new Vector1(this.a - other.a, this.b - other.b);
    }

    public double dotProduct(Vector1 other) {
        return this.a * other.a + this.b * other.b;
    }

    public String toString() {
        return "(" + this.a + ", " +this. b + ")";
    }
    public void display(Vector1 other){
        System.out.println("magnitude"+magnitude());
        System.out.println("add"+add(other));
        System.out.println("sub"+subtract(other));
        System.out.println("dotproduct"+dotProduct(other));
    }
}
