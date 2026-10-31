import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ride> rides = new ArrayList<>();

        rides.add(new Ride("Ali", "Kadikoy", "Uskudar", 10, 20, 5));
        rides.add(new EconomyRide("Ayse", "Besiktas", "Taksim", 10, 20, 5, 2));
        rides.add(new PremiumRide("Emre", "Sisli", "Levent", 10, 20, 5, 30, 1.5));
        rides.add(new SharedRide("Zeynep", "Maltepe", "Kartal", 10, 20, 5, 2, 3));

        printRides(rides);

        System.out.println("Minimum fare and invalid input examples:");
        ArrayList<Ride> examples = new ArrayList<>();
        examples.add(new EconomyRide("Can", "A", "B", 1, 1, 5, 2));
        examples.add(new SharedRide("Ece", "A", "B", 1, 1, 5, 2, 4));
        examples.add(new Ride("Deniz", "A", "B", 0, -5, 0));
        examples.add(new PremiumRide("Mert", "A", "B", 10, 20, 5, 30, 4));
        examples.add(new SharedRide("Elif", "A", "B", 10, 20, 5, 2, 0));

        printRides(examples);
    }

    private static void printRides(ArrayList<Ride> rides) {
        for (Ride ride : rides) {
            System.out.println(ride.getClass().getSimpleName());
            System.out.println(ride);
            String label = ride instanceof SharedRide ? "Fare per passenger" : "Fare";
            System.out.printf(Locale.US, "%s: %.2f TL%n%n", label, ride.calculateFare());
        }
    }
}
