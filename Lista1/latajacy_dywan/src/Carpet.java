public class Carpet extends Vector{

    private double distance;

    public Carpet(Direction direction, SpeedMs speedMs) {
        super(direction, speedMs);
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void distanceToMeters(){
        this.distance= this.distance*1000;
    }


    public double calculateTime() {
        return this.distance / this.speed;
    }

    public double calculateRoad(double time) {
        return this.speed*time;
    }

    public double calculateSpeed(double time) {
        return this.distance/time;
    }
}
