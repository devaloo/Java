import java.util.Arrays;
public class BinarySearch {
    public static int binarySearch(int[] arr, int value) {
        int n = arr.length;
        int left = 0, right = n-1;
        int mid = (left + right)/2;
        while (left <= right) {
            if (arr[mid] == value)
                return mid;
            else if (arr[mid] > value) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            mid = (left + right)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {15, 12, 54, 4, 19, 23, 45, 27};
        Arrays.sort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr)); // Sorted Array : [4, 12, 15, 19, 23, 27, 45, 54]

        System.out.println(binarySearch(arr, 54));  //  7
        System.out.println(binarySearch(arr, 34));  // -1
        System.out.println(binarySearch(arr, 23));  // 4
    }
}
