import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        System.out.println(x);
    }
}
