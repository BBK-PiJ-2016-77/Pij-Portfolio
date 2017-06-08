package Classics;


public class HanoiTowers {

  public int movesToSolve(int n) {
    if (n == 2) return 3;
    else return (movesToSolve(n-1) *2) + 1;
  }
}
