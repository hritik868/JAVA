public class string_methods_08 {
        public static void main(String[] args) {
            
            String str = "Hello, Hritik!";
            
            
            int length = str.length();
            System.out.println("Length of the string: " + length);
            
            
            String upperCaseStr = str.toUpperCase();
            System.out.println("Uppercase string: " + upperCaseStr);
            
            
            String lowerCaseStr = str.toLowerCase();
            System.out.println("Lowercase string: " + lowerCaseStr);
            
            
            boolean startsWithHello = str.startsWith("Hello");
            System.out.println("Starts with 'Hello': " + startsWithHello);
            
            
            boolean endsWithWorld = str.endsWith("Hritik!");
            System.out.println("Ends with 'Hritik!': " + endsWithWorld);
            
            
            String replacedStr = str.replace("Hritik", "Java");
            System.out.println("After replacement: " + replacedStr);
            
            
            String substring = str.substring(7);
            System.out.println("Substring from index 7: " + substring);
            
            
            String[] parts = str.split(",");
            System.out.println("After split:");
            for (String part : parts) {
                System.out.println(part);
            }
        }
    }