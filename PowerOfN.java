public class PowerOfN {

        public static int PowerOfN(int x , int n) {
                if ( n == 1) {
                        return 2;
                }
                return x * PowerOfN(x , n-1);
        }
        public static void main(String[] args) {
                int x = 2;
                int n = 10;
                System.out.println(PowerOfN(x, n));

        }
}
