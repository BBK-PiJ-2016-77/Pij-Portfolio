package CircularList;


public class CLHospitalManager {
  private CLPatient firstPatient = null;

  public void addPatient(CLPatient newPatient) {
    if(firstPatient == null) {
      firstPatient = newPatient;
      firstPatient.setNextPatient(firstPatient);
      return;
    }

    CLPatient current = this.firstPatient;
    while(current.getNextPatient() != firstPatient) {
      current = current.getNextPatient();
    }
    current.setNextPatient(newPatient);
    newPatient.setNextPatient(firstPatient);
  }

  public boolean deletePatient(String name) {
    if(firstPatient ==null) {
      return false;
    }
    CLPatient current = firstPatient;
    if(firstPatient.getPatientsName().equals(name)) {
      firstPatient = firstPatient.getNextPatient();
      CLPatient temp = firstPatient;
      while(temp.getNextPatient()!=current) {
        temp = temp.getNextPatient();
      }
      temp.setNextPatient(firstPatient);
      return true;
    }

    while(current.getNextPatient() != firstPatient) {
      if(current.getNextPatient().getPatientsName().equals(name)) {

        if(current.getNextPatient().getNextPatient() == firstPatient) {
          current.setNextPatient(firstPatient);
          return true;
        }
        current.setNextPatient(current.getNextPatient().getNextPatient());
        return true;
      }
      current = current.getNextPatient();
    }
    return false;
  }

  public int Queue() {

    return Queue(firstPatient);
  }

  private int Queue(CLPatient firstPatientInQueue) {
    if(firstPatientInQueue == null) {
      return 0;
    } else {
      return 1 + Queue(firstPatientInQueue.getNextPatient());
    }

  }


  public void printList() {
    CLPatient temp = firstPatient;

    do{
      System.out.println("Name: "+ temp.getPatientsName() + "\tAge: "+temp.getPatientsAge()+
              "\t Illeness: "+temp.getPatientsIlleness());
      temp = temp.getNextPatient();
    }while(temp != firstPatient);
  }
}
