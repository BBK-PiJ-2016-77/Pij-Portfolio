import ArrayChecker.ArrayChecker;
import ArrayCopier.ArrayCopier;
import Calculator.Calculator;

import java.util.Arrays;

public class TestingClass {


  public static void main(String[] args) {
    Calculator myCalc = new Calculator();
    myCalc.divide(3,2);
    myCalc.multiply(3,2);
    myCalc.add(3,2);
    myCalc.modulus(3,2);
    myCalc.subtract(3,2);

    ArrayChecker arrayCheck = new ArrayChecker();
    int arrayOfInts[] = {1,2,3,2,1};

    System.out.println(arrayCheck.isSymetrical(arrayOfInts));

    int reverseIt[] = {1,2,3,4};
    int[] reversedArr = arrayCheck.reverse(reverseIt);

    System.out.println(reversedArr.length);

    System.out.println("first value should be equal to 4 = "+ reversedArr[0] +
            " second one to 3 = " + reversedArr[1]);

    //Smaller src array
    //int[] bigSrcArr = {1,2,3,4};
    //int[] smallerDstArr = {23,22,21,20,19,18,17};

    //Bigger src array
    //int[] bigSrcArr = {1,2,3,4};
    //int[] smallerDstArr = {23,22};

    
    //Same array size
    int[] bigSrcArr = {1,2,3,4,5,6,7};
    int[] smallerDstArr = {23,22,21,20,19,18,17};

     ArrayCopier myCopier = new ArrayCopier();
     int[] result = myCopier.copy(bigSrcArr, smallerDstArr);
     System.out.println(Arrays.toString(result));

  }


}
