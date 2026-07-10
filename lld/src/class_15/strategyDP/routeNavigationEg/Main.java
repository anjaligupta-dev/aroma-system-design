package class_15.strategyDP.routeNavigationEg;

public class Main {
    public static void main(String[] args) {
        String source = "Bangalore";
        String destination = "Chennai";

        NavigationService navigation = new NavigationService(new FastestRouteStrategy());

        System.out.println("User selects Fastest Route");
        navigation.navigate(source, destination);

        System.out.println();

        System.out.println("User changes preference to Toll-Free Route");
        navigation.setRouteStrategy(new TollFreeRouteStrategy());
        navigation.navigate(source, destination);

        System.out.println();

        System.out.println("User changes preference to Shortest Route");
        navigation.setRouteStrategy(new ShortestRouteStrategy());
        navigation.navigate(source, destination);
    }
}


/* *

    Output :
        User selects Fastest Route
        Calculating the fastest route from Bangalore to Chennai.

        User changes preference to Toll-Free Route
        Calculating the toll-free route from Bangalore to Chennai.

        User changes preference to Shortest Route
        Calculating the shortest route from Bangalore to Chennai.

* */