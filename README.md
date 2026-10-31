# Programming Laboratory-I : Week 6

Java inheritance exercise for a ride service.

## Classes

- `Ride`: stores passenger and route details, distance, duration, and price per kilometer. Base fare is `distanceKm * pricePerKm`.
- `EconomyRide`: extends `Ride`, adds a time charge, and applies a minimum fare of 50 TL.
- `PremiumRide`: extends `Ride`. Fare is `(base fare + comfortFee) * surgeMultiplier`.
- `SharedRide`: extends `EconomyRide`. Fare per passenger is `economy fare / passengerCount * 1.10`. The 50 TL minimum applies to the whole ride before division.
- `Main`: stores rides in an `ArrayList<Ride>` and prints their details and fares using a loop.

Each public class has its own Java file. Keep all five files in the same directory. Every subclass extends `super.toString()` with its own details.

## Validation

Invalid distance, duration, or price per kilometer produces a warning and is replaced with 1. The surge multiplier must be between 1 and 3, inclusive; otherwise it becomes 1. The passenger count must be between 1 and 4, inclusive; otherwise it becomes 1. Validation uses warning messages rather than exceptions. Non-finite distance, price per kilometer, and surge values are also replaced with 1.

## Run

Requires JDK 8 or later. Tested with JDK 25.

```sh
javac Ride.java EconomyRide.java PremiumRide.java SharedRide.java Main.java
java Main
```

The program prints ride details followed by these fares:

| Example | Fare |
| --- | ---: |
| Ride | 50.00 TL |
| EconomyRide | 90.00 TL |
| PremiumRide | 120.00 TL |
| SharedRide, 3 passengers | 33.00 TL per passenger |
| EconomyRide, minimum fare | 50.00 TL |
| SharedRide, minimum fare and 4 passengers | 13.75 TL per passenger |
| Ride, invalid base values | 1.00 TL |
| PremiumRide, invalid multiplier | 80.00 TL |
| SharedRide, invalid passenger count | 99.00 TL per passenger |
