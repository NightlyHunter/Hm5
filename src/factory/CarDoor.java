package factory;

public class CarDoor {
    private boolean doorOpen;
    private boolean windowOpen;

    public CarDoor(boolean doorOpen, boolean windowOpen) {
        this.doorOpen = doorOpen;
        this.windowOpen = windowOpen;
    }

    public CarDoor() {
        doorOpen = false;
        windowOpen = false;
    }

    void OpenTheDoor(){
        doorOpen = true;
    }

    void CloseTheDoor(){
        doorOpen = false;
    }

    void OpenCloseTheDoor(){
        if (doorOpen == true){
            doorOpen = false;
        }else doorOpen = true;
    }

    void OpenTheWindow(){
        windowOpen = true;
    }

    void CloseTheWindow(){
        windowOpen = false;
    }

    void OpenCloseTheWindow(){

        if (windowOpen == true){
            windowOpen = false;
        }else windowOpen = true;
    }

    void DoorStatus(){
        if (doorOpen == true) System.out.println("The door is open");
        if (doorOpen == false) System.out.println("The door is closed");
        if (windowOpen == true) System.out.println("The window is open");
        if (windowOpen == false) System.out.println("The window is closed");
    }
}
