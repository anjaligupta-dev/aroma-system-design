package class_15.strategyDP.routeNavigationEg;

public class ShortestRouteStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String source, String destination) {
        System.out.println("Calculating the shortest route from " + source + " to " + destination + ".");
    }
}
