package factory;

public class CarWheel {

    private double tireLevel;

    public CarWheel(double tireLevel) {
        this.tireLevel = tireLevel;
    }

    public CarWheel() {
        tireLevel = 1;
    }

    void GetNewTire(){
        tireLevel = 1;
    }

    double TireWear(double wearLevel){
        if (wearLevel >= 0&&wearLevel<=1){
            tireLevel = tireLevel-wearLevel;
        }
        else System.out.println("Wrong number");
        return tireLevel;
    }

    void WheelStatus(){
        System.out.println("Tire status equals " + tireLevel * 100 + "%");
    }
}
