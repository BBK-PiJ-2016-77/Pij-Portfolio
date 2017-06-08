package GenericList;


public class DLLItem<T> {

  private T value;
  private DLLItem<T> nextItem;
  private DLLItem<T> previousItem;

  public DLLItem(T value){
    this.value =value;
  }

  public void addItem(DLLItem item){
    if (nextItem == null) {
      item.setPreviousItem(this);
      nextItem = item;

    } else nextItem.addItem(item);

  }

  public void delete(T item) {

    if(nextItem != null && nextItem.getValue().equals(item)){
      nextItem = nextItem.getNextItem();
      nextItem.setPreviousItem(this);
      return;
    }

    if(nextItem!= null) { nextItem.delete(item);}
  }

  public void printList() {
    System.out.println(value.toString());
    if(nextItem!=null) nextItem.printList();
  }


  public DLLItem<T> getNextItem() {return nextItem;}

  public void setNextItem(DLLItem<T> nextItem) {this.nextItem = nextItem;}

  public DLLItem<T> getPreviousItem() {return previousItem;}

  public void setPreviousItem(DLLItem<T> previousItem) {this.previousItem = previousItem;}

  public T getValue() {return value;}
}
