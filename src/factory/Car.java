package factory;

public class Car {

    private String dateOfManufacture;
    private String engineType;
    private int maxSpeed;
    private float timeTo100KmH;
    private int maxPaxCapacity;
    private int paxCapacity;
    private int speed;
    private CarWheel wheelAmount [];
    private CarDoor doorAmaunt [];

    public Car(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public Car(String dateOfManufacture, String engineType, int maxSpeed, float timeTo100KmH, int maxPaxCapacity, int paxCapacity, int speed) {
        this.dateOfManufacture = dateOfManufacture;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.timeTo100KmH = timeTo100KmH;
        this.maxPaxCapacity = maxPaxCapacity;
        this.paxCapacity = paxCapacity;
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void AddPax (){
        paxCapacity++;
    }

    public void RemovePax (){
        paxCapacity--;
    }

    public void RemoveAllPax (){
        paxCapacity = 0;
    }
}
