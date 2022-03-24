import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

   public static long sortTime;

    public static void mergeSort(String[] a, int from, int to) {
    long start = System.currentTimeMillis();
        if (from == to) {
            return;
        }
        int mid = (from + to) / 2;
        // sort the first and the second half
        mergeSort(a, from, mid);
        mergeSort(a, mid + 1, to);
        merge(a, from, mid, to);
    long end=System.currentTimeMillis();
    sortTime=end-start;
    }// end mergeSort

//see c algo

    public static void merge(String[] a, int from, int mid, int to) {
        int n = to - from + 1;       // size of the range to be merged
        String[] b = new String[n];   // merge both halves into a temporary array b
        int i1 = from;               // next element to consider in the first range
        int i2 = mid + 1;            // next element to consider in the second range
        int j = 0;                   // next open position in b

        // as long as neither i1 nor i2 past the end, move the smaller into b
        while (i1 <= mid && i2 <= to) {
            if (a[i1].compareTo(a[i2]) < 0) {
                b[j] = a[i1];
                i1++;
            } else {
                b[j] = a[i2];
                i2++;
            }
            j++;
        }

        // note that only one of the two while loops below is executed
        // copy any remaining entries of the first half
        while (i1 <= mid) {
            b[j] = a[i1];
            i1++;
            j++;
        }

        // copy any remaining entries of the second half
        while (i2 <= to) {
            b[j] = a[i2];
            i2++;
            j++;
        }

        // copy back from the temporary array
        for (j = 0; j < n; j++) {
            a[from + j] = b[j];
        }
    }//end merge
    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter number of items: ");
      int num = scanner.nextInt();
      
      //if user inputs ---------
       System.out.println("Enter the items: "); 
       String[] items = new String[num];
       for (int i = 0; i < num; i++){
 			items[i] = scanner.next();
       }
      // ---------------------

    //if random strings (does not work yet)
    // String[] items = RandomStringUtils.randomAlphabetic(num);
      
      mergeSort(items, 0, items.length-1);
      System.out.println("Sorted: "+ Arrays.toString(items));
      
      System.out.println("Merge Sort Time: " +sortTime+ "m/s");
    }

}