package NoahsArk;


public class Cats extends Mamals {
  private String name;
  public Cats(String name) {
    super(name);
    this.name= name;
  }

  @Override
  public void sound() {
    System.out.println(name+" meeeeeeaaaaou");
  }
}
