class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public void set(T data) {
        this.data = data;
    }

    public T get() {
        return this.data;
    }

    public void next(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }


    public boolean hasNext() {
        return next != null;
    }
}

public class SingleLinkedList<T> {
    private Node<T> head;

    public SingleLinkedList() {
        this.head = null;
    }

    public Node<T> getHead() {
        return head;
    }

    public void addFirst(T value){
        Node<T> node = new Node<>(value);
        if(this.head == null){
            this.head = node;
            return;
        }
        Node<T> current = this.head;
        this.head = node;
        this.head.next(current);
    }

    public void addLast(T value){
        Node<T> node = new Node<>(value);
        if(this.head == null){
            this.head = node;
            return;
        }
        Node<T> current = this.head;
        while(current.hasNext()) current = current.getNext();
        current.next(node);
    }

    public void deleteById(int id){
        if(this.head == null) return;
        Node<T> prev = null;
        Node<T> current = this.head;
        if( id == 0 ){
            this.head = this.head.getNext();
            return;
        }
        int index = 1;
        while(current != null){
            if(id == index){
                prev.next(current.getNext());
                current = null;
                return;
            }
            prev = current;
            current = current.getNext();
            index++;
        }
    }

    public void display(){
        Node<T> current = this.head;
        while(current != null){
            System.err.print(current.get().toString());
            System.err.print("  |\n  |\n  |\n  |\n  |\n");
            current = current.getNext();
        }
        System.err.println("  null");
    }
}