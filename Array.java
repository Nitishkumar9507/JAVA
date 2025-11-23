import java.util.Arrays;

public class Array {

    public static void line() {
        System.out.println();
    }

    public static void binarySearch(int[] arr, int key) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                System.out.println("BinarySearch : Key found at index : " + mid);
                break;
            } else if (key > arr[mid]) {// 12345
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }

    public static int[] reverseArr(int[] arr) { // taking array as input and returing array
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }

    public static void main(String[] args) {

        // Declaration
        int[] arr;

        // Memory allocation : default 0
        arr = new int[5];

        // Initialization
        arr[0] = 6;
        arr[1] = 9;
        arr[2] = 11;
        arr[3] = 5;
        // arr[4] = 3; // commented for testing default val

        // Combined
        int[] a = { 3, 21, 4, 45, 5 };

        // Array Iteration (Traversing)
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        line();
        // Using for-Each loop
        for (int val : a) {
            System.out.print(val + " ");
        }
        line();

        // Default value for int
        System.out.print("Default value for int: " + arr[4]);
        line();

        // Linear Searching
        int key = 5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Linear search : Value found at index : " + i);
            }
        }

        // binarySearch
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        binarySearch(arr1, 5);

        // Multidimensional Array (2D Array)

        int[][] mdArray = new int[2][3];// 2(rows) x 3(clms)
        mdArray[0][0] = 1;
        mdArray[0][1] = 2;
        mdArray[0][2] = 3;
        mdArray[1][0] = 4;
        mdArray[1][1] = 5;
        mdArray[1][2] = 6;

        // Iteration
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mdArray[i][j] + " ");
            }
            line();
        }
        line();

        // Jagged Array (Different row size)

        int[][] jag = new int[3][];

        jag[0] = new int[] { 1, 2 };
        jag[1] = new int[] { 10, 20, 30, 40 };
        jag[2] = new int[] { 7 };

        for (int[] row : jag) {
            System.out.println(Arrays.toString(row));
        }
        line();

        // Arrays Class Methods

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        line();

        int index = Arrays.binarySearch(a, 5);
        System.out.println(index);
        line();

        int[] b = Arrays.copyOf(a, 8); // add 0 to index which exceed :[3, 4, 5, 21, 45, 0, 0, 0]
        System.out.println(Arrays.toString(b));
        line();

        int[] c = new int[5];
        Arrays.fill(c, 9);// [9, 9, 9, 9, 9]
        System.out.println(Arrays.toString(c));
        line();

        // Reversing Array
        int[] revArr = new int[arr1.length];
        System.out.println(Arrays.toString(arr1));
        for (int i = arr1.length - 1, j = 0; i >= 0; i--, j++) {
            revArr[j] = arr1[i];

        }
        line();
        System.out.println(Arrays.toString(revArr)); // toString convert to string array and print
        line();

        int l = 0;
        int r = arr1.length - 1;
        while (l < r) {
            int temp = arr1[l];
            arr1[l] = arr1[r];
            arr1[r] = temp;
            l++;
            r--;
        }

        line();
        System.out.println(Arrays.toString(arr1));

        line();
        int[] res = reverseArr(arr1);
        System.out.println(Arrays.toString(arr1));
        line();

        // Prefix Sum Array (Advanced Logic)
        // arr1=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        int[] prefix = new int[arr1.length];
        prefix[0] = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            prefix[i] = prefix[i - 1] + arr1[i];
        }
        line();
        System.out.println("Prefix sum : " + Arrays.toString(prefix));

        // Sliding Window Example
        // Find max sum of any 3 contiguous elements:
        // arr1=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        int k = 3;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum = sum + arr1[i];
        } // return sum of first k index now we have to increase window forward

        int max = sum;
        for (int i = k; i < arr1.length; i++) {
            sum = sum + arr1[i] - arr1[i - k];
            max = Math.max(max, sum);
        }
        System.out.println("Maximum sum of " + k + " contigious elements is : " + max);

        // Matrix operations , sparse matrix -->later

    }
}
