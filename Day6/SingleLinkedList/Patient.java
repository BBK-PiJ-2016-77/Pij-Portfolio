package SingleLinkedList;


public class Patient {

  private String patientsName;
  private int patientsAge;
  private String patientsIllness;
  private Patient nextPatient;

  public Patient(String name, int age, String illness) {
    patientsAge = age;
    patientsName = name;
    patientsIllness = illness;
  }

  public String getPatientsIlleness() {return patientsIllness;}

  public void setPatientsIllness(String newIlleness) {patientsIllness = newIlleness;}

  public int getPatientsAge() {return patientsAge;}

  public void setPatientsAge(int newAge) { patientsAge = newAge;}

  public String getPatientsName() {return patientsName;}

  public Patient getNextPatient() {return nextPatient;}

  public void setNextPatient(Patient patient) {nextPatient = patient;}



}
