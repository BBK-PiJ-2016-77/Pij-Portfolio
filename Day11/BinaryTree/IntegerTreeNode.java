package BinaryTree;


public class IntegerTreeNode {

  private IntegerTreeNode left;
  private IntegerTreeNode right;
  private int value;

  public IntegerTreeNode(int value){

    this.value = value;
  }

  public void add(int newMember){
    if(newMember > this.value) {
      if(right == null) {
        right = new IntegerTreeNode(newMember);

      }else right.add(newMember);

    }else {
      if(left == null) {
        left = new IntegerTreeNode(newMember);

      } else left.add(newMember);
    }
  }

  public void remove(int numToRemove){
    if(left == null && right == null) {
      this.value = 0;
    }
    if(numToRemove > this.value) {
      if(right != null) {
        right.remove(numToRemove);
      }
    }
    if(numToRemove< this.value){
      if(left!= null) {
        left.remove(numToRemove);
      }
    }
    if(numToRemove == this.value){
      if(left!= null) {
        int replacement = left.getMax();
        remove(replacement);
        this.setValue(replacement);
      }
    }
  }

  public boolean contains(int value) {
    if (this.value == value) {
      return true;
    }
    if (value > this.value) {
      if (right == null) {
        return false;
      } else {
        return right.contains(value);
      }
    } else {
      if (left == null) {
        return false;
      } else {
        return left.contains(value);
      }
    }
  }

  public int getMax(){
    if(right == null){
      return  this.value;
    }else return right.getMax();

  }

  public int getMin(){
    if(left == null){
      return this.value;
    }else return left.getMin();
  }

  public int depth() {
    int lD = 0;
    int rD = 0;
    if(left != null){
       lD = 1 + left.depth();
    }
    if(right != null){
       rD = 1 + right.depth();
    }
    if(lD > rD) {
      return lD ;
    } else {
      return rD;
    }

  }

  public String toString(){
    String result="";
    String start = "[";
    String end = "]";

    result+= start + this.value;
    if(left == null) {
      result +=  " L" +start + end;
    } else {
      result +=  " L" + left.toString();
    }

    if(right == null) {
      result += " R" + start + end;
    } else {
      result +=  " R" + right.toString();
    }

    return result + end;
  }

  public void setValue(int value) {this.value = value;}

}
