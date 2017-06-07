package Stack;


public class StackRequest {

    private int requestValue;
    private StackRequest previousRequest;
    private StackRequest nextRequest;

    public StackRequest(int value){
      requestValue = value;

    }

    public StackRequest getPreviousRequest() {return  previousRequest;}

    public void setPreviousRequest(StackRequest request) { previousRequest = request;}

    public StackRequest getNextRequest() {return  nextRequest;}

    public void setNextRequest(StackRequest request) {nextRequest = request;}

    public int getRequestValue() { return requestValue;}


}
