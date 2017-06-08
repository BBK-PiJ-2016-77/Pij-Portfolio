package GenericStack;


public class GSTesting {

  public static void main(String[] args){
    GStack myStack = new GStack();

    myStack.push(15);
    myStack.push(20);
    myStack.push(32);
    myStack.push(45);
    System.out.println();
    myStack.pop();
    myStack.pop();
    System.out.println();
    System.out.println(myStack.isEmpty());
    System.out.println();
    myStack.pop();
    myStack.pop();
    System.out.println();
    System.out.println(myStack.isEmpty());



  }

}
