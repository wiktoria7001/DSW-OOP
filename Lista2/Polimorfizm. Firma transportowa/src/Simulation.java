import java.util.*;

class Simulation {
    private Map<String, List<Transport>> transportMap;
    private List<Warehouse> warehouses;
    private List<Container> containers;


    public Simulation() {
        transportMap = new HashMap<>();
        warehouses = new ArrayList<>();
        containers = new ArrayList<>();
    }

    public void run() {
        for (int i = 0; i < 40; i++) {
            if (i < 10) {
                containers.add(new Container(Goods.ELECTRONIC_DEVICES));
            } else if (i < 30) {
                containers.add(new Container(Goods.MOBILE_PHONES));
            } else if (i < 35) {
                containers.add(new Container(Goods.SHOES));
            } else {
                containers.add(new Container(Goods.CLOTHES));
            }
        }

        transportMap.put("Ship", new ArrayList<>());
        transportMap.put("Train", new ArrayList<>());
        transportMap.put("Truck", new ArrayList<>());
        transportMap.get("Ship").add(new Ship());
        transportMap.get("Train").add(new Train());
        transportMap.get("Train").add(new Train());
        for (int i = 0; i < 10; i++) {
            transportMap.get("Truck").add(new Truck());
        }

        warehouses.add(new Warehouse("NowyJork"));
        warehouses.add(new Warehouse("Gdansk"));
        warehouses.add(new Warehouse("Wroclaw"));
        warehouses.add(new Warehouse("Krakow"));
        warehouses.add(new Warehouse("Poznan"));

        warehouses.get(0).setContainers(containers);

        warehouses.get(0).setTransports(transportMap.get("Ship"));
        warehouses.get(1).setTransports(transportMap.get("Train"));
        warehouses.get(2).setTransports(transportMap.get("Truck"));

        warehouses.get(0).transport(transportMap.get("Ship").get(0), warehouses.get(1), containers);

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();

        warehouses.get(1).transport(transportMap.get("Train").get(0), warehouses.get(2),warehouses.get(1).getContainers().subList(0,20));
        warehouses.get(1).transport(transportMap.get("Train").get(1), warehouses.get(2),warehouses.get(1).getContainers().subList(20,40));

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();

        for (int i=30; i<40; i++){
            warehouses.get(2).transport(transportMap.get("Truck").get(0), warehouses.get(4),warehouses.get(2).getContainers().subList(i,i+1));
            Transport.increaseTotalTrips();
        }

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();

        for (int i=0; i<30; i++){
            warehouses.get(2).transport(transportMap.get("Truck").get(0), warehouses.get(3),warehouses.get(2).getContainers().subList(i,i+1));
            Transport.increaseTotalTrips();
        }

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();
    }
}
