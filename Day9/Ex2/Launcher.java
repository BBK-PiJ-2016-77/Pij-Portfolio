package Ex2;


import MobilePhone.*;

public class Launcher {
  private static MobilePhone myPhone ;
  //private static MobilePhone mySecndPhone= new MobilePhone("motorola");
  public static void main(String[] args){

    Launcher lc = new Launcher();
    t1();
    testPhone(myPhone);
    //testPhone(mySecndPhone); ClassCastException cannot be cast to SmartPhone
  }


  //2.2
  private static void t1(){
    myPhone = new SmartPhone("Iphone3Gs");
   // myPhone.playGame("NBA2K11") private method can't access
    myPhone.call("00123");
    // myPhone.browseWeb is not working
    myPhone.call("1234");
    myPhone.printLastNumbers();
    myPhone.ringAlarm("");
  }

  //2.3
  private static void testPhone(Phone phone){
    phone.call("0012312");
    //The only method we can use is the one that Phone has in common with SmartPhone call.
    ((SmartPhone)phone).browseWeb("moodle.com");
    ((SmartPhone)phone).printLastNumbers();
    ((SmartPhone)phone).findPosition();
  }
}
