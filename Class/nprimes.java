import java.util.Scanner;

     class nprimes {
        static boolean isprime(int n) {
            if (n <= 1) {
                return false;
            } else {
                for (int i = 2; i <= n / 2; i++) {
                    if(n % i == 0){
                        return false;
                    }
                }
                return true;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number:");
            int n = sc.nextInt();

            System.out.println("Prime numbers up to " + n + ":");
            for (int i = 0; i <= n; i++) {
                if (isprime(i))
                    System.out.println(i);
            }

        }
}