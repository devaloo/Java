public class StringBufferClass {
    public static void main(String[] args) {
        System.out.println("String Buffer ... \n");

        // default sets capacity to 16 characters
        StringBuffer s = new StringBuffer();
        System.out.println(s.capacity()); // 16

        // initializing with capacity of buffer
        StringBuffer s1 = new StringBuffer(24);
        System.out.println(s1.capacity()); // 24

        // initiaiizing with string
        StringBuffer s2 = new StringBuffer("Deva Kumar");
        System.out.println(s2.length()); // 10
        System.out.println(s2.capacity()); // 26

        // append --> to add at the end
        System.out.println(s1); //
        s1.append("dev");
        System.out.println(s1); // dev

        // insert --> to add at specific index
        s1.insert(0,"deadly ");
        System.out.println(s1); // deadly dev

        // charAt --> returns character at specified index
        char my8thChar = s1.charAt(8);
        System.out.println(my8thChar); // e

        // reverse --> reverses string
        StringBuffer s3 = new StringBuffer("hyper king");
        s3.reverse();
        System.out.println(s3);
        s3.reverse();

        // delete --> deletes characters from specified range
        s3.delete(0,4);
        System.out.println(s3); // r king

        // deleteCharAt --> deletes character at specified index
        s3.deleteCharAt(1);
        System.out.println(s3); // rking

        // replace --> replaces substring in range of index by another word
        StringBuffer s4 = new StringBuffer("GeeksforGeeks");
        s4.replace(5,8,"are");
        System.out.println(s4); // GeeksareGeeks

        // ensureCapacity --> increases capacity to twice of present capacity + 2 / that specified
        System.out.println(s4.capacity()); // 29
        s4.ensureCapacity(50);
        System.out.println(s4.capacity()); // 60

        // substring --> returns substring
        System.out.println(s4.substring(5)); // areGeeks
        
    }
}
