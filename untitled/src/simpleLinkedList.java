public class simpleLinkedList {
    Node head;

    void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    void updateNode(int indax , int newData){
        Node temp = head;
        while(temp != null){
            if(temp.data == indax){
                temp.data = newData;
                return;
            }
            temp = temp.next;
        }
    }
    void removeNode(int index){
        if(head == null){
            return;
        }
        if(head.data == index){
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == index){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }
}
