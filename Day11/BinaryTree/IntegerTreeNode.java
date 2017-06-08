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
        right = new IntegerTreeNode(value);
      }else {
        right.add(newMember);
      }
    }else {
      if(left == null) {
        left = new IntegerTreeNode(newMember);
      } else left.add(newMember);
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

}
