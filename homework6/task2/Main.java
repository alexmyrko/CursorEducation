package homework6.task2;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList stack = new SinglyLinkedList();
        stack.push(3);
        stack.push(5);
        stack.top();
        stack.push(-4);
        stack.pop();
        stack.pop();
        System.out.println("Stack size is: " + stack.size());
        stack.pop();
        stack.pop();
        System.out.println("Stack size is: " + stack.size());
        System.out.println("Is stack Empty ?: " + stack.isEmpty());
        System.out.println();

        DoublyLinkedList1 queue = new DoublyLinkedList1();
        queue.dequeue();
        queue.enqueue(25);
        queue.enqueue(12);
        queue.dequeue();
        System.out.println("Queue size is: " + queue.size());
        queue.enqueue(-5);
        queue.enqueue(7);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println();

        DoublyLinkedList2 linkedList = new DoublyLinkedList2();
        linkedList.addFirst(7);
        linkedList.addFirst(0);
        linkedList.addLast(-5);
        System.out.println("LinkedList size: " + linkedList.size());
        linkedList.add(1, 37);
        linkedList.addLast(20);
        System.out.println("LinkedList size: " + linkedList.size());
        System.out.println("Is linked list empty ? :" + linkedList.isEmpty());
    }
}
