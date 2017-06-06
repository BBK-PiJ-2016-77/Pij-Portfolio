package ArrayChecker;



public class ArrayChecker {

  public boolean isSymetrical(int[] intArray) {

    for(int i = 0, j = intArray.length-1 ; i < j  ; i ++, j--){

      if(intArray[i] != intArray[j] ) {

        return false;
      }

    }
    return true;
  }


  public int[] reverse(int[] givenArray){
    int[] reversedArray  = new int[givenArray.length];

    for(int i  = 0, j = givenArray.length-1; i < givenArray.length ; i ++, j--){
      reversedArray[j] = givenArray[i];
    }
    return reversedArray;
  }


}
