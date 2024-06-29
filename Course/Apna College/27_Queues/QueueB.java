import java.util.ArrayDeque;
import java.util.Queue;

public class QueueB {
    // static class Node {
    // int data;
    // Node next;

    // Node(int data) {
    // this.data = data;
    // this.next = null;
    // }
    // }

    // static class Queue {
    // static Node head = null;
    // static Node tail = null;
    // // int[] arr;
    // // int size;
    // // int rear;
    // // int front;

    // Queue(int n) {
    // // arr = new int[n];
    // // size = n;
    // // rear = -1;
    // // front = -1;
    // }

    // public boolean isEmpty() {
    // // return rear == -1 && front == -1;
    // return head == null && tail == null;
    // }

    // public void add(int data) {
    // // if (isFull()) {
    // // System.out.println("Queue is full");
    // // return;
    // // }
    // // if (front == -1) {
    // // front = 0;
    // // }
    // // rear = (rear + 1) % size;
    // // arr[rear] = data;
    // Node newNode = new Node(data);
    // if (head == null) {
    // head = tail = newNode;
    // return;
    // }
    // tail.next = newNode;
    // tail = newNode;
    // }

    // public int remove() {
    // if (isEmpty()) {
    // System.out.println("Queue is empty");
    // return -1;
    // }
    // // int result = arr[front];
    // // if (front == rear) {
    // // front = -1;
    // // rear = -1;
    // // } else {
    // // front = (front + 1) % size;
    // // }
    // // return result;
    // int front = head.data;
    // if (head == tail) {
    // head = tail = null;
    // } else {
    // head = head.next;
    // }
    // return front;
    // }

    // public int peek() {
    // if (isEmpty()) {
    // System.out.println("Queue is empty");
    // return -1;
    // }
    // // return arr[front];
    // return head.data;
    // }
    // }

    public static void main(String[] args) {
        // Queue q = new Queue(3);
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
