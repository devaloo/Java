// Question Link
// https://www.geeksforgeeks.org/majority-element/

import java.util.HashMap;
import java.util.Arrays;

public class MajorityElements {
    public static void main(String[] args) {
        // Majority Element in an array

        int[] arr1 = new int[] { 1, 1, 1, 1, 2, 3, 4 };
        int[] arr2 = new int[] {5, 2, 7, 5, 9, 7, 5};

        majorityElementBruteForce(arr1);
        majorityElementBySorting(arr1);
        majorityElementByHashmap(arr1);
        majorityElementMooresAlgorithm(arr1);

        System.out.println();

        majorityElementBruteForce(arr2);
        majorityElementBySorting(arr2);
        majorityElementByHashmap(arr2);
        majorityElementMooresAlgorithm(arr2);

    }

    public static void majorityElementBruteForce(int[] arr) {
        /*
        * Time Complexity: O(N*N)
        * Space Complexity: O(1)
        * */
        int count, maxCount = 0;
        int elementIndex = 0;
        for(int i=0; i<arr.length; i++) {
            count = 0;
            for(int j=0; j<arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > maxCount) {
                elementIndex = i;
                maxCount = count;
            }
        }
        count = 0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == arr[elementIndex])
                count++;
        }
        if (count > arr.length/2)
            System.out.println("(Brute Force) Majority Element: " + arr[elementIndex]);
        else
            System.out.println("(Brute Force) No Majority Element: ");
    }

    public static void majorityElementBySorting(int[] arr) {
        /*
         * Time Complexity: O(N.logN)
         * Space Complexity: O(1)
         * */
        Arrays.sort(arr);
        int n = arr.length;
        int count = 1;
        int maxCount = 0;
        int index = 0;
        for(int i=0; i<n-1; i++) {
            if (arr[i] == arr[i+1]) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    index = i;
                    count = 1;
                }
            }
        }
        if (maxCount > n/2)
            System.out.println("(Sorting) Majority Element: " + arr[index]);
        else
            System.out.println("(Sorting) No Majority Element");
    }

    public static void majorityElementByHashmap(int[] arr) {
        /*
         * Time Complexity: O(N)
         * Space Complexity: O(N)
         * */
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i=0; i<arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]) + 1;
                if (count > arr.length/2) {
                    System.out.println("(HashMap) Majority Element: " + arr[i]);
                    return;
                }
                map.put(arr[i],count);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println("(HashMap) No Majority Element");
    }

    public static void majorityElementMooresAlgorithm(int[] arr) {
        /*
         * Time Complexity: O(N)
         * Space Complexity: O(1)
         * */
        int major_index = 0;
        int count = 1;
        for(int i=1; i<arr.length; i++) {
            if (arr[major_index] == arr[i])
                count++;
            else
                count--;
            if (count == 0) {
                major_index = i;
                count = 1;
            }
        }
        count = 0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == arr[major_index])
                count++;
        }
        if (count > arr.length/2)
            System.out.println("(Moore Voting Algorithm) Majority Element: " + arr[major_index]);
        else
            System.out.println("(Moore Voting Algorithm) No Majority Element: ");
    }
}
