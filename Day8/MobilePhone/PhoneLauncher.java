package MobilePhone;

public class PhoneLauncher {

  public static void main(String[] args){

    PhoneLauncher launcher = new PhoneLauncher();
    launcher.launch();
  }

  public void launch() {

    SmartPhone iphone3Gs = new SmartPhone("iphone3Gs");
    iphone3Gs.call("1st Number");
    iphone3Gs.call("2nd Number");
    iphone3Gs.call("3rd Number");
    iphone3Gs.call("4th Number");
    iphone3Gs.call("5th Number");
    iphone3Gs.call("6th Number");
    iphone3Gs.call("7th Number");
    iphone3Gs.call("8th Number");
    iphone3Gs.call("9th Number");
    iphone3Gs.call("10th Number");
    System.out.println();
    System.out.println("======================");
    System.out.println();
    iphone3Gs.printLastNumbers();
    iphone3Gs.call("11th Number");
    iphone3Gs.call("12th Number");
    iphone3Gs.call("13th Number");
    System.out.println();
    System.out.println("======================");
    System.out.println();
    iphone3Gs.printLastNumbers();
    System.out.println();
    iphone3Gs.browseWeb("www.Facebook.com");
    iphone3Gs.findPosition();
    System.out.println();
    iphone3Gs.call("0044731231");
    System.out.println();
    System.out.println(iphone3Gs.getBrand());




  }
}
