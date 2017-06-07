package ArrayToList;


public class LinkedList {

  private Node node;


  public void addNode(int value) {
    Node newNode = new Node(value);
    if (node == null) {
      node = newNode;
      return;
    }
    Node temp = node;
    while(temp.getNextNode() != null) {
      temp = temp.getNextNode();
    }
    temp.setNextNode(newNode);
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
