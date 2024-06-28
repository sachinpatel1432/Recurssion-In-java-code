public class lastOccerecnce {
        public static int lastOccerecnce(int arr[] , int key , int i) {
                // base case!
                if (i == arr.length) {
                        return -1;
                }
                // calling next index!
                int isfound = lastOccerecnce(arr, key, i+1);
                // To compare indexes!!
                if (isfound == -1 && arr[i] == key) {
                        return i;
                }
                // last return!!
                return isfound;
        }
        public static void main(String[] args) {
                int arr[] = {1,2,3,4,5,6,7,5,9};
                int key = 5;
                System.err.println(lastOccerecnce(arr , key , 0));
        }
}
        // Output = 7:
