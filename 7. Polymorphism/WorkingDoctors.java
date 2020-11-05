import java.util.ArrayList;

public class WorkingDoctors {
    public static void main(String[] args) {
        new Doctor().doMedicine();

        Doctor generalPractitioner = new GeneralPractitioner();
        Doctor surgeon = new Surgeon();

        generalPractitioner.doMedicine();
        surgeon.doMedicine();

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(generalPractitioner);
        doctors.add(surgeon);

        for(Doctor doctor : doctors) {
            doctor.doMedicine();
        }
    }
}
