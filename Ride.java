public class Ride {
    private final String passengerName;
    private final String pickup;
    private final String destination;
    private final double distanceKm;
    private final int durationMin;
    private final double pricePerKm;

    public Ride(String passengerName, String pickup, String destination,
                double distanceKm, int durationMin, double pricePerKm) {
        this.passengerName = passengerName;
        this.pickup = pickup;
        this.destination = destination;

        if (!Double.isFinite(distanceKm) || distanceKm <= 0) {
            System.out.println("Warning: distanceKm must be positive. Using 1.");
            distanceKm = 1;
        }
        if (durationMin <= 0) {
            System.out.println("Warning: durationMin must be positive. Using 1.");
            durationMin = 1;
        }
        if (!Double.isFinite(pricePerKm) || pricePerKm <= 0) {
            System.out.println("Warning: pricePerKm must be positive. Using 1.");
            pricePerKm = 1;
        }

        this.distanceKm = distanceKm;
        this.durationMin = durationMin;
        this.pricePerKm = pricePerKm;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDestination() {
        return destination;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    public double calculateFare() {
        return distanceKm * pricePerKm;
    }

    @Override
    public String toString() {
        return "Passenger: " + passengerName
                + ", pickup: " + pickup
                + ", destination: " + destination
                + ", distance: " + distanceKm + " km"
                + ", duration: " + durationMin + " min"
                + ", price per km: " + pricePerKm + " TL";
    }
}
