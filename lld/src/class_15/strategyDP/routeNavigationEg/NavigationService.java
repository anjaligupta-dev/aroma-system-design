package class_15.strategyDP.routeNavigationEg;

public class NavigationService {
    private RouteStrategy routeStrategy;

    public NavigationService(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void navigate(String source, String destination) {
        routeStrategy.calculateRoute(source, destination);
    }

    // Change strategy at runtime
    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }
}
