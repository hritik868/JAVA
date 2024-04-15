public class primes_in_range_03 {

        public static void main(String[] args) {
            int start = 1;
            int end = 100;
            
            System.out.println("Prime numbers between " + start + " and " + end + ":");
            
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }
        
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            else if (num <= 3) {
                return true;
            }
            if (num % 2 == 0 || num % 3 == 0) {
                return false;
            }
            for (int i = 5; i * i <= num; i += 6) {
                if (num % i == 0 || num % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        }
    
}
