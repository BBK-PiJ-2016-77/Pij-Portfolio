package GenericList;


public class DLLTesting {
  public static void main(String[] args){
    Company appl = new Company();
    appl.natInsuNumbers.add(1);
    appl.emplNames.add("Vasilis");
    appl.natInsuNumbers.add(2);
    appl.emplNames.add("Antonio");
    appl.natInsuNumbers.add(3);
    appl.emplNames.add("Keith");
    appl.natInsuNumbers.add(4);
    appl.natInsuNumbers.add(5);
    appl.natInsuNumbers.add(6);
    appl.natInsuNumbers.add(7);
    appl.natInsuNumbers.add(8);
    appl.natInsuNumbers.add(9);
    appl.emplNames.add("George");
    appl.emplNames.printList();
    System.out.println();
    appl.natInsuNumbers.printList();
    appl.natInsuNumbers.deleteItem(3);


  }
}
