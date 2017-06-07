package Stack;


public class Stacking {

  public static void main(String[] args){
    Stack myStack = new Stack();
    myStack.push(5);
    myStack.push(8);
    myStack.push(12);
    myStack.pop();
    myStack.push(13);
    myStack.pop();
    myStack.pop();
    myStack.pop();
    if(myStack.empty()) {
      System.out.println("Stack is empty ");
    }
  }
}
