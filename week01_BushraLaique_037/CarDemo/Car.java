package CarDemo;

public class Car {
    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;
    private String music;
    private String direction;
    private  boolean accidentDetected;
    private boolean airbagDeployed;
   public Car(){
        this.brand="unknown";
        this.color="unpainted";
        this.speed=0;
        this.engineOn=false;
        this.music="any song";
        this.direction="unknown";
        this.accidentDetected=false;
        this.airbagDeployed=false;
    }
    public void setDetails(String brand,String color,String music){
        this.brand=brand;
        this.color=color;
        this.music=music;
    }
    public void startEngine(){
        this.engineOn=true;
        System.out.println(this.brand+" "+"engine started");
    }
    public void stopEngine(){
        this.speed=0;
        this.engineOn=false;
        System.out.println(this.brand+" "+"engine stopped");
    }
    public void accelerate(int speed){
        if(engineOn){
            this.speed=this.speed+speed;
        }
        else{
            System.out.println("turn on the engine");
        }
    }
    public void brake(int speed){
       if(engineOn){
        this.speed=this.speed-speed;
       }
       else{
           System.out.println("turn on the engine");
       }
        if(this.speed<0){
            this.speed=0;
        }
    }
    public void vehicleDirection(double angle){
       if(angle==90){
           this.direction="Moving forward";
       }
       else if (angle==270) {
           this.direction="Moving backwards";
       }
       else if(angle<90 && angle>0){
           this.direction="forward in right direction";
       }
      else if(angle>90 && angle<180){
           this.direction="forward in left direction";
       }
      else if(angle>270 && angle<360){
            this.direction="reverse in right direction";
        }
       else if(angle>180 && angle<270){
            this.direction="reverse in left direction";
        }
    }
    public void detectAccident(){
       this.accidentDetected=true;
    }
    public void deployAirbag() {
       if(accidentDetected && !airbagDeployed){
            airbagDeployed = true;
        }
    }
    public void turboMode(){
       if(engineOn){
           this.speed=this.speed+60;
           System.out.println("Turbo Mode Activated!");
       }
       else{
           System.out.println("turn on the engine");
       }
   }
    public void display(){
        System.out.println("brand:"+" "+this.brand);
        System.out.println("speed:"+" "+this.speed);
        System.out.println("color:"+" "+this.color);
        System.out.println("engineOn:"+" "+this.engineOn);
        System.out.println("musicPlaying:"+" "+this.music);
        System.out.println("direction:"+" "+this.direction);
        System.out.println("Accident detected: " + this.accidentDetected);
        System.out.println("Airbag deployed: " + this.airbagDeployed);
    }
}
