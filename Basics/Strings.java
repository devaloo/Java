public class Strings {
    public static void main(String[] args) {
        System.out.println("Strings and String Methods");

        String name = "Deva";
        System.out.println(name);
        String anotherName = new String("Kumar");
        System.out.println(anotherName);

        String name2 = "Deva";
        String name3 = new String("Deva");

        // ==   compares references
        System.out.println(name == name2);  // true
        System.out.println(name == name3);  // false
        System.out.println(name2 == name3); // false

        // char charAt(int index)
        System.out.println(name.charAt(2)); // v

        // int length()
        System.out.println(anotherName.length()); // 5

        // String substring(int beginIndex) or String substring(int beginIndex, int endIndex)
        System.out.println(name.substring(1)); // eva
        System.out.println(anotherName.substring(1,4)); // uma

        // boolean contains(String sequence)
        System.out.println(name2.contains("e"));  // true

        // boolean equals(Object obj)  -- compares values rather than reference
        System.out.println(name.equals(name2)); // true
        System.out.println(name3.equals(name)); // true

        // boolean isEmpty()
        System.out.println(name.isEmpty()); // false
        String s = "";
        System.out.println(s.isEmpty()); // true

        // String concat(String str)
        String fullName = name.concat(" Kumar");
        System.out.println(fullName);  // Deva Kumar

        // String replace(char old, char new)  [char or String]
        fullName = fullName.replace("Deva","Pavan");
        System.out.println(fullName);  // Pavan Kumar
        System.out.println();

        // String[] split(String regex)
        String sentence = "Hi My name is Deva";
        String[] words = sentence.split(" ");
        for(String str: words)
            System.out.println(str);

        // int indexOf(String str)
        System.out.println(fullName.indexOf('m')); // 8

        // String toLowerCase()
        System.out.println(fullName.toLowerCase()); // pavan kumar

        // String toUpperCase()
        System.out.println(fullName.toUpperCase()); // PAVAN KUMAR

        // String trim()  -- to remove starting and trailing spaces
        String otherName = "   this is trimmed   ";
        System.out.println(otherName.trim());  // this is trimmed

        // boolean startsWith(String str)
        System.out.println(fullName.startsWith("Pav"));  // true
        System.out.println(fullName.startsWith("pav"));  // false

        // boolean endsWith(String str)
        System.out.println(fullName.endsWith("r"));  // true

        //  int compareTo(String str)  -- compares two strings lexicographically  [str1-str2]
        String str1 = "deva";
        String str2 = "deva";
        String str3 = "beva";
        System.out.println(str1.compareTo(str2));  // 0
        System.out.println(str1.compareTo(str3));  // 2

        // char[] toCharArray(String str)
        char[] nameChar = fullName.toCharArray();
        for(char ch: nameChar)
            System.out.print(ch+" ");  // P a v a n  K u m a r
        System.out.println();

        // Join Array elements with a delimiter
        String greetSentence = "Hello, How are you doing";
        String[] wordsArray = greetSentence.split(" ");
        String joinedSentence = String.join("-",wordsArray);
        System.out.println(joinedSentence);

        // Anagrams Problem - Optimal Solution
        String a = "listen";
        String b = "silent";
        boolean isAnagram = true;
        int[] countOfLetters = new int[256];
        if (a.length() != b.length()) {
            isAnagram = false;
        } else {
            for(char c: a.toCharArray()) {
                countOfLetters[c]++;
            }
            for(char c: b.toCharArray()) {
                countOfLetters[c]--;
            }
            for(int i=0;i<256;i++) {
                if (countOfLetters[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }
        if (isAnagram)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");

        // Reverse words in a sentence
        // input:  I love java, the coffee
        // output: coffee the Java, love I
        String input = "I love Java, the coffee";
        String output = "";
        String[] wordsChar = input.split(" ");
        for (int i=wordsChar.length-1; i>=0; i--) {
            output += wordsChar[i] + " ";
        }
        System.out.println(output);
    }
}
