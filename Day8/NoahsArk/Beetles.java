package NoahsArk;


public class Beetles extends Mamals{
  private String name;
  public Beetles(String name) {

    super(name);
    this.name = name;
  }

  @Override
  public void reproduce(){
    System.out.println(name + " laying eggs");
  }

  @Override
  public void sound() {
    System.out.println(name+ "krkrkrkrr");
  }
}
