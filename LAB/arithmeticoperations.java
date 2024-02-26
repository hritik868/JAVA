import java.util.Scanner;

class arithmeticoperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose one Bitwise operation:\n 1.Add \n 2.Subtract\n 3.Multiply\n 4.Divide\n 5.Modulus");
        int operation = sc.nextInt();

        float num1 = 0;
        float num2 = 0;

        if(0<=operation & operation<=5) {
            System.out.println("Enter two numbers:");
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        }
        else System.out.println("Choose a valid operation");

        switch (operation){
            case 1:
                float sum = num1+num2;
                System.out.println("Sum of entered values = "+sum);
                break;

            case 2:
                float diff = num1-num2;
                System.out.println("Difference of entered values = "+diff);
                break;

            case 3:
                float mul = num1*num2;
                System.out.println("Product of entered values = "+mul);
                break;

            case 4:
                float div = num1/num2;
                System.out.println("Division of entered values = "+div);
                break;

            case 5:
                float mod = num1 % num2;
                System.out.println("Modulus of entered values = "+mod);
                break;

        }
    }
}
