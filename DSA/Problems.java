import java.util.Stack;

public class Problems {
    public static void main(String[] args) {
        int result = evaluatePostfix("138*+");
        System.out.println(result);   // 25

        int result2 = evaluatePrefix("+-*22/845");
        System.out.println(result2);   // 7

        String infix = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infix + "(Infix To Postfix) --> " + infixToPostfix(infix));  // abcd^e-fgh*+^*+i-
        System.out.println(infix + "(Infix To Prefix) --> " + infixToPrefix(infix));    // +a-*b^-^cde+f*ghi

        System.out.println(isParanthesisBalanced("[{}])"));     // false
        System.out.println(isParanthesisBalanced("({[{}]})"));  // true
    }

    // Checking for balanced paranthesis
    public static char matchOf(char ch) {
        switch(ch) {
            case ')':
                return '(';
            case '}':
                return '{';
            case ']':
                return '[';
            default:
                return '0';
        }
    }
    public static boolean isParanthesisBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty() || stack.peek() != matchOf(ch))
                    return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    // Helper for precedence of operators  -- higher output -> higher precedence
    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // Reverse a String
    public static String reverse(String word) {
        String rev = "";
        for(int i=word.length()-1; i>=0; i--) {
            rev += word.charAt(i);
        }
        return rev;
    }

    // Infix to Prefix [Polish]
    public static String infixToPrefix(String expression) {
        String result = new String("");
        String reverseInfix = reverse(expression);
        char[] charArray = reverseInfix.toCharArray();
        for(int i=0; i<charArray.length; i++) {
            if (charArray[i] == '(')
                charArray[i] = ')';
            else if (charArray[i] == ')')
                charArray[i] = '(';
        }
        reverseInfix = String.valueOf(charArray);
        String postfix = infixToPostfix(reverseInfix);
        return reverse(postfix);
    }

    // Infix to Postfix
    public static String infixToPostfix(String expression) {
        String result = new String("");
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isLetterOrDigit(c))
                result += c;
            else if (c == '(')
                stack.push(c);
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek()!='(') {
                    result += stack.pop();
                }
                stack.pop();
            }
            else {
                while (!stack.isEmpty() && (precedence(c) <= precedence(stack.peek()))) {
                    result += stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
        }
        return result;
    }

    // Prefix Evaluation
    public static int evaluatePrefix(String expression) {
        Stack<Integer> stack = new Stack<>();
        expression = reverse(expression);
        for(int i=0; i<expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch))
                stack.push(ch - '0');
            else {
                int x = stack.pop();
                int y = stack.pop();
                if (ch == '+')
                    stack.push(x+y);
                else if (ch == '-')
                    stack.push(x-y);
                if (ch == '*')
                    stack.push(x*y);
                if (ch == '/')
                    stack.push(x/y);
            }
        }
        return stack.pop();
    }

    // Postfix Evaluation
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        for(char ch: expression.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int x = stack.pop();
                int y = stack.pop();
                if (ch == '+')
                    stack.push(y+x);
                else if (ch == '-')
                    stack.push(y-x);
                else if (ch == '*')
                    stack.push(y*x);
                else if (ch == '/')
                    stack.push(y/x);
            }
        }
        return stack.pop();
    }
}
