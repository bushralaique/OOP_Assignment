package Student;

import java.util.Objects;

public class Student {
    private String name;
    private double t1score;
    private double t2score;
    Student(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void  inpGrades(double t1score,double t2score){
            if((t1score>=0 && t1score<=100)&& (t2score>=0 &&t2score<=100)){
                this.t1score=t1score;
                this.t2score=t2score;
            }
            else{
                System.out.println("score should be between 0 and 100");
        }
    }
    public double getAvg(){
        double avg=(this.t1score+this.t2score)/2.0;
        return avg;
    }
    public String toString(){
        return "name:"+" "+ name+" "+"test1score:"+" "+t1score+" "+" "+"test2score:"+" "+t2score;
    }
    @Override
    public int hashCode(){
        return Objects.hash(this.name,this.t1score,this.t2score);
    }
}
