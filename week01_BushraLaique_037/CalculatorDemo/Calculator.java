package CalculatorDemo;
public class Calculator {
    private double num1;
    private double num2;
    Calculator(double num1,double num2){
        this.num1=num1;
        this.num2=num2;
    }
    public double add(){
        return this.num1+this.num2;
    }
    public double sub(){
        return this.num1-this.num2;
    }
    public double mul(){
        return this.num1*this.num2;
    }
    public double div(){
        if(num2!=0){
            return num1/num2;
        }
        else{
            System.out.println("denominator cannot be zero");
            return Double.NaN;
        }
    }
    public double avg(double...nums){
        if(nums.length==0){
            System.out.println("No numbers provided.");
            return Double.NaN;
        }
        double average=0;
        double sum=0;
        int a=0;
        for(double num:nums){
            sum=sum+num;
            a++;
        }
        average=sum/a;
        return average;
    }
    public double max(double...nums){
        if(nums.length==0){
            System.out.println("No numbers provided.");
            return Double.NaN;
        }
        double max=nums[0];
        for(double num:nums){
            if(max<num){
                max=num;
            }
        }
        return max;
    }
    public void display(double[] numbers){
        System.out.println("Additon "+" "+add());
        System.out.println("Subtraction "+" "+sub());
        System.out.println("Product"+" "+mul());
        System.out.println("Division "+" "+div());
        System.out.println("Average"+" "+avg(numbers));
        System.out.println("Max"+" "+max(numbers));
    }
}
