package class_15.strategyDP.routeNavigationEg;

public class FastestRouteStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String source, String destination) {
        System.out.println("Calculating the fastest route from " + source + " to " + destination + ".");
    }
}