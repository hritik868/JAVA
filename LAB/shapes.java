import java.util.Scanner;
public class shapes {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner scf = new Scanner(System.in);
    System.out.println("Choose a Shape:\n1.Circle\n2.Rectangle\n3.Square");
    int type = sc.nextInt();

    switch (type) {
        case 1:
            System.out.println("Enter the radius of the circle:");
            float r = scf.nextFloat();

            float circum = (float) (2*3.14*r);
            float diameter = 2*r;
            float area = (float) (3.14*r*r); 

     ; 

            System.out.println("For the circle of radius "+r+": ");
            System.out.println("Diameter : "+diameter);
            System.out.println("Circumference : "+circum);
            System.out.println("Area : "+area);
            break;
        case 2:
            System.out.println("Enter the length and breadth of the rectangle:");
            float l = scf.nextFloat();
            float b = scf.nextFloat();

            float perimeter = 2*(l+b);
            float area_r = l*b; 

            System.out.println("For the rectangle of length "+l+"and breadth "+b+": ");
            System.out.println("Perimeter : "+perimeter);
            System.out.println("Area : "+area_r);
            break;
        case 3:
        System.out.println("Enter the length of the square:");
        float side = scf.nextFloat();

        float perimeter_s = 4*side;
        float area_s = side*side; 

        System.out.println("For the square of length "+": ");
        System.out.println("Perimeter : "+perimeter_s);
        System.out.println("Area : "+area_s);
            break;
    
        default:
        System.out.println("Choose the valid shape");
            break;
    }
}    
}
