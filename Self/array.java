package Self;
import java.util.Scanner;
public class array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the "+(i+1)+" of "+size+"th element:");
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter an element to search in the array:");
        int find = sc.nextInt();
        boolean flag = 0;

        for(int i=0;i<size;i++){
            if(arr[i]==find){
                flag = 1;
                break;
            }
        }
        if(flag == 1) {
            System.out.println("Element " + find + " found in the array.");
        } else {
            System.out.println("Element " + find + " not found in the array.");
        }

    }
}
