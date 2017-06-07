package DllHospital;


import SingleLinkedList.Patient;

public class DllPatient {



    private String patientsName;
    private int patientsAge;
    private String patientsIllness;
    private DllPatient nextPatient;
    private DllPatient previousPatient;

    public DllPatient(String name, int age, String illness) {
      patientsAge = age;
      patientsName = name;
      patientsIllness = illness;
    }

    public String getPatientsIlleness() {return patientsIllness;}

    public void setPatientsIllness(String newIlleness) {patientsIllness = newIlleness;}

    public int getPatientsAge() {return patientsAge;}

    public void setPatientsAge(int newAge) { patientsAge = newAge;}

    public String getPatientsName() {return patientsName;}

    public DllPatient getNextPatient() {return nextPatient;}

    public void setNextPatient(DllPatient patient) {nextPatient = patient;}

    public DllPatient getPreviousPatient() {return previousPatient;}

    public void setPreviousPatient(DllPatient beforHim) { previousPatient = beforHim;}




}
