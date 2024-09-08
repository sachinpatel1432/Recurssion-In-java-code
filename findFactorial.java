import java.util.*;

public class findFactorial {

        public static int printFact (int n) {
                
                if (n == 0) {
                        return 1;
                }
                
                int fact = n * printFact(n-1);
                return fact; 
        }

        public static void main(String[] args) {
                int n = 5;
                System.out.println(printFact(n));

        }
}
