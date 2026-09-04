public class Main {
    public static void main(String[] args) {
        simpleLinkedList list = new simpleLinkedList();
        list.addNode(90);
        list.addNode(80);
        list.addNode(70);
        list.addNode(60);

        list.display();

        list.updateNode(80 , 40);
        list.display();

        list.removeNode(80);
        list.display();
    }
}