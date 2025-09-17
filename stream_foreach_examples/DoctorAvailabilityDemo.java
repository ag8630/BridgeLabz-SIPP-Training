import java.util.*;
import java.util.stream.Collectors;

class Doctor {
    private String name;
    private String specialty;
    private boolean availableWeekend;
    public Doctor(String name, String specialty, boolean availableWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableWeekend = availableWeekend;
    }
    public String getSpecialty() { return specialty; }
    public boolean isAvailableWeekend() { return availableWeekend; }
    @Override public String toString() {
        return name + " (" + specialty + ") - Weekend Available: " + availableWeekend;
    }
}

public class DoctorAvailabilityDemo {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Alice", "Cardiology", true),
            new Doctor("Bob", "Neurology", false),
            new Doctor("Charlie", "Pediatrics", true)
        );

        doctors.stream()
            .filter(Doctor::isAvailableWeekend)
            .sorted(Comparator.comparing(Doctor::getSpecialty))
            .forEach(System.out::println);
    }
}
