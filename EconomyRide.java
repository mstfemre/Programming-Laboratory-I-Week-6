public class EconomyRide extends Ride {
    private final double pricePerMinute;

    public EconomyRide(String passengerName, String pickup, String destination,
                       double distanceKm, int durationMin, double pricePerKm,
                       double pricePerMinute) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.pricePerMinute = pricePerMinute;
    }

    public double getPricePerMinute() {
        return pricePerMinute;
    }

    @Override
    public double calculateFare() {
        double fare = super.calculateFare() + getDurationMin() * pricePerMinute;
        return Math.max(fare, 50.0);
    }

    @Override
    public String toString() {
        return super.toString() + ", price per minute: " + pricePerMinute + " TL";
    }
}
