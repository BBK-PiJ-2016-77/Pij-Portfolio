package CircularList;


public class CLPatient {
  private String patientsName;
  private int patientsAge;
  private String patientsIllness;
  private CLPatient nextPatient;

  public CLPatient(String name, int age, String illness) {
    patientsAge = age;
    patientsName = name;
    patientsIllness = illness;
  }

  public String getPatientsIlleness() {return patientsIllness;}

  public void setPatientsIllness(String newIlleness) {patientsIllness = newIlleness;}

  public int getPatientsAge() {return patientsAge;}

  public void setPatientsAge(int newAge) { patientsAge = newAge;}

  public String getPatientsName() {return patientsName;}

  public CLPatient getNextPatient() {return nextPatient;}

  public void setNextPatient(CLPatient patient) {nextPatient = patient;}
}
