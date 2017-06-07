package NoahsArk;


public class Dogs extends Mamals {
  private String name;
  public Dogs(String name) {
    super(name);
    this.name = name;
  }

  @Override
  public void sound() {
    System.out.println(name+"woooooff");
  }
}
