package homework6.task2;

public class DoublyLinkedList2<T> {
    private Node head = null;
    private Node tail = null;

    public void addFirst(T data){
        Node node = new Node(data);
        if (head == null)
            tail = node;
        if (head != null) {
            node.next = head;
            head.previous = node;
        }
        head = node;
        System.out.println("Added first element to linkedlist: " + data);
    }

    public void addLast(T data){
        if (head == null)
            addFirst(data);
        Node node = new Node(data);
        tail.next = node;
        node.previous = tail;
        tail = node;
        System.out.println("Added last element to linkedlist: " + data);
    }

    public void add(int index, T data){
        int position = 0;
        Node pointer = head;
        Node node = new Node(data);
        if (index >= size())
            throw new IndexOutOfBoundsException();
        if (index == 0)
            addFirst(data);
        else if (index == size() - 1)
            addLast(data);
        else{
            for (int i = position; i < index; i++, pointer = pointer.next);

            Node afterInsertionNode = pointer.next;
            pointer.next = node;
            node.previous = pointer;
            node.next = afterInsertionNode;
            afterInsertionNode.previous = node;
            System.out.println("Inserted to [" + index + "] index element: " + data);
        }
    }

    public int size(){
        Node pointer = head;
        int counter = 0;
        while(pointer != null){
            counter++;
            pointer = pointer.next;
        }
        return counter;
    }

    public boolean isEmpty(){
        if (head == null)
            return true;
        else return false;
    }
}
