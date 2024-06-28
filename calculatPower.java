// calculate power by using of recurssion in java!!
public class calculatPower {
        public static int power (int x , int n) {
                // base case!
                if (n == 0) {
                        return 1;
                }
                // first type!!
                // int xnm1 = power(x, n-1);
                // int sns = x * xnm1;
                // return sns;
                // secound type!!
                return x * power(x, n-1);
        }

        // Input function!!
        public static void main(String[] args) {
                int n = 10;
                System.err.println(power(2 , n));
        }
}

        // Output = 1024:
