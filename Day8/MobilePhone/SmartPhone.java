package MobilePhone;

public class SmartPhone extends MobilePhone{


  public SmartPhone(String brand) {
    super(brand);
  }

  public void browseWeb(String url){
    System.out.println("Loading: "+url);
  }

  public void findPosition() {
    System.out.println("Your location is loading please wait....\nAthens, Melissia : \t-38.0556, -156.1656");
  }

  @Override
  public void call(String number){
    if(number.substring(0,2).equals("00")){
      System.out.println("Calling <"+number+"> through the internet to save money");
    }else {
      super.call(number);
    }
  }



}
