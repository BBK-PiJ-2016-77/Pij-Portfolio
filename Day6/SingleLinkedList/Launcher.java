package SingleLinkedList;


public class Launcher {

  public static void main(String[] args){
    HospitalManager myManager = new HospitalManager();
    Patient patientOne = new Patient("P1", 54, "pain");
    Patient patientTwo = new Patient("P2", 54, "pain");
    Patient patientThree = new Patient("P3", 54, "pain");
    Patient patientFour = new Patient("P4", 54, "pain");
    Patient patientFive = new Patient("P5", 54, "pain");
    Patient patientSix = new Patient("P6", 54, "pain");
    Patient patientSeven = new Patient("P7", 54, "pain");
    Patient patientEight = new Patient("P8", 54, "pain");
    Patient patientNine = new Patient("P9", 54, "pain");
    Patient patientTen = new Patient("P10", 54, "pain");

    myManager.addPatient(patientOne);
    myManager.addPatient(patientTwo);
    myManager.addPatient(patientThree);
    myManager.addPatient(patientFour);
    myManager.addPatient(patientFive);
    myManager.addPatient(patientSix);
    myManager.addPatient(patientSeven);
    myManager.addPatient(patientEight);
    myManager.addPatient(patientNine);
    myManager.addPatient(patientTen);

    myManager.printList();

    myManager.deletePatient("P3");
    myManager.deletePatient("P6");
    myManager.deletePatient("P9");

    System.out.println("================================");
    System.out.println("After deletion");
    myManager.printList();

    System.out.println("================================");
    System.out.println("Deleted the first Patient");

    myManager.deletePatient("P1");
    myManager.printList();

    System.out.println(myManager.Queue());



  }
}
