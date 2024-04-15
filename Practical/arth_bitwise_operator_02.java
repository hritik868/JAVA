public class arth_bitwise_operator_02{
    public static void main(String[] args) {

        int a = 19;
        int b = 11;
        
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
      
        
        System.out.println("\nBitwise Operators:");
        System.out.println("Bitwise AND: " + (a & b)); 
        System.out.println("Bitwise OR: " + (a | b));
        System.out.println("Bitwise XOR: " + (a ^ b));
        System.out.println("Bitwise NOT: " + (~a));    
        System.out.println("Left Shift: " + (a << 1)); 
        System.out.println("Right Shift: " + (a >> 1));
    }
    
}
