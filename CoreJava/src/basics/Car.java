package basics;

public class Car {

    // state - speed, owner, color, etc
    // accessSpecifier dataType name = value;
    public int speed = 10;
    public String owner = "Navya";
    public String color = "Yellow";

    //behaviour
    // accessspecifier returnType name () { .. }

    public void canMove() {
        System.out.println("Car is moving...");
    }

}
