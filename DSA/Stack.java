// Stack Implementation by LinkedList
class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class Stack {
    Node head;

    public Stack() {
        this.head = null;
    }

    public void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        System.out.println(data + " is pushed to the Stack !");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int pop() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return result;
        }
        result = head.value;
        head = head.next;
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return head.value;
    }

    public void delete() {
        this.head = null;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);  // 1 is pushed to the Stack !
        stack.push(2);  // 2 is pushed to the Stack !
        stack.push(3);  // 3 is pushed to the Stack !

        System.out.println("The top element is " + stack.peek());  // The top element is 3

        stack.pop();
        stack.pop();
        stack.pop();

        if (stack.isEmpty()) {
            System.out.print("The stack is empty");
        }
        else {
            System.out.print("The stack is not empty");
        }
    }
}
