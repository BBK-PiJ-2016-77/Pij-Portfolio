package GenericList;


public class DLLTesting {
  public static void main(String[] args){
    Company appl = new Company();
    appl.add(1);
    appl.add("Vasilis");
    appl.add(2);
    appl.add("Antonio");
    appl.add(3);
    appl.add("Keith");
    appl.add(4);
    appl.add(5);
    appl.add(6);
    appl.add(7);
    appl.add(8);
    appl.add(9);
    appl.add("George");
    appl.printList("natnums");
    System.out.println();
    appl.printList("emplnames");
    appl.delete(1);
    appl.delete("Vasilis");
    System.out.println();
    appl.printList("natnums");
    System.out.println();
    appl.printList("emplnames");


  }
}
