public class SpeedMs {
    private double speedMs;

    public SpeedMs(){
    }

    public SpeedMs(double speedMs){
        this.speedMs = speedMs;
    }

    public double getSpeedMs() {
        return speedMs;
    }

    public void setSpeedMs(double speedMs) {
        this.speedMs = speedMs;
    }


    public void toKnots(){
        this.speedMs= this.speedMs/0.51;
    }
}
