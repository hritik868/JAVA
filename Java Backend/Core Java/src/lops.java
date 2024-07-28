import java.util.Scanner;

public class lops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        int i = 0;
//        Taking input to array using while loop
        while(i<arr.length){
            System.out.print("Enter the element at index "+i+ ": ");
            int ele = sc.nextInt();
            arr[i] = ele;
            i++;
        }
        sc.close();
//
////        printing array element using for loop
//        for(int j=0;j<arr.length;j++){
//            System.out.println("Element at index "+j+" = "+arr[j]);
//
////        printing array element using for-each loop
//        for(int elements :arr){
//            int k = 0;
//            System.out.println("Element = "+elements);

//        printing in reverse order
                for(i = arr.length-1;i>=0;i--){
                    System.out.println(arr[i]);
    }

    }
}

