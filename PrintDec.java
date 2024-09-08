// import java.util.*;
// public class PrintDec {

//         public static void printDec(int n ) {
//                 if (n == 1) {
//                         System.out.print(n + " ");
//                         return;
//                 }
//                 System.out.print(n + " ");
//                 printDec(n-1);
//         }
//         public static void main(String[] args) {
//                 int n = 10;
//                 printDec(n);

//         }
// }
// increasing !

import java.util.*;
public class PrintDec {

        public static void printDec(int n ) {
                if (n == 10) {
                        System.out.print(n + " ");
                        return;
                }
                System.out.print(n + " ");
                printDec(n+1);
        }
        public static void main(String[] args) {
                int n = 1;
                printDec(n);

        }
}
