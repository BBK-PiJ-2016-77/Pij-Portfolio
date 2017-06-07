package CircularList;


public class CLClient {

  public static void main(String[] args) {
    CLHospitalManager myManager = new CLHospitalManager();
    CLPatient p1 = new CLPatient("A",1,"A");
    CLPatient p2 = new CLPatient("B",2,"B");
    CLPatient p3 = new CLPatient("C",3,"C");
    CLPatient p4 = new CLPatient("D",4,"D");
    CLPatient p5 = new CLPatient("E",5,"E");
    CLPatient p6 = new CLPatient("F",6,"F");
    CLPatient p7 = new CLPatient("G",7,"G");
    CLPatient p8 = new CLPatient("H",8,"H");
    CLPatient p9 = new CLPatient("I",9,"I");
    CLPatient p10 = new CLPatient("j",10,"J");


    myManager.addPatient(p1);
    myManager.addPatient(p2);
    myManager.addPatient(p3);
    myManager.addPatient(p4);
    myManager.addPatient(p5);
    myManager.addPatient(p6);
    myManager.addPatient(p7);
    myManager.addPatient(p8);
    myManager.addPatient(p9);
    myManager.addPatient(p10);
    myManager.printList();


    System.out.println("============================");

    System.out.println("Patients P1, P5 and P8 was checked and removed from the Queue");

    myManager.deletePatient("A");
    myManager.deletePatient("E");
    myManager.deletePatient("H");

    myManager.printList();
  }
}
