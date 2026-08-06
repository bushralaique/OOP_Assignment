package Student;
public class Grades {
    public static void main(String[]args){
        Student s1=new Student("Ali");
        Student s2=new Student("Bushra");
        s1.inpGrades(87,68);
        System.out.println("the average for "+s1.getName()+" "+"is"+" "+s1.getAvg());
        s2.inpGrades(95,98);
        System.out.println("the average for "+s2.getName()+" "+"is"+" "+s2.getAvg());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
