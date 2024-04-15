public class primitivedata_01 {
    public static void main(String[] args) {
        System.out.println("Size of primitive data types in bytes:");
        System.out.println("byte: " + Byte.BYTES);
        System.out.println("short: " + Short.BYTES);
        System.out.println("int: " + Integer.BYTES);
        System.out.println("long: " + Long.BYTES);
        System.out.println("float: " + Float.BYTES);
        System.out.println("double: " + Double.BYTES);
        System.out.println("char: " + Character.BYTES);



        System.out.println("Range of primitive data types:");
        System.out.println("byte: from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short: from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int: from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long: from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("float: from " + -Float.MAX_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double: from " + -Double.MAX_VALUE + " to " + Double.MAX_VALUE);
       
    }
}
