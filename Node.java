public class Node {

    public Node next;
    public String item;

    //node constructor
    public Node(String item) {
        this.item = item;
        this.next = null;
    }


    public class LinkedList {
        private int size;
        private Node head;

        public void removeNode(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
            if (index == 0) {
                head = head.next;
            } else {
                Node current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
                current.next = current.next.next; // skips over next item
            }
        }

        public boolean findValue(String val) {
            Node current = head;
            while (current != null) {
                if (current.item.equals(val)) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        public String get(int index){
            if(index < 0 || index >= size){
                throw new IndexOutOfBoundsException();
            }
            // loop that goes to the index'th element then returns that element
            Node current = head;
            for(int i = 0; i < index; i++){
                current = current.next;
            }
            return current.item;

        }
        public void set(int index, String val){
            if(index < 0 || index >= size){
                throw new IndexOutOfBoundsException();
            }
            Node current = head;
            for(int i = 0; i < index; i++){
                current = current.next;
            }
            current.item = val;
        }

        public void add(String val){
            Node newNode = new Node(val);
            if(head == null){
                head = newNode;
            } else {
                Node current = head;
                //iterates through the entire ll
                while(current.next != null){
                    current = current.next;
                }
                // makes the last value the new node value
                current.next = newNode;
            }
            size++;
        }



    }

    public void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add("Hello");
        System.out.println(ll);
    }
}

//get(int index);
//set(int index, String val);
//add(String val);
//Insert(int index, String val)
//remove(int index);
//size();
//find(String val)