import java.util.Scanner;
public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        double armnum=0;
        int digit,len = 0;
        int temp = num;

        while(temp>0){
            temp /=10;
            len++;
        }
        temp = num;
        while(temp>0){
           digit = temp%10;
           armnum += (int)(Math.pow(digit, len));
           temp /=10;
        }

        if (armnum == num) {
            System.out.println("The number "+num+" is an Armstrong Number");   
        }
        else
        System.out.println("The number "+num+" is not an Armstrong Number");
    }
}