package class_15.strategyDP.routeNavigationEg;

public class TollFreeRouteStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String source, String destination) {
        System.out.println("Calculating the toll-free route from " + source + " to " + destination + ".");
    }
}