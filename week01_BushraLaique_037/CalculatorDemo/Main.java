package CalculatorDemo;

public class Main {
    public static void main(String[] args){
        Calculator casio=new Calculator(10,5);
        Calculator sharp=new Calculator(2,0);
        double[] numbers={1,2,3,4,5};
        double[] empty={};
        casio.display(numbers);
        sharp.display(empty);
    }
}
