package GenericStack;

public class GStack<T extends Number> {

  private Item itemOnTop;


  public void push(T value){
    Item temp = new Item(value);
    System.out.println("Pushing "+value);
    if (itemOnTop == null) {
      itemOnTop = temp;
      return;
    }
    temp.setAfterItem(itemOnTop);
    itemOnTop.setBeforeItem(temp);
    itemOnTop = temp;
  }

  public void pop() {
    if(itemOnTop != null){
      System.out.println("Popping "+itemOnTop.getValue());
      if(itemOnTop.getAfterItem()!=null){
        itemOnTop.getAfterItem().setBeforeItem(null);
      }

      itemOnTop = itemOnTop.getAfterItem();
    }
  }


  public boolean isEmpty() {
    return itemOnTop == null;
  }
}
