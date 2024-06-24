// To check the array Sorted or not Sorted by using the Recurssion!!
public class sortedArray {
        public static boolean isSorted(int arr[] , int i) {
                // base case!
                if (i == arr.length - 1) {
                        return true;
                }
                // condition!
                if (arr[i] > arr[i+1]) {
                        return false;
                }
                // return!
                return isSorted(arr, i+1);
        }

        public static void main(String[] args) {
                // Input!
                int arr[] = {1,2,3,4,5};
                System.err.println(isSorted(arr, 0));
        }
}
        // Output =  True!!