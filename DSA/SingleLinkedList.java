public class SingleLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();

        sLL.insertAtEnd(25);
        sLL.insertAtBeginning(2);
        sLL.insertAtBeginning(1);
        sLL.insertAfter(sLL.head.next.next, 30);
        sLL.insertAtEnd(5);
        sLL.printLL();  // 1 2 25 30 5

        sLL.deleteNode(30);
        sLL.printLL();  // 1 2 25 5

        sLL.deleteNode(25);
        sLL.insertAtEnd(10);
        sLL.printLL();  // 1 2 5 10

        sLL.deleteIndex(2);
        sLL.printLL();  // 1 2 10

        sLL.deleteIndex(2);
        sLL.insertAtEnd(9);
        sLL.insertAtEnd(66);
        sLL.printLL();  // 1 2 9 66

        System.out.println(sLL.length());  // 4
        System.out.println(sLL.length(sLL.head));  // 4

        System.out.println(sLL.isAvailable(12));  // false
        System.out.println(sLL.isAvailable(sLL.head, 2));  // true

        sLL.insertAtBeginning(25);
        sLL.printLL();  // 25 1 2 9 66
        sLL.middleNode();  // Middle Element : 2
        sLL.insertAtEnd(43);
        sLL.printLL();  // 25 1 2 9 66 43
        sLL.middleNode();  // Middle Element : 9

        System.out.println(sLL.detectLoop());  // false

        sLL.delete();  // LinkedList deleted!

    }


}

class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class SinglyLinkedList {
    public Node head;

//    public void createSinglyLinkedList(int nodeValue) {
//        head = new Node(nodeValue);
//    }

    // Insert at start of LinkedList
    public void insertAtBeginning(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    // Insert at end of LinkedList
    public void insertAtEnd(int value) {
        if (this.head == null) {
            head = new Node(value);
            return;
        }
        Node temp = head;
        while (true) {
            if (temp.next != null) {
                temp = temp.next;
            } else {
                temp.next = new Node(value);
                break;
            }
        }
        return;
    }

    // Insert after a particular Node
    public void insertAfter(Node prevNode, int value) {
        if (prevNode == null) {
            System.out.println("Previous Node can't be null");
            return;
        }
        Node newNode = new Node(value);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // Delete a Node having a particular value
    public void deleteNode(int value) {
        if (head == null)
            return;
        Node temp = head, prev = null;
        if (temp.value == value) {
            head = head.next;
            return;
        }
        while (temp!=null && temp.value!=value) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null)
            return;
        prev.next = temp.next;
        temp = null;
    }

    // Delete the Node in specified index of LinkedList
    public void deleteIndex(int index) {
        Node temp = head, prev = null;
        int count = 0;
        while (count < index && temp != null) {
            prev = temp;
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Index is larger than LinkedList size!");
            return;
        }
        prev.next = temp.next;
    }

    // Print the LinkedList
    public void printLL() {
        Node node = head;
        while (true) {
            if (node != null) {
                System.out.print(node.value + " ");
                node = node.next;
            } else {
                break;
            }
        }
        System.out.println();
    }

    // Delete LinkedList
    public void delete() {
        this.head = null;
        System.out.println("LinkedList deleted!");
    }

    // Length of a LinkedList [iterative]
    public int length() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    // Length of a LinkedList [recursive]
    public int length(Node node) {
        if (node == null)
            return 0;
        return 1 + length(node.next);
    }

    // Check whether an element is available in LinkedList [iterative]
    public boolean isAvailable(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == value)
                return true;
            temp = temp.next;
        }
        return false;
    }

    // Check whether an element is available in LinkedList [recursive]
    public boolean isAvailable(Node head, int value) {
        if (head == null)
            return false;
        if (head.value == value)
            return true;
        return isAvailable(head.next, value);
    }

    // Print the middle element of LinkedList
    public void middleNode() {
        Node temp = head;
        Node slow_ptr = head;
        Node fast_ptr = head;
        while (fast_ptr != null && fast_ptr.next != null) {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
        }
        System.out.println("Middle Element : " + slow_ptr.value);
    }

    // Detect Loop in a LinkedList
    public boolean detectLoop() {
        // Floyd's Cycle finding Algorithm
        Node slow_ptr = head;
        Node fast_ptr = head;
        while (fast_ptr != null && fast_ptr.next != null) {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
            if (slow_ptr == fast_ptr)
                return true;
        }
        return false;
    }

}
