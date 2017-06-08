package Classics;


public class RecTest {

  public static void main(String[] args){
    Fac myMaths = new Fac();
    System.out.println(myMaths.factorial(42));

    FibSeq fibSeq = new FibSeq();
    System.out.println(fibSeq.fibNum(8));

    HanoiTowers myTower = new HanoiTowers();
    System.out.println(myTower.movesToSolve(4));

  }
}
