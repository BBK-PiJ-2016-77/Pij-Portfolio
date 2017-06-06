package Matrix;


public class Matrix {
   int[][] matrixTwoD;

  public Matrix(int rows, int columns) {
    matrixTwoD = new int[rows] [columns];
  }

  public void setElement(int row, int column, int value) {

    if(row <= matrixTwoD.length -1 && column <= matrixTwoD[0].length-1  ){
      matrixTwoD[row][column] = value;
    }
  }

  public void setRow(int row, String numbers) {
    if(row <= matrixTwoD.length && numbers.length()-1 <= matrixTwoD[0].length-1) {
      int i = 0;
      while(i < numbers.length()){
        matrixTwoD[row][i] = numbers.charAt(i++) - '0';

      }

    }
  }
}
