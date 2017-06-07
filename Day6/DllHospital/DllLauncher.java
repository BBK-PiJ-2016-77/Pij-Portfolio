package DllHospital;


public class DllLauncher {


  public static void main(String[] args){
    DllHospitalManager myManager = new DllHospitalManager();

    DllPatient p1 = new DllPatient("A",1,"A");
    DllPatient p2 = new DllPatient("B",2,"B");
    DllPatient p3 = new DllPatient("C",3,"C");
    DllPatient p4 = new DllPatient("D",4,"D");
    DllPatient p5 = new DllPatient("E",5,"E");
    DllPatient p6 = new DllPatient("F",6,"F");
    DllPatient p7 = new DllPatient("G",7,"G");
    DllPatient p8 = new DllPatient("H",8,"H");
    DllPatient p9 = new DllPatient("I",9,"I");
    DllPatient p10 = new DllPatient("j",10,"J");



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
    System.out.println("Patients in Queue "+myManager.Queue());

    System.out.println("============================");

    System.out.println("Patients P1, P5 and P8 was checked and removed from the Queue");

    myManager.deletePatient("A");
    myManager.deletePatient("E");
    myManager.deletePatient("H");

    myManager.printList();
    System.out.println("Patients in Queue "+myManager.Queue());

    myManager.printList();
    System.out.println("Printing Queue BackWards");
    myManager.printingBackWards();







  }
}
