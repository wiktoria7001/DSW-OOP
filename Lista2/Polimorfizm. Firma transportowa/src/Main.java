public class Main {
    public static void main(String[] args) {

        Simulation simulation = new Simulation();
        simulation.run();

        System.out.println("Total trips: " + Transport.getTotalTrips());
    }

}
