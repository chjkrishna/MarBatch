package conditions;

public class IfDemo {

    public static void main(String[] args) {

        // if (condition) {...}
        // if (condition) {....} else {....}
        char gender = 'O';

        if (gender == 'M') {
            System.out.println("Male");
        } else if (gender == 'F'){
            System.out.println("Female");
        } else {
            System.out.println("Unknown");
        }
    }
}
