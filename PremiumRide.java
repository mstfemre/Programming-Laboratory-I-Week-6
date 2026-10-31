public class PremiumRide extends Ride {
    private final double comfortFee;
    private final double surgeMultiplier;

    public PremiumRide(String passengerName, String pickup, String destination,
                       double distanceKm, int durationMin, double pricePerKm,
                       double comfortFee, double surgeMultiplier) {
        super(passengerName, pickup, destination, distanceKm, durationMin, pricePerKm);
        this.comfortFee = comfortFee;

        if (!Double.isFinite(surgeMultiplier) || surgeMultiplier < 1.0 || surgeMultiplier > 3.0) {
            System.out.println("Warning: surgeMultiplier must be between 1 and 3. Using 1.");
            surgeMultiplier = 1.0;
        }
        this.surgeMultiplier = surgeMultiplier;
    }

    public double getComfortFee() {
        return comfortFee;
    }

    public double getSurgeMultiplier() {
        return surgeMultiplier;
    }

    @Override
    public double calculateFare() {
        return (super.calculateFare() + comfortFee) * surgeMultiplier;
    }

    @Override
    public String toString() {
        return super.toString() + ", comfort fee: " + comfortFee + " TL"
                + ", surge multiplier: " + surgeMultiplier;
    }
}
