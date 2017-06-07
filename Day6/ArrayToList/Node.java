package ArrayToList;


public class Node{
  private Node nextNode;
  private int nodeValue;

  public Node(int valueOfNode){
    nodeValue = valueOfNode;
  }

  public Node getNextNode() { return nextNode;}

  public void setNextNode(Node node) { nextNode = node;}

  public int getNodeValue() { return nodeValue;}


}
