package GenericStack;


public class Item<T extends Number> {

  private Item beforeItem;
  private Item afterItem;
  private T value;

  public Item(T value){
    this.value = value;
  }

  public Item getBeforeItem() {return  beforeItem;}

  public void setBeforeItem(Item item) {beforeItem = item;}

  public Item getAfterItem() {return afterItem;}

  public void setAfterItem(Item item) {afterItem = item;}

  public T getValue() {return value;}

}
