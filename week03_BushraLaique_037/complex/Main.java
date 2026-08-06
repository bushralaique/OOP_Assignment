package complex;

public class Main {
    public static void main(String[]args){
        Complex c1=new Complex();
        Complex c2=new Complex(1,2);
        Complex c3=new Complex(3,4);
        System.out.println(c1);
        System.out.println(c2.objCount());
        c2.display(c3);
    }
}
