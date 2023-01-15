import java.util.*;

public class Warehouse {
    private String name;
    private List<Transport> transports;
    private List<Container> containers;

    public Warehouse(String name) {
        this.name = name;
        this.containers = new ArrayList<>();
    }

    public void transport(Transport transport, Warehouse destination, List<Container> containers) {
        System.out.println("Transport containers from " + this.name + " to " + destination.getName() + ".");
        for (Container container : containers) {
            transport.load(container);
        }
        transport.unloadAll();
        destination.setTransports(transports);
        this.setTransports(null);
        destination.getContainers().addAll(containers);
        Transport.increaseTotalTrips();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Transport> getTransports() {
        return transports;
    }

    public void setTransports(List<Transport> transports) {
        this.transports = transports;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public void setContainers(List<Container> containers) {
        this.containers = containers;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "name='" + name + '\'' +
                ", transports=" + transports +
                ", containers=" + containers +
                '}';
    }
}
