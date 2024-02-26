import java.util.Scanner;
public class smallestofthreenos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1<num2&num1<num3){
            System.out.println("The Smallest number is "+num1);
        }
        else if(num1<num2&num1<num3){
            System.out.println("The Smallest number is "+num2);
        }
        else
        System.out.println("The Smallest number is "+num3);
    }
}
