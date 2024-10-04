//Imported required class from its package.
import java.util.Scanner;

// Parent class Vehicle is created.
class Vehicle{
    //Data Encapsulated.
    private String brand;
    
    //Constructor to Initialize Vehicle.
    public Vehicle(String brand){
        this.brand = brand;
    }
    
    //Method to get Brand.
    public String getBrand(){
        return brand;
    }
    
    //Method to Start Vehicle.
    public void start(){
        System.out.println(brand+ " is starting");
    }
    
    //Mehthod to Honk vehicle.
    public void honk(){
        System.out.println("Start vehicle Horn :- Beep");
    }
}

//Child class Car inherited from Vehicle.
class Car extends Vehicle{
    
    //Constructor to Initialize Car.
    public Car (String brand){
        //Calling the parent class Constructor.
        super(brand);
    }
    // Overriding the honk method to change the behavior for Car
    @Override
    public void honk(){
        System.out.println("Start Car horn:- Honk");
    }
    
}
//Main class
public class main{
    //Main Method
    public static void main(String[] args){
        //Getting input from User.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Brand of Vehicle:- ");
        String vehicleBrand = sc.nextLine();
        
        //Object creation for vehicle class
        Vehicle vehicle = new Vehicle(vehicleBrand);
        
        //Methods called from vehicle class
        vehicle.start();
        vehicle.honk();
        
        System.out.println("Enter the Brand of Car:- ");
        String carBrand = sc.nextLine();
        //Object Creation for Car class.
        Car car = new Car(carBrand);
        //Methods Called in car class.
        car.start();
        car.honk();
    }
}

