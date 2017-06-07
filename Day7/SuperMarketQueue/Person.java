package SuperMarketQueue;


public class Person {
  private String name;
  private int age;
  private Person beforeYou;
  private Person afterYou;



  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  public Person getBeforeYou(){ return  beforeYou;}

  public void setBeforeYou(Person person) { beforeYou = person;}

  public Person getAfterYou() {return  afterYou;}

  public void setAfterYou(Person person) { afterYou = person;}

  public String getName() { return name;}

  public int getAge() {return age;}



}
