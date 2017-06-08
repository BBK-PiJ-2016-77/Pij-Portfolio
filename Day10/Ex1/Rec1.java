package Ex1;


public class Rec1 {

  public static void main(String[] args){
    Rec1.printNumber(6);
  }

  public static void printNumber(int n){

    if(n<=0) return;
    System.out.println(n);
    printNumber(n-2);
    printNumber(n-3);
    System.out.println(n);
  }
}
