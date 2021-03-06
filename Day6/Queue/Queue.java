package Queue;


public class Queue {

  private Request readRequest;
  private Request firstToServe;
  private Request lastInQueue;


  public void insert(int newReadRequest) {
    readRequest = new Request(newReadRequest);
    Request temp = lastInQueue;
    lastInQueue = readRequest;
    if(firstToServe == null) {
      firstToServe = readRequest;

      System.out.println("Inserting request "+ readRequest.getRequestValue()+ "...");
      return;
    }

    temp.setRight(readRequest);
    readRequest.setLeft(temp);

    System.out.println("Inserting request "+ readRequest.getRequestValue()+ "...");


  }

  public void retrieve(){
    Request temp = firstToServe;
    if(temp == null) {
      return;
    }
    if(lastInQueue == temp) {

      lastInQueue = temp.getRight();

    }

    firstToServe = temp.getRight();
    System.out.println("Retrieving request "+temp.getRequestValue()+"... done.");

  }

  public void size(){

    System.out.println("There are "+size(firstToServe)+" request/s in the queue" );
  }

  private int size(Request firstInQueue){
    if(firstInQueue ==null) {
      return 0;
    }
    return 1 + size(firstInQueue.getRight());
  }





}


