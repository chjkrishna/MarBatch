package arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        int[] marks = new int[5];
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        marks[1] = 20;
        marks[3] = 40;
        System.out.println("====After changing====");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println(marks[5]);


    }
}
