package homework6.task2;

public class SinglyLinkedList<T> {
    Node head = null;

    public void push(T data){
        Node node = new Node(data);
        if (head != null)
            node.next = head;
        head = node;
        System.out.println(data + " added to stack");
    }

    public T top() {
        T data = null;
        if (head != null) {
            data = (T) head.data;
            System.out.println("Retrieved: " + data);
        } else System.out.println("stack is empty");
        return (T) data;
    }

    public T pop(){
        T data = null;
        if (head != null) {
            data = (T) head.data;
            head = head.next;
            System.out.println("Retrieved and removed: " + data);
        }  else System.out.println("stack is empty");
        return (T) data;
    }

    public int size() {
        Node pointer = head;
        int count = 0;
        while(pointer != null){
            count++;
            pointer = pointer.next;
        }
        return count;
    }

    public boolean isEmpty(){
        if (head == null)
            return true;
        else return false;
    }
}
