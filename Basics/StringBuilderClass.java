public class StringBuilderClass {
    public static void main(String[] args) {
        System.out.println("String Builder ... \n");

        // All methods of StringBuffer are applicable here as well

        // default capacity is 16
        StringBuilder s = new StringBuilder();
        System.out.println(s.capacity()); // 16

        // initializing with capacity
        StringBuilder s1 = new StringBuilder(35);
        System.out.println(s1.capacity()); // 35

        // initializing with string
        StringBuilder s2 = new StringBuilder("Deva Kumar");
        System.out.println(s2.length()); // 10
        System.out.println(s2.capacity()); // 26

        System.out.println("char at index 0 : " + s2.charAt(0)); // D
        s2.deleteCharAt(0);
        s2.insert(0,'B');
        System.out.println("char at index 0 : " + s2.charAt(0)); // B

        System.out.println(s1 instanceof StringBuilder); // true
        System.out.println(s1.getClass().getName()); // java.lang.StringBuilder

//        StringBuffer vs StringBuilder
//        --> StringBuffer: Synchronized. Two threads can't call the methods of StringBuffer simultaneously. Not much efficient
//        --> StringBuilder: Non-synchronized. Two threads can call the methods of StringBuilder simultaneously. Efficient

        // Test to demonstrate performance of both classes
        long startTime = System.currentTimeMillis();
        StringBuffer sbuff = new StringBuffer("i love ");
        for(int i=0; i<1000000; i++) {
            sbuff.append(" me ");
        }
        System.out.println("StringBuffer Time : "+ (System.currentTimeMillis()-startTime) + " ms");

        startTime = System.currentTimeMillis();
        StringBuilder sbuild = new StringBuilder("i love ");
        for(int i=0; i<1000000; i++) {
            sbuild.append(" me ");
        }
        System.out.println("StringBuilder Time : "+ (System.currentTimeMillis()-startTime) + " ms");
    }
}

