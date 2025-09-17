import java.util.*;

class PetrolPump {
    int petrol, distance;
    PetrolPump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}

public class CircularTourProblem {
    public static int findStartingPoint(PetrolPump[] pumps) {
        int start = 0, surplus = 0, deficit = 0;
        for (int i = 0; i < pumps.length; i++) {
            surplus += pumps[i].petrol - pumps[i].distance;
            if (surplus < 0) {
                start = i + 1;
                deficit += surplus;
                surplus = 0;
            }
        }
        return (surplus + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = { new PetrolPump(6, 4), new PetrolPump(3, 6), new PetrolPump(7, 3) };
        System.out.println("Starting point: " + findStartingPoint(pumps));
    }
}