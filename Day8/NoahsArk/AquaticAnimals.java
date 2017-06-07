package NoahsArk;


public abstract class AquaticAnimals implements Animal {
  String name;
  public  AquaticAnimals(String name){
    this.name = name;
  }
  @Override
  public void call() {
    System.out.println("<"+name+"> will not come");
  }

  @Override
  public void reproduce() {
    layEggs();
  }

  private void layEggs() {
    System.out.println(name + " laying eggs");
  }
}
