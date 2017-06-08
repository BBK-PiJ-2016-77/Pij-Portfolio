package GenericList;


public class Company<T> {
  private DLL<Integer>  natInsuNumbers = new DLL<>();
  private DLL<String> emplNames = new DLL<>();

  public void add(T value){
    if(value instanceof Integer){
      natInsuNumbers.add((Integer) value);
    }else emplNames.add((String)value);
  }

  public void delete(T value){
    if(value instanceof Integer){
      natInsuNumbers.deleteItem((Integer)value);
    }else emplNames.deleteItem((String)value);
  }


  public void printList(String s){
    switch (s.toUpperCase()){
      case "NATNUMS": natInsuNumbers.printList();
      break;
      case "EMPLNAMES": emplNames.printList();
      break;
      default: System.out.println("what do you want to print out?");
    }

  }
}
