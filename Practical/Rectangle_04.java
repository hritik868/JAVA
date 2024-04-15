import java.util.Scanner;

public class Rectangle_04 {
    private double length;
    private double breadth;

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        this.length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        this.breadth = sc.nextDouble();
    }

    public void output() {
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
    }


    public double calcArea() {
        return this.length * this.breadth;
    }

    public static void main(String[] args) {
        Rectangle_04 rect = new Rectangle_04();
        rect.input();
        rect.output();
        System.out.println("Area: " + rect.calcArea());
    }
}
