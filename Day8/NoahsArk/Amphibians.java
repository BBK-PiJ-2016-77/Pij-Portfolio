package NoahsArk;


public abstract class Amphibians implements Animal{

  private String name;
  public Amphibians(String name) { this.name = name;}

  @Override
  public void call() {
    System.out.println("<"+name+"> coming...");
  }

  @Override
  public void reproduce() {
    layEggs();
  }

  private void layEggs() {
    System.out.println(name + " laying eggs");
  }
}
