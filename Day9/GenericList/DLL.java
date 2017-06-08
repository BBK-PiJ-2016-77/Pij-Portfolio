package GenericList;


public class DLL<T> {
  private DLLItem firstItem ;


  public void add(T value){
    DLLItem temp = new DLLItem(value);
    if(firstItem == null) {
      firstItem = temp;
    }else firstItem.addItem(temp);
  }

  public void deleteItem(T value){

    if(firstItem != null && firstItem.getValue().equals(value)){
      firstItem =firstItem.getNextItem();
      firstItem.setPreviousItem(null);

    }
    if(firstItem !=null) firstItem.delete(value);

  }

  public void printList() { if(firstItem!=null) firstItem.printList();}

  public DLLItem<T> getFirstItem() { return firstItem;}

  public void setFirstItem(DLLItem item) {
    firstItem = item;
  }



}
