package basics;

public class CarDemo {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.canMove();
        System.out.println(myCar.speed);
        System.out.println(myCar.owner);

        Car car2 = new Car();
        System.out.println(car2.speed);
        System.out.println(car2.owner);
    }
}
