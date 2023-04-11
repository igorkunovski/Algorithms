public class ListRevert {
    Node head;
    Node tail;

    public static class Node{
        private int value;
        private Node nextNode;
        private Node previousNode;
    }

    public void revertDoubleLinkedList(){
        Node currentNode = head;

        Node temp = head;
        head = tail;
        tail = temp;

        while (currentNode.nextNode != null){
            temp = currentNode.nextNode;
            currentNode.nextNode = currentNode.previousNode;
            currentNode.previousNode = temp;
            currentNode = currentNode.previousNode;
        }
    }

    public void revertSingleLinkedList(){
        if (head != null && head.nextNode != null){
            Node temp = head;
            revertSLL(head.nextNode, head);
            temp.nextNode = null;
        }
    }
    private void revertSLL(Node currentNode, Node previousNode){

        if (currentNode.nextNode == null){
            head = currentNode;
        } else {
            revertSLL(currentNode.nextNode, currentNode);
        }
        currentNode.nextNode = previousNode;
    }
}
