package rational;

public class Main {
    public static void main(String[]args){
        Rational r1=new Rational();
        Rational r2=new Rational(8,2);
        Rational r3=new Rational(r2);
        System.out.println(r1.objCount());
        r2.display(r1);
    }
}
