package Pointincrement;

public class Pointarray {
    private Point[] anArray;
    private Point value;
    Pointarray(){
        this.anArray=new Point[]{new Point(1,2),new Point(3,4)};
        this.value=new Point(1,1);
    }
    public void increment(){
        for(int i=0;i<this.anArray.length;i++){
            this.anArray[i]=this.anArray[i].add(this.value);
        }
    }
    public String toString(){
        String s=" ";
        for(int i=0;i<this.anArray.length;i++){
            s=s+","+this.anArray[i];
        }
        return s;
    }
}
