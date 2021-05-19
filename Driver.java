import java.util.Scanner;
public class Driver
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     
        Car car1; 
        car1 = new Car("Heejin", "Mercedes", 200, 10000000);
        
        // System.out.println("Car1 owner: " + car1.owner);
        // System.out.println("Car1 brand: " + car1.brand);
        // System.out.println("Car1 hp: " + car1.hp);
        // System.out.println("Car1 value: " + car1.value);
        
        System.out.println("Car1: " + car1);
        
        System.out.println(car1.getOwner() + " decided to sell the car.");
        System.out.print("To whom did he sell it to?");
        String newOwn = scan.next();
        System.out.println("How much did he sell it for? " );
        double newVal = scan.nextDouble();
        
        car1.setOwner(newOwn);
        car1.setValue(newVal);
        
        System.out.println("Car1: " + car1);                                                 
    }
}
