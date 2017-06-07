package NoahsArk;


public class Dolphins extends AquaticAnimals{
  private String name;
  public Dolphins(String name) {
    super(name);
    this.name= name;
  }

  @Override
  public void reproduce() {System.out.println(name+ " giving birth");}

  @Override
  public void sound() {
    System.out.println(name+" ffffff");
  }
}
