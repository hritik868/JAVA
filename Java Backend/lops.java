import java.util.Scanner;

public class lops {
    public static void Main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int i = 0;
        while(i<arr.length){
            System.out.println("Enter the element at index "+i);
            int ele = sc.nextInt();
            arr[i] = ele;
            i++;
        }

    }
}

