import java.util.Scanner;

class bitwiseoperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose one arithmetic operation:\n 1.OR \n 2.AND\n 3.XOR\n 4.Complement");
        int operation = sc.nextInt();

        int num1 = 0;
        int num2 = 0;

        if(0<operation & operation<4) {
            System.out.println("Enter two numbers:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        }
        else if (operation==4){
            System.out.print("Enter a number: ");
            num1 = sc.nextInt();}
        else
            System.out.println("Choose a valid operation");

        switch (operation){
            case 1:
                int or_ = num1|num2;
                System.out.println("Sum of entered values = "+or_);
                break;

            case 2:
                int and_ = num1&num2;
                System.out.println("Difference of entered values = "+and_);
                break;

            case 3:
                int xor_ = num1^num2;
                System.out.println("Product of entered values = "+xor_);
                break;

            case 4:
                int comp_ = ~num1;
                System.out.println("Division of entered values = "+comp_);
                break;

        }
    }
}