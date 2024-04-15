
public class methodoverloading_area {

        // for square
        public static double calcArea(double side) {
            return side * side;
        }
        
        // for rectangle
        public static double calcArea(float length, float breadth) {
            return length * breadth;
        }
        
        // for triangle
        public static double calcArea(double base, double height) {
                return 0.5 * base * height;
        }
        
        public static void main(String[] args) {

            // area of square
            double squareArea = calcArea(5);
            System.out.println("Area of square with side 5: " + squareArea);
            
            //area of rectangle
            double rectangleArea = calcArea(4, 6);
            System.out.println("Area of rectangle with length 4 and breadth 6: " + rectangleArea);
            
            //area of triangle
            double triangleArea = calcArea(3d, 4d);
            System.out.println("Area of triangle with base 3 and height 4: " + triangleArea);
        }
    }
