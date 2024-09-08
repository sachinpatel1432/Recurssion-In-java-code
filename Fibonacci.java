public class Fibonacci {
        public static int fibonacci(int n) {
                if (n == 1) {
                        return 1;
                }
                if (n == 0) {
                        return 0;
                }

                int fib = fibonacci(n-1) + fibonacci(n-2);
                return fib;
        }

        public static void main(String[] args) {
                int n = 25;
                System.out.println(fibonacci(n));
        }
}
