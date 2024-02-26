package LAB;
import java.util.Scanner;
public class grades {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage: ");
        float percentage = sc.nextFloat();
        
        if(percentage<=100 & percentage>90)
            int flag = 1

        switch(flag){
            case 96:
            System.out.println("Wow You got A++ grade");
            break;
            
            case 91...95:
            System.out.println("Hurrah You got A+ grade");
            break;
        }
    }
    
}