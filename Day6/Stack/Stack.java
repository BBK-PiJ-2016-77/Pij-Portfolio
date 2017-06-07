package Stack;


public class Stack {

  private StackRequest head;

  public void push(int readRequest){
    StackRequest newRequest = new StackRequest(readRequest);

    newRequest.setPreviousRequest(head);
    if(head !=null) {
      head.setNextRequest(newRequest);
    }

    System.out.println("Pushing "+newRequest.getRequestValue()+"....");
    head = newRequest;
  }

  public void pop() {
    StackRequest poppingReq = head;
    head = poppingReq.getPreviousRequest();
    if(poppingReq.getPreviousRequest() !=null) {
      poppingReq.getPreviousRequest().setNextRequest(null);
    }
    System.out.println("Popping.... it's a "+poppingReq.getRequestValue());
  }

  public boolean empty() {
    return head == null;
  }


}
