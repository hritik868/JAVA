import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The entered month has 31 days");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The entered month has 30 days");
                break;

            case 2:
               System.out.println("Enter the year: ");
                    int year = sc.nextInt();
                if (year%4==0&&year%100!=0||year%400==0) {
                    System.out.println("The entered month has 29 days");
                    break;
                }
                else
                    System.out.println("The entered month has 29 days");
                    break;
        
            default:
                System.out.println("Enter a valid month number");
                break;
        }

    }
}
