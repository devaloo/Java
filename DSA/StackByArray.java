// Stack Implementation by Arrays

public class StackByArray {
    int[] arr;
    int topOfStack;

    public StackByArray(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack of size " + size + " created.");
    }

    public boolean isEmpty() {
        return topOfStack == -1;
    }

    public void push(int value) {
        if (topOfStack >= arr.length-1) {
            System.out.println("Stack is full ! Can't push " + value);
            return;
        }
        this.arr[++topOfStack] = value;
        System.out.println(value + " is pushed to Stack");
    }

    public int pop() {
        int result = -1;
        if (topOfStack<0) {
            System.out.println("Stack is empty!");
            return result;
        }
        result = arr[topOfStack--];
        return result;
    }

    public int peek() {
        int result = -1;
        if (topOfStack<0) {
            System.out.println("Stack is empty!");
            return result;
        }
        result = arr[topOfStack];
        return result;
    }

    public void delete() {
        this.arr = null;
        System.out.println("Stack is deleted!");
    }

    public static void main(String[] args) {

        StackByArray stack = new StackByArray(5);  // Stack of size 5 created.
        System.out.println(stack.isEmpty());  // true

        stack.push(1);  // 1 is pushed to Stack
        stack.push(2);  // 2 is pushed to Stack
        stack.push(3);  // 3 is pushed to Stack
        stack.push(4);  // 4 is pushed to Stack
        stack.push(5);  // 5 is pushed to Stack
        stack.push(6);  // Stack is full ! Can't push 6
        
        System.out.println(stack.pop());  // 5
        System.out.println(stack.peek());  // 4
        System.out.println(stack.pop());  // 4
        System.out.println(stack.pop());  // 3
        stack.delete();  // Stack is deleted!

    }
}
