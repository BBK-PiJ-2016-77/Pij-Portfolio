package GenericStack;


public class Item<Number> {

  private Item beforeItem;
  private Item afterItem;
  private Number value;

  public Item(Number value){
    this.value = value;
  }

  public Item getBeforeItem() {return  beforeItem;}

  public void setBeforeItem(Item item) {beforeItem = item;}

  public Item getAfterItem() {return afterItem;}

  public void setAfterItem(Item item) {afterItem = item;}

  public Number getValue() {return value;}

}
