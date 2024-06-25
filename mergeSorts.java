// Mearg Sort by using recurssion in python!!
public class mergeSorts {

        // Print Array !!
        public static void printArr(int arr[]) {
                for (int i=0; i<arr.length; i++) {
                        System.err.print(arr[i] +" ");
                }
                System.err.println();
        }


        public static void mergeSorts(int arr[] , int si , int ei) {
                if (si >= ei) {
                        return;
                }
                int mid = si + (ei - si) /2;
                mergeSorts(arr, si, mid);
                mergeSorts(arr, mid+1, ei);
                mergSort(arr, si, mid, ei);

        }

        public static void mergSort(int arr[] , int si , int mid , int ei) {
               int temp[] = new int [ei-si+1];
               int i = si;
               int j = mid + 1;
               int k = 0;
               while (i <= mid && j <= ei) {
                if (arr[i] < arr[j]) {
                        temp[k] = arr[i];
                        i++; 
                } else {
                        temp[k] = arr[j];
                        j++;
                }
                k++;
               } 

               // left part!

               while (i <= mid) {
                temp[k++] = arr[i++];
               }
               
               // right part!

               while (j <= ei) {
                temp[k++] = arr[j++];
               }
               
               // copy temp to orignal array!

               for (k=0, i=si; k<temp.length; k++, i++) {
                arr[i] = temp[k];
               }
        }

        // Main function or input!!
        public static void main(String[] args) {
        int arr[] = {1,5,4,2,1};
        mergeSorts(arr , 0 , arr.length-1);
        printArr(arr);
        }
}

        // Output = 1,1,2,4,5!!