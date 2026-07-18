package class_17.observerDP.rideBookingEg;

import java.util.*;

public class RideService implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private Ride currentRide;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println(observer + " subscribed.");
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println(observer + " unsubscribed.");
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(currentRide);
        }
    }

    public void updateRideStatus(Ride ride, RideStatus status) {
        ride.setStatus(status);

        currentRide = ride;

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Ride Status Updated");
        System.out.println("Ride Id : " + ride.getRideId());
        System.out.println("Passenger : " + ride.getPassengerName());
        System.out.println("Driver : " + ride.getDriverName());
        System.out.println("Status : " + status);
        System.out.println("--------------------------------");
        System.out.println();

        notifyObservers();
    }
}
