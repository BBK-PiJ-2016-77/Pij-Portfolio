package NoahsArk;


public class Eagles extends FlyingAnimals{
  private String name;
  public Eagles(String name) {
    super(name);
    this.name = name;

  }


  @Override
  public void sound() {
    System.out.println("ssssssss");
  }
}
