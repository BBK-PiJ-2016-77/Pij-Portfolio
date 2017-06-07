package DllHospital;


public class DllHospitalManager {


    private DllPatient firstPatient = null;

    public void addPatient(DllPatient newPatient) {
      if(firstPatient == null) {
        firstPatient = newPatient;

        return;
      }

      DllPatient current = firstPatient;
      while(current.getNextPatient() != null) {
        current = current.getNextPatient();
      }
      current.setNextPatient(newPatient);
      newPatient.setPreviousPatient(current);
    }

    public boolean deletePatient(String name) {
      if(firstPatient ==null) {
        return false;
      }

      if(firstPatient.getPatientsName().equals(name)) {
        firstPatient = firstPatient.getNextPatient();
        firstPatient.setPreviousPatient(null);
        return true;
      }

      DllPatient current = firstPatient;
      while(current !=null) {

        if(current.getPatientsName().equals(name)) {
          current.getPreviousPatient().setNextPatient(current.getNextPatient());
          current.getNextPatient().setPreviousPatient(current.getPreviousPatient());
          return true;
        }
        current = current.getNextPatient();
      }
      return false;
    }

    public int Queue() {

      return Queue(firstPatient);
    }

    private int Queue(DllPatient firstPatientInQueue) {
      if(firstPatientInQueue == null) {
        return 0;
      } else {
        return 1 + Queue(firstPatientInQueue.getNextPatient());
      }
    }


    public void printList() {
      DllPatient temp = firstPatient;

      while(temp!=null) {
        System.out.println("Name: "+ temp.getPatientsName() + "\tAge: "+temp.getPatientsAge()+
                "\t Illeness: "+temp.getPatientsIlleness());
        temp = temp.getNextPatient();

      }
    }

    public void printingBackWards() {
      DllPatient temp = firstPatient;
      while (temp.getNextPatient()!=null) {

        temp = temp.getNextPatient();
      }

      while(temp!=null) {
        System.out.println("Name: "+ temp.getPatientsName() + "\tAge: "+temp.getPatientsAge()+
                "\t Illeness: "+temp.getPatientsIlleness());
        temp = temp.getPreviousPatient();
      }
     }
}


