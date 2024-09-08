public class FirstOccerence {

        public static int firstoccerence(int arr[] , int key , int i) {
                if (i == 0) {
                        return -1;
                }

                if (arr[i] == key) {
                        return i;
                }

                return firstoccerence(arr, key, i-1);
        }
        public static void main(String[] args) {
                int arr[] = {8,3,6,9,5,10,2,5,3,10,8,4,7,6,2,4,5,7};
                int key = 2;
                int i = arr.length-1;

                System.out.println(firstoccerence(arr, key, i));
        }
}
