// Calculate the factorial by using the recutssion!!
public class factorial {
        public static int fact(int n) {
                // base case!
                if (n <= 1) {
                        return 1;
                }
                // condition!
                int fnm1 = fact(n-1);
                // calculate factorial!
                int fn = n * fnm1;
                // return main!

                // Sachin Patel
                return fn;
        }
        public static void main(String[] args) {
                // Input!
                int n = 5;
                System.err.println(fact(n));
        }
}
        // Output = 1*2*3*4*5 = 120:
        // thank you!!
