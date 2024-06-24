// Calculate fibonocci series by using recurssion in java!!
public class fibonocci {
        public static int fibonocci(int n) {
                // base case!
                if (n == 0 || n == 1) {
                        return n;
                }
                // calculate n - 1!
                int fnm1 = fibonocci(n-1);
                // calculate n - 2!
                int fnm2 = fibonocci(n-2);
                // calculate fibonocci!
                int fibo = fnm1 + fnm2;
                // return!
                return fibo;
        }
        public static void main(String[] args) {
                // Input!
                int n = 5;
                System.err.println(fibonocci(n));
        }
}

        // Output = 0,1,1,2,3,5 
        // last one of 5:
        // Thank You!!
