public class Car
{
    String owner;
    String brand;
    int hp;
    double value;
    
    public Car(String carOwner, String carBrand, int carHP, double carValue) {
        owner = carOwner;
        brand = carBrand;
        hp = carHP;
        value = carValue;
    }
    
    public String toString() {
        String rStr = "This " + brand + " car is owned by " + owner + ".";
        rStr += "It is worth $" + value + ".";
        return rStr;
    }
    
    //If you have a data type called FOO, then your getter method is called getFOO();
    public String getOwner() {
        return owner;
    }
    
    public String getBrand() {
        return brand; 
    }
    
    public int getHP () {
        return hp;
    }
    
    public double getValue() {
        return value; 
    }
    
    //If you have a data type called FOO< then your setter method is called setFOO()
    public void setOwner(String newOwner) {
        owner = newOwner;
    }
    
    public void setValue(double newValue) {
        value = newValue; 
    }
}
