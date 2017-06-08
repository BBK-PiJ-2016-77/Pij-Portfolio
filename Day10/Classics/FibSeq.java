package Classics;


public class FibSeq {

  public long fibNum(int n){
    if(n==1 || n == 2){
      return 1;
    }
    else {
      return fibNum(n-1) + fibNum(n-2);
    }
  }
}
