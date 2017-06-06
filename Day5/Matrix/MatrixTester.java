package Matrix;


public class MatrixTester {

  public static void main(String[] args){

    Matrix neo = new Matrix(3,4);
    neo.setElement(2,3,1);
    //System.out.println(neo.matrixTwoD[2][3]);

    String test = "1234";
    neo.setRow(0,test);
    System.out.println(neo.matrixTwoD[0][0]);
    System.out.println(neo.matrixTwoD[0][1]);
    System.out.println(neo.matrixTwoD[0][2]);
    System.out.println(neo.matrixTwoD[0][3]);

  }
}
