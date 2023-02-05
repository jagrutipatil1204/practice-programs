public class reverseno {

        static boolean isPerfect(int n)
        {
            if (n == 1)
                return false;
            int sum = 1;
            
            for (int i = 2; i < n; i++) {

                if (n % i == 0) {
                    sum += i;
                }

            }

            // If sum of divisors is equal to
            // n, then n is a perfect number
            if (sum == n)
                return true;

            return false;
        }

        // Driver program
        public static void main(String[] args)
        {
            int n = 6;

            // Call isPerfect function to
            // check if the number is perfect or not.
            if (isPerfect(n))
                System.out.println(n + " is a perfect number");
            else
                System.out.println(
                        n + " is not a perfect number");
        }
    }
}
