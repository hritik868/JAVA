import java.util.Scanner;

public class collage_course {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the collage name:");
   String collage = sc.next();
   System.out.println("Enter the course name:");
   String course = sc.next();

   switch (collage) {
    case "MSI":
    case "msi":
                switch (course) {
                    case "BCA":
                    case "bca":
                        System.out.println("Yes MSI have BCA Course");
                        break;

                    case "BBA":
                    case "bba":
                        System.out.println("Yes MSI have BBA Course");
                        break;

                    case "B.COM":
                    case "b.com":
                    case "B.Com":
                        System.out.println("Yes MSI have B.Com Course");
                        break;
                
                    default:
                    System.out.println("Please enter a valid course");
                        break;
                }
        break;

    case "MSIT":
    case "msit":
    switch (course) {
        case "BCA":
        case "bca":
            System.out.println("No MSIT doesn't have BCA Course");
            break;

        case "B.TECH":
        case "BTECH":
        case "B.Tech":
        case "BTech":
        case "b.tech":
        case "btech":
            System.out.println("Yes MSIT have B.Tech Course");
            break;
    
        default:
            System.out.println("Please enter a valid course");
            break;
    }
        break;

    case "VIPS":
    case "vips":
    switch (course) {
        case "BCA":
        case "bca":
            System.out.println("Yes VIPS have BCA Course");
            break;

        case "BBA":
        case "bba":
            System.out.println("Yes VIPS have BBA Course");
            break;

        case "LLB":
        case "llb":
            System.out.println("Yes VIPS have LLB Course");
            break;
    
        default:
        System.out.println("Please enter a valid course");
            break;
    }
        break;
   
    default:
    System.out.println("Please enter a valid collage");
        break;
   }

}
    
}