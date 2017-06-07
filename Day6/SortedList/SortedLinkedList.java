package SortedList;


import ArrayToList.Node;

public class SortedLinkedList {

    private Node node;

    public void addNode(int value) {
      Node newNode = new Node(value);
      if (node == null) {
        node = newNode;
        return;
      }
      Node temp1 = node;
      Node temp2 = node.getNextNode();
      while(temp2 !=null) {
        if(newNode.getNodeValue()< temp1.getNodeValue()) {
          node = newNode;
          node.setNextNode(temp1);
          return;
        }

        if(newNode.getNodeValue()< temp2.getNodeValue()) {
          temp1.setNextNode(newNode);
          newNode.setNextNode(temp2);
          return;
        }
        temp1 = temp2;
        temp2 = temp2.getNextNode();
      }
      if(newNode.getNodeValue()< temp1.getNodeValue()) {
        node = newNode;
        node.setNextNode(temp1);
        return;
      }
      temp1.setNextNode(newNode);


    }

    public void printList() {
      String result = "";
      Node temp = node;
      while(temp!=null){
        result+= temp.getNodeValue() + " ";
        temp = temp.getNextNode();
      }
      result = "[ " + result + "]";
      System.out.println(result);
    }
}


