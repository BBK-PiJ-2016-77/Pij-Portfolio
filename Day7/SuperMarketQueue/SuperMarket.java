package SuperMarketQueue;


public class SuperMarket {


  private PersonQueue myQueue;

  public SuperMarket(){
    myQueue = new PersonQueueImpl();
  }

  public void addPerson(Person person){
    myQueue.insert(person);
  }

  public void servePerson() {
    myQueue.retrieve();
  }

  public String toString(){
    return myQueue.toString();
  }
}
