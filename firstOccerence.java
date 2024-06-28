// find firstoccerence of a given array by using recurssion in java!!
public class firstOccerence {
        public static int firstOccerence(int arr[] , int key , int i) {
                // base case!
                if (i == arr.length) {
                        return -1;
                }
                // compaire array indes and key!
                if (arr[i] == key) {
                        return i;
                }
                // call next index!
                return firstOccerence(arr, key, i+1);
        }
        public static void main(String[] args) {
                int arr[] = {1,2,3,4,5,6,7,8,9};
                int key = 9;
                System.err.println(firstOccerence(arr , key, 0));
        }
}
        // Output = 8:
