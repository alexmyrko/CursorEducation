package homework6.task2;

public class DoublyLinkedList1<T> {
    private Node head = null;
    private Node tail = null;

    public void enqueue(T data){
        Node node = new Node(data);
        if (tail == null)
            tail = node;
        if (head != null) {
            node.next = head;
        }
        head = node;
        System.out.println("Added to queue: " + data);
    }

    public T dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        T data = null;
        if (tail == head) {
            data = (T) tail.data;
            tail = head = null;
        } else {
            Node pointer = head;
            while (pointer != null) {
                if (pointer.next == tail)
                    break;
                pointer = pointer.next;
            }

            data = (T) tail.data;
            tail = pointer;
            tail.next = null;
        }
        System.out.println("Dequeued element: " + data);
        return data;
    }

    public boolean isEmpty(){
        if (head == null)
            return true;
        else return false;
    }

    public int size() {
        int count = 0;
        Node pointer = head;
        while(pointer != null){
            count++;
            pointer = pointer.next;
        }
        return count;
    }
}
