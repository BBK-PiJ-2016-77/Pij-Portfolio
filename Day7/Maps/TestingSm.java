package Maps;


import java.util.Scanner;

public class TestingSm {

  public static void main(String[] args){
    SimpleMapImpl myMap = new SimpleMapImpl();
    int hash, smallHash;
    String name;
    boolean quit = false;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter name or press Q to quit");
    while(!quit) {
      System.out.println("> ");
      name = scanner.nextLine();
      if(name.equals("Q")) {
        quit = true;
      }else {
        hash = name.hashCode();
        smallHash = HashUtilities.shortHash(hash);
        myMap.put(smallHash,name);
      }
    }


    quit = false;

    while(!quit) {
      System.out.println("Get items by key or press Q to quit");
      String k = scanner.nextLine();
      if(k.equals("Q")){
        quit = true;
      }else {
        int intKey = Integer.parseInt(k);
        System.out.println("Got: "+ myMap.get(intKey));
      }
    }

  }
}
