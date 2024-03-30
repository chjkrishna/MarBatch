package basics;

public class PenDemo {

    public static void main(String[] args) {
        Pen jayPen = new Pen();
        jayPen.owner = "Jay";
        jayPen.prenType = "Gel";
        jayPen.color = "Blue";
        jayPen.brand = "Reynolds";

        System.out.println(jayPen.color);
        System.out.println(jayPen.owner);
        System.out.println(jayPen.prenType);
        System.out.println(jayPen.brand);

        System.out.println("======Navya's Pen details======");
        Pen navyaPen = new Pen();
        navyaPen.brand = "Parker";
        navyaPen.owner = "Navya";
        navyaPen.color = "Red";
        navyaPen.prenType = "Ball pen";
        System.out.println(navyaPen.color);
        System.out.println(navyaPen.owner);
        System.out.println(navyaPen.prenType);
        System.out.println(navyaPen.brand);

        jayPen.color = "Black";
        System.out.println(jayPen.color);
        System.out.println(navyaPen.color);

        jayPen.canWrite();
        navyaPen.canWrite();

    }
}
