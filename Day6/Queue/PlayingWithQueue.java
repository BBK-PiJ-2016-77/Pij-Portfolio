package Queue;


public class PlayingWithQueue {


  public static void main(String[] args){
    Queue myQueue = new Queue();
    myQueue.size();
    myQueue.insert(5);
    myQueue.insert(8);
    myQueue.insert(12);
    myQueue.size();
    myQueue.retrieve();
    myQueue.insert(13);
    myQueue.size();
    myQueue.retrieve();
    myQueue.retrieve();
    myQueue.size();
    myQueue.retrieve();
  }
}
