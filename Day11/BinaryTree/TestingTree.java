package BinaryTree;


public class TestingTree {

  public static void main(String[] args){
    IntegerTreeNode myTree = new IntegerTreeNode(6);

    myTree.add(5);
    myTree.add(3);
    myTree.add(9);
   // System.out.println(myTree.toString());
    System.out.println();
  //  System.out.println(myTree.contains(9));
    myTree.add(15);
    System.out.println();
   // System.out.println(myTree.contains(15));
    System.out.println();
   // System.out.println(myTree.toString());
    myTree.add(4);
    myTree.add(2);
    myTree.add(8);
    myTree.add(7);
    myTree.add(13);
    System.out.println(myTree.toString());
    myTree.remove(5);
    System.out.println(myTree.toString());
  }

}
