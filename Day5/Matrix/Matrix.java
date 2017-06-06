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

  public void setColumn(int column, String numbers) {

    if(column <= matrixTwoD[0].length-1  && numbers.length()-1 <= matrixTwoD.length) {
      int i = 0;
      //the size of rows is smaller than the size of columns ( which is equal to string size
      //that's why we are checking i with stringLength - 1
      while(i < numbers.length()-1){
        matrixTwoD[i][column] = numbers.charAt(i++) - '0';
      }
    }
  }

  public String toString() {
    String st = "[";
    String comma = ",";
    String fin = "]";
    String semiC= ";";
    String result = "";
    for(int row = 0 ; row < matrixTwoD.length ; row ++) {
      if(row!=0) {
        result += semiC;
      }
      for(int column = 0 ; column < matrixTwoD[0].length ; column ++) {
        if(row == 0 && column == 0) {

          result = st  + matrixTwoD[row][column];

        }else if (row == matrixTwoD.length - 1 && column == matrixTwoD[0].length -1) {
          if(row!=0 && column == 0) {
            result +=  matrixTwoD[row][column] + fin ;
          } else {
            result += comma + matrixTwoD[row][column] + fin ;
          }

        } else {
          if(row!=0 && column == 0) {
            result +=  matrixTwoD[row][column] ;
          } else {
            result += comma + matrixTwoD[row][column];
          }

        }

      }
    }
    return result;
  }


}
