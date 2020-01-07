import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        final int exit = 0;
        final int addPatient = 1;
        final int printPatient = 2;

        Scanner scanner= new Scanner (System.in);
        int option = -1;

        Hospital hospital = new Hospital ();

        while (option!= exit){
            System.out.println ("Dostępne opcje");
            System.out.println (" 0 = wyjscie");
            System.out.println (" 1 = dodaj pajcenta");
            System.out.println (" 2 = pokaż liste");

            System.out.println ("wybierz opcje: ");
            option = scanner.nextInt ();
            scanner.nextLine ();

            switch (option){
                case addPatient:
                    Patient patient= new Patient();
                    System.out.println (" POdaj imie: ");
                    patient.setFirstName (scanner.nextLine ());

                    System.out.println (" POdaj nazwisko: ");
                    patient.setLastName (scanner.nextLine ());

                    System.out.println (" POdaj pesel: ");
                    patient.setPesel (scanner.nextLine ());

                    hospital.addPatient (patient);
                    break;
                case printPatient:
                    hospital.printPatients ();
                    break;
                case exit:
                    System.out.println ("Zakończenie programu");
                    break;
                default:
                    System.out.println ("nie znaleziono opcji");
            }
        }
        scanner.close ();
    }
}
