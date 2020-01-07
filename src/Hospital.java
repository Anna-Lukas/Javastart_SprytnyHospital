public class Hospital {
    private final int maxPatientNumber = 10;
    private Patient[] patients = new Patient[maxPatientNumber];
    private int registeredPatient = 0;

    public void addPatient(Patient patient){
        if( registeredPatient<maxPatientNumber){
            patients[registeredPatient] = patient;
            registeredPatient++;
        }else {
            System.out.println ("Brak miejsc. Zapisana została maksymalna ilosc pacjentów");
        }
    }
    public void printPatients(){
        for(int i = 0; i<registeredPatient;i++){
            System.out.println (patients[i].getFirstName ()+" "+ patients[i].getLastName ()+" "+patients[i].getPesel () );
        }
    }
}
