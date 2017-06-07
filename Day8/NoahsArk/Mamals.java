package NoahsArk;


public abstract class Mamals implements Animal {
  private String name;
  public Mamals(String name){this.name = name;}
  @Override
  public void call() {
    System.out.println("<"+name+"> coming...");
  }

  @Override
  public void reproduce() {
    giveBirth();
  }

  private void giveBirth(){
    System.out.println(name+" Giving birth");
  }
}
