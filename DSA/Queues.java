public class Queues {
    public static void main(String[] args) {

        Queue q = new Queue(3);  // Queue of size 3 created successfully
        System.out.println(q.isEmpty());  // true
        System.out.println(q.isFull());  // false
        q.enQueue(1);  // Successfully added 1 in queue
        q.enQueue(3);  // Successfully added 3 in queue
        q.enQueue(5);  // Successfully added 5 in queue
        q.enQueue(7);  // Queue is Full! Can't insert 7
        System.out.println(q.isFull());  // true
        System.out.println(q.peek());  // 1
        System.out.println(q.deQueue());  // 1
        System.out.println(q.deQueue());  // 3
        System.out.println(q.deQueue());  // 5
        System.out.println(q.deQueue());  // Queue is empty!
        q.delete();  // Queue is deleted!

        System.out.println();

        CircularQueue cq = new CircularQueue(3);  // A Circular Queue with size of 3 is created!
        System.out.println(cq.isFull());  // false
        cq.enQueue(10);  // Successfully added 10 in queue
        cq.enQueue(20);  // Successfully added 20 in queue
        cq.enQueue(30);  // Successfully added 30 in queue
        System.out.println(cq.deQueue());  // 10
        cq.enQueue(40);  // Successfully added 40 in queue
        System.out.println(cq.peek());  // 20
        cq.enQueue(50);  // Queue is full! Can't add 50
        System.out.println(cq.deQueue());  // 20
        System.out.println(cq.deQueue());  // 30
        cq.delete();  // Circular Queue is deleted!

    }
}

class Queue {
    private int[] arr;
    private int beginningOfQueue;
    private int topOfQueue;

    public Queue(int size) {
        this.arr = new int[size];
        this.beginningOfQueue = -1;
        this.topOfQueue = -1;
        System.out.println("Queue of size " + size + " created successfully");
    }

    public boolean isEmpty() {
        if (this.beginningOfQueue == -1 || beginningOfQueue >= arr.length)
            return true;
        return false;
    }

    public boolean isFull() {
        return topOfQueue == arr.length-1;
    }

    public void enQueue(int data) {
        if (isFull()) {
            System.out.println("Queue is Full! Can't insert " + data);
            return;
        }
        if (isEmpty())
            this.beginningOfQueue = 0;
        arr[++topOfQueue] = data;
        System.out.println("Successfully added " + data + " in queue");
    }

    public int deQueue() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return result;
        }
        result = arr[beginningOfQueue];
        beginningOfQueue++;
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[beginningOfQueue];
    }

    public void delete() {
        this.arr = null;
        System.out.println("Queue is deleted!");
    }
}

class CircularQueue {
    private int[] arr;
    private int beginningOfQueue;
    private int topOfQueue;

    public CircularQueue(int size) {
        this.arr = new int[size];
        topOfQueue = -1;
        beginningOfQueue = -1;
        System.out.println("A Circular Queue with size of " + size + " is created!");
    }

    public boolean isEmpty() {
        return this.topOfQueue == -1;
    }

    public boolean isFull() {
        if (topOfQueue+1 == beginningOfQueue)
            return true;
        if (beginningOfQueue==0 && topOfQueue==arr.length-1)
            return true;
        return false;
    }

    public void enQueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full! Can't add " + data);
            return;
        }
        if (isEmpty()) {
            beginningOfQueue = 0;
            arr[++topOfQueue] = data;
        } else {
            if (topOfQueue+1 == arr.length) {
                topOfQueue = 0;
            } else {
                topOfQueue++;
            }
            arr[topOfQueue] = data;
        }
        System.out.println("Successfully added " + data + " in queue");
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if (beginningOfQueue == topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            } else if (beginningOfQueue+1 == arr.length) {
                beginningOfQueue = 0;
            } else {
                beginningOfQueue++;
            }
            return result;
        }

    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[beginningOfQueue];
    }

    public void delete() {
        this.arr = null;
        System.out.println("Circular Queue is deleted!");
    }
}
