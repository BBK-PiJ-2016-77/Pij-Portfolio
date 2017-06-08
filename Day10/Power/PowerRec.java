package Power;


public class PowerRec {

  public int powerOf(int num, int toThePowerOf){
    // not accurate but it's working for positive integers(toThePowerOf)
    if(toThePowerOf<=0) return 1;
    if(toThePowerOf == 1 ){
      return num;
    }else return num * (powerOf(num,toThePowerOf-1));
  }
}
