package MobilePhone;

public class MobilePhone extends OldPhone {
  String[] lastTenNumber = new String[10];
  private int i = 0;
  boolean filled = false;

  public MobilePhone(String brand) {
    super(brand);
  }

  public void ringAlarm(String alarm) {
    System.out.println(alarm);
  }


  private void playGame(String game) {
    System.out.println("Playing"+ game);
  }

  @Override
  public void call(String number){
    super.call(number);
    if(filled== true) {
      i = 0;
      lastTenNumber[i] = number;
      filled = false;
      i++;
    }else {
      lastTenNumber[i] = number;
      i++;
      if(i == 10) {
        filled = true;
      }
    }
  }

  public void printLastNumbers() {
    for(int k = 0 ; k <=9 ; k++) {
      System.out.println("Called : "+lastTenNumber[k]);
    }
  }
}
