package SuperMarketQueue;


public class SuperMarketSim {

  public static void main(String[] args){
    SuperMarket mySM = new SuperMarket();
    Person Vasilis = new Person("Vasilis", 32);
    Person Katerina = new Person("Katerina", 36);
    Person Maria = new Person("Maria", 31);
    Person Kortsimelidas = new Person("Vas.Kort", 31);
    Person Christodoulos = new Person("Chris", 31);
    Person Alex = new Person("Alex", 30);
    Person Feli = new Person("Feli", 25);


    mySM.addPerson(Vasilis);
    mySM.addPerson(Katerina);
    mySM.addPerson(Maria);
    mySM.addPerson(Alex);
    mySM.addPerson(Kortsimelidas);
    mySM.addPerson(Christodoulos);
    mySM.addPerson(Feli);

    System.out.println(mySM.toString());

    mySM.servePerson();
    mySM.servePerson();
    mySM.servePerson();

    System.out.println("===============");
    System.out.println("After serving Vasili, Maria and Katerina");
    System.out.println(mySM.toString());


  }
}
