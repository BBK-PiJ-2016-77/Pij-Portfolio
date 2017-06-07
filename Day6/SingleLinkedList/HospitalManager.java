package SingleLinkedList;


public class HospitalManager {


  private Patient firstPatient = null;

  public void addPatient(Patient newPatient) {
    if(firstPatient == null) {
      firstPatient = newPatient;
      return;
    }

    Patient current = this.firstPatient;
    while(current.getNextPatient() != null) {
      current = current.getNextPatient();
    }
    current.setNextPatient(newPatient);
  }

  public boolean deletePatient(String name) {
    if(firstPatient ==null) {
      return false;
    }

    if(firstPatient.getPatientsName().equals(name)) {
      firstPatient = firstPatient.getNextPatient();
      return true;
    }

    Patient current = firstPatient;
    while(current.getNextPatient() !=null) {

      if(current.getNextPatient().getPatientsName().equals(name)) {
        current.setNextPatient(current.getNextPatient().getNextPatient());
        return true;
      }
      current = current.getNextPatient();
    }
    return false;
  }


  public void printList() {
    Patient temp = firstPatient;

    while(temp!=null) {
      System.out.println("Name: "+ temp.getPatientsName() + "\tAge: "+temp.getPatientsAge()+
      "\t Illeness: "+temp.getPatientsIlleness());
      temp = temp.getNextPatient();

    }
  }
}
