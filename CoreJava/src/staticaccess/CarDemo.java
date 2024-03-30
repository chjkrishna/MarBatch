package staticaccess;

public class CarDemo {

    public static void main(String[] args) {

        Car jayCar = new Car();
        jayCar.brand = "Suzuki";
        jayCar.color = "Gray";

        System.out.println(jayCar.brand);
        System.out.println(jayCar.color);

        Car navyaCar = new Car();
        navyaCar.brand = "Suzuki";
        navyaCar.color = "Red";

        System.out.println(navyaCar.brand);
        System.out.println(navyaCar.color);

        jayCar.brand = "BMW";
        System.out.println("==after changing the brand==");

        System.out.println(jayCar.brand);
        System.out.println(navyaCar.brand);

    }
}
