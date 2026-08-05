package CarDemo;

public class Main {
    public static void main(String[]args){
        Car bmw=new Car();
        Car tesla=new Car();
        bmw.setDetails("BMW","black","Die with the smile");
        tesla.setDetails("Tesla","White","Favourite");
        bmw.startEngine();
        tesla.startEngine();
        bmw.accelerate(30);
        tesla.accelerate(60);
        bmw.brake(5);
        tesla.brake(10);
        bmw.vehicleDirection(90);
        tesla.vehicleDirection(192);
        bmw.detectAccident();
        bmw.deployAirbag();
        tesla.detectAccident();
        tesla.deployAirbag();
        bmw.turboMode();
        tesla.turboMode();
        tesla.display();
        bmw.display();
    }
}
