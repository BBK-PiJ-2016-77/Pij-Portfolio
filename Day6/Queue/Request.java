package Queue;



public class Request {
  private int requestValue;
  private Request left;
  private Request right;
  public Request(int value){
    requestValue = value;

  }


  public Request getLeft() {return  left;}
  public void setLeft(Request request) { left = request;}

  public Request getRight() {return  right;}
  public void setRight(Request request) {right = request;}

  public int getRequestValue() { return requestValue;}
}
