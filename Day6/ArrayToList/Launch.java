package ArrayToList;


public class Launch {

  public static void main(String[] args) {
     int[] myArray = {1,2,3,4,5};

    LinkedList myList =  ArrayUtilities.ArrayToList(myArray);

    myList.printList();
  }
}
