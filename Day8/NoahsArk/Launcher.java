package NoahsArk;


public class Launcher {

  public static void main(String[] args){
    Bears polarBear = new Bears("Polar Bear");
    Beetles ladyBird = new Beetles("Lady Bird");
    Dolphins dolphin = new Dolphins("dolphin");
    Dogs mpoumpou = new Dogs("mpoumpou");
    Cats garfield = new Cats("Garfield");
    Eagles eagles = new Eagles("Eagle");

    polarBear.call();
    polarBear.reproduce();
    polarBear.sound();
    System.out.println();
    ladyBird.call();
    ladyBird.reproduce();
    ladyBird.sound();
    System.out.println();
    dolphin.call();
    dolphin.reproduce();
    dolphin.sound();
    System.out.println();
    mpoumpou.call();
    mpoumpou.reproduce();
    mpoumpou.sound();
    System.out.println();
    garfield.call();
    garfield.reproduce();
    garfield.sound();

  }
}
