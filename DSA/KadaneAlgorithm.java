public class KadaneAlgorithm {
    public static void main(String[] args) {
        // Largest Sum Contiguous Subarray

        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println("Brute Force : " + largestSumOfContiguousSubarrayByBruteForce(arr));
        System.out.println("Optimized : " + largestSumOfContiguousSubarrayOptimized(arr));
        System.out.println("Kadane's Algorithm : " + largestSumOfContiguousSubarrayByKadaneAlgorithm(arr));

    }

    public static int largestSumOfContiguousSubarrayByBruteForce(int[] arr) {
        /*
        * Time Complexity: O(N*N*N)
        * Space Complexity: O(1)
        * */
        int maxSum = Integer.MIN_VALUE;
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {

//                Compute the sum of arr[start, end] using a third loop
//                with index 'mid'. Update 'maxSum' if we found a new max subarray sum.

                int sum = arr[start];
                maxSum = Math.max(sum, maxSum);
                for (int mid = start+1; mid < end; mid++) {
                    sum = Math.max(arr[mid], arr[mid] + sum);
                    maxSum = Math.max(sum, maxSum);
                }
            }
        }
        return maxSum;
    }

    public static int largestSumOfContiguousSubarrayOptimized(int[] arr) {
        /*
         * Time Complexity: O(N*N)
         * Space Complexity: O(1)
         * */
        int maxSum = Integer.MIN_VALUE;
        for (int start = 0; start < arr.length; start++) {

//            Compute the sum of arr[start, end] and update
//            'maxSum' if we found a new max subarray sum

            int sum = arr[start];
            maxSum = Math.max(sum, maxSum);
            for (int end = start+1; end < arr.length; end++) {
                sum += arr[end];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

    public static int largestSumOfContiguousSubarrayByKadaneAlgorithm(int[] arr) {
        /*
         * Time Complexity: O(N)
         * Space Complexity: O(1)
         * */
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
            if (sum < 0)
                sum = 0;
            if (sum > maxSum)
                maxSum = sum;
        }
        return maxSum;
    }

}
