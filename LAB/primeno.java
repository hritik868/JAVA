import java.util.Scanner;
public class primeno {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive nember: ");
        int num = sc.nextInt();

        int flag = 1;

        if(num==0||num==1)
            flag = 0;

        else if (num>1) {
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    flag = 0;
                    break;
                }
            }
        }

        else
            flag=2;

     if(flag==1)
         System.out.println(num+" is a prime number");

     else if (flag==0) {
         System.out.println(num+" is not a prime number");
     }

     else
         System.out.println("Please enter a positive number");

    }
}