package ArrayToList;


public class ArrayUtilities {

  public static LinkedList ArrayToList(int[] arrayOfInts) {
    LinkedList newLinkedList = new LinkedList();
    for(int i = 0 ; i < arrayOfInts.length  ; i ++) {
      newLinkedList.addNode(arrayOfInts[i]);
    }

    return newLinkedList;
  }
}
