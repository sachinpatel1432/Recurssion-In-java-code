// Sum of all natural numbers by using recurssion!!
public class sumOfNatural {
        public static int sumOfNatural(int n) {
                // base case!
                if (n == 0) {
                        return 0;
                }
                
                // condition!
                int nm1 = sumOfNatural(n-1);
                // nm1 = 4+3+2+1
                int sum = nm1 + n;
                // 5 + nm1 = 15:
                // return !
                return sum;
        }
        public static void main(String[] args) {
                // Input!
                int n = 5;
                System.err.println(sumOfNatural(n));
        }
}       
        // 1+2+3+4+5
        // Output = 15:
