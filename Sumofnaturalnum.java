public class Sumofnaturalnum {

        public static int printSumNatural(int n) {
                if (n == 1) {
                        return 1;
                }

                int sum = 0;
                sum += n + printSumNatural(n-1);
                
                return sum;
        }

        public static void main (String[] args) {
                int n = 10;
                System.out.println(printSumNatural(n));

        }
}
