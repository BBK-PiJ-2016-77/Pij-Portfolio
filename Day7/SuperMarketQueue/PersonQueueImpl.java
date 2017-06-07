package SuperMarketQueue;


public class PersonQueueImpl implements PersonQueue {

  private Person headOfQueue;
  private Person tailOfQueue;

  @Override
  public void insert(Person person) {
    if(headOfQueue ==null) {
      headOfQueue = person;
      tailOfQueue = person;
      return;
    }
    Person temp = tailOfQueue;
    temp.setAfterYou(person);
    tailOfQueue = temp.getAfterYou();

  }

  @Override
  public Person retrieve() {

    if(headOfQueue == null) {
      return null;
    }

    Person temp = headOfQueue;
    if(temp.getAfterYou() == null) {
      tailOfQueue = null;

    }
    headOfQueue = temp.getAfterYou();
    return temp;
  }

  public String toString() {
    Person temp = headOfQueue;
    String result = "";
    while(temp != null) {
      result += "\tCustomer: " + temp.getName() + "\tAge: " + temp.getAge()+"\n";
      temp = temp.getAfterYou();
    }

    return result;
  }
}
