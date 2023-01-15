import java.util.*;

public abstract class Transport {

    protected Container[] containers;
    private int containerCount;
    private int capacity;
    private static int totalTrips;


    public Transport(int capacity) {
        this.capacity = capacity;
        this.containers = new Container[capacity];
        this.containerCount = 0;
    }

    public void load(Container container) {
        if (containerCount < capacity) {
            containers[containerCount] = container;
            containerCount++;
            System.out.println("Loading container with goods of type " + container.getGoodsType() + " on a " + getClass().getName());
        } else {
            System.out.println("Transport is full, cannot load more containers.");
        }
    }

    public void loadAll(List<Container> containers) {
        int containersToLoad = Math.min(containers.size(), capacity - containerCount);
        for (int i = 0; i < containersToLoad; i++) {
            Container container = containers.get(i);
            this.containers[containerCount] = container;
            containerCount++;
            System.out.println("Loading container with goods of type " + container.getGoodsType() + " on a " + getClass().getName());
        }
        System.out.println("Transport is full, cannot load more containers.");
    }

    public void unload(Container container) {
        if (containerCount > 0) {
            for (int i = 0; i < containerCount; i++) {
                if (containers[i] == container) {
                    for (int j = i; j < containerCount - 1; j++) {
                        containers[j] = containers[j + 1];
                    }
                    containerCount--;
                    System.out.println("Unloading container with goods of type " + container.getGoodsType() + ".");
                    break;
                }
            }
        } else {
            System.out.println("Transport is empty, cannot unload any containers.");
        }
    }

    public void unloadAll() {
        if (containerCount > 0) {
            for (int i = 0; i < containerCount; i++) {
                System.out.println("Unloading container with goods of type " + containers[i].getGoodsType() + ".");
            }
            containerCount = 0;
        } else {
            System.out.println("Transport is empty, cannot unload any containers.");
        }
    }

    public Container[] getContainers() {
        return containers;
    }

    public void setContainers(Container[] containers) {
        this.containers = containers;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
       this.capacity = capacity;
    }

    static int getTotalTrips() {
        return totalTrips;
    }

    static void increaseTotalTrips(){
        totalTrips++;
    }
}


