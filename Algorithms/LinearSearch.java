public class LinearSearch {
    public static int linearSearch(int[] arr, int value) {
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == value)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 5, 4, 9, 23, 45, 4};
        System.out.println(linearSearch(arr, 9));  //  4
        System.out.println(linearSearch(arr, 34));  // -1
        System.out.println(linearSearch(arr, 1));  // 0
    }
}
