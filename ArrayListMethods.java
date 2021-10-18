import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Important ArrayList Methods

        ArrayList<Integer> array = new ArrayList<Integer>();

        // add elements at end of list
        array.add(1);  // [1]
        array.add(3);  // [1, 3]
        System.out.println(array);  // [1, 3]

        // add elements at specific index
        array.add(1,2);
        System.out.println(array);  // [1, 2, 3]

        // check whether an element is present in the list  -- boolean
        System.out.println(array.contains(2));  // true
        System.out.println(array.contains(5));  // false

        array.add(5);
        array.add(7);
        array.add(32);

        // access element at an index
        System.out.println(array.get(0));  // 1
        System.out.println(array.get(5));  // 32

        // get index of element or (-1) if not present
        System.out.println(array.indexOf(7));  // 4
        System.out.println(array.indexOf(24));  // -1

        // remove element in this index
        System.out.println(array);  // [1, 2, 3, 5, 7, 32]
        array.remove(3);
        System.out.println(array);  // [1, 2, 3, 7, 32]

        // returns the number of elements in the list
        System.out.println(array.size());  // 5

        // modify an element at an index
        array.set(2, 25);
        System.out.println(array);  // [1, 2, 25, 7, 32]

        // returns an array with list elements
        Integer[] myIntArray = new Integer[array.size()];
        myIntArray = array.toArray(myIntArray);
        System.out.println(Arrays.toString(myIntArray));  // [1, 2, 25, 7, 32]
        
        // check if list is empty  -- boolean
        System.out.println(array.isEmpty());  // false

        // remove all elements in list
        array.clear();
        System.out.println(array);  // []
        System.out.println(array.isEmpty());  // true
    }
}

