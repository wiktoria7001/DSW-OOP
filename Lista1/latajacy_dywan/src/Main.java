public class Main {
    public static void main(String[] args) {


//      ---ZADANIE A---

        Time timeStartA = new Time(17,0,0);
        Time timeEndA = new Time(20,30,0);
        Time tempA = new Time();

        tempA.setTime(timeStartA);

        SpeedMs speedOfCarpetA = new SpeedMs(25);
        SpeedKnot speedOfWindA = new SpeedKnot(10);

        speedOfWindA.toMs();

        Vector carpetA = new Carpet(Direction.WEST,speedOfCarpetA);
        ((Carpet)carpetA).setDistance(300);
        Vector windA = new Wind(Direction.WEST, speedOfWindA);

        carpetA.addVectors(windA);

        ((Carpet) carpetA).distanceToMeters();

        tempA.addSecond((int) ((Carpet) carpetA).calculateTime());

        System.out.println("---ZADANIE A---");
        System.out.println("Czy Mag zdazy na koncert? " + tempA.isBefore(timeEndA));
        System.out.println("Mag bedzie na miejscu o " + tempA);
        System.out.println();


//      ---ZADANIE B---

        SpeedMs speedOfCarpetB = new SpeedMs(25);
        SpeedKnot speedOfWind1B = new SpeedKnot(2);
        SpeedKnot speedOfWind2B = new SpeedKnot(3);

        Time timeStartB = new Time(11,20,0);
        Time timeOfWindChangingB = new Time(2,30,0);

        speedOfWind1B.toMs();
        speedOfWind2B.toMs();

        Vector carpetB = new Carpet(Direction.NORTH, speedOfCarpetB);
        Vector wind1B = new Wind(Direction.SOUTH, speedOfWind1B);
        Vector wind2B = new Wind(Direction.EAST, speedOfWind2B);

        ((Carpet)carpetB).setDistance(500);
        ((Carpet) carpetB).distanceToMeters();

        carpetB.addVectors(wind1B);

        double firstWindDistance = ((Carpet) carpetB).calculateRoad(timeOfWindChangingB.toSeconds());
        double secondWindDistance = ((Carpet) carpetB).getDistance() - firstWindDistance;

        ((Carpet) carpetB).setDistance(secondWindDistance);

        carpetB.setSpeed(speedOfCarpetB.getSpeedMs());
        carpetB.addVectors(wind2B);

        double drugiCzas = ((Carpet) carpetB).calculateTime();


        timeStartB.addSecond(timeOfWindChangingB.toSeconds());
        timeStartB.addSecond((int) drugiCzas);

        System.out.println("---ZADANIE B---");
        System.out.println("Mag przyleci do Wrocławia o "+ timeStartB);
        System.out.println();


//      ---ZADANIE C---
        Time timeStart1C = new Time(10,15,0);
        Time timeStart2C = new Time(10,30,0);
        Time tempC = new Time();

        tempC.setTime(timeStart1C);

        SpeedMs speedOfCarpetC = new SpeedMs(25);
        SpeedKnot speedOfWindC = new SpeedKnot(8);

        speedOfWindC.toMs();

        Vector carpet1C = new Carpet(Direction.WEST, speedOfCarpetC);
        Vector carpet2C = new Carpet(Direction.EAST, speedOfCarpetC);

        Vector windC = new Wind(Direction.WEST, speedOfWindC);

        SpeedMs commonSpeedC = new SpeedMs();

        carpet1C.addVectors(windC);
        carpet2C.addVectors(windC);

        ((Carpet)carpet1C).setDistance(270);
        ((Carpet) carpet1C).distanceToMeters();

        double firstCarpetTime = timeStart2C.toSeconds()-timeStart1C.toSeconds();
        double firstCarpetDistance = ((Carpet) carpet1C).calculateRoad(firstCarpetTime);

        double commonDistance = ((Carpet) carpet1C).getDistance()-firstCarpetDistance;

        commonSpeedC.setSpeedMs(carpet1C.getSpeed()+carpet2C.getSpeed());

        Vector commonC = new Carpet(Direction.WEST, commonSpeedC);

        ((Carpet)commonC).setDistance(commonDistance);

        double meetTime = ((Carpet) commonC).calculateTime();

        tempC.setTime(timeStart2C);
        tempC.addSecond((int)meetTime);

        double ileCzasuLeciacMag1 = tempC.toSeconds()-timeStart1C.toSeconds();

        double meetPoint = ((Carpet) carpet1C).calculateRoad(ileCzasuLeciacMag1);

        System.out.println("---ZADANIE C---");
        System.out.println("Magowie się spotkają o " + tempC + " w odległości " + meetPoint + " m od Wrocławia");
        System.out.println();


//      ---ZADANIE D---
        Time travelTimeD = new Time(0,40,0);
        SpeedMs speedOfCarpetD = new SpeedMs();
        SpeedKnot speedOfWindD = new SpeedKnot(4);
        SpeedKnot limitSpeed = new SpeedKnot(40);

        speedOfWindD.toMs();

        Vector carpetD = new Carpet(Direction.EAST, speedOfCarpetD);
        Vector windD = new Wind(Direction.EAST, speedOfWindD);

        double time = travelTimeD.toSeconds();

        ((Carpet)carpetD).setDistance(70);

        ((Carpet) carpetD).distanceToMeters();

        double newSpeed = ((Carpet) carpetD).calculateSpeed(time);

        speedOfCarpetD.setSpeedMs(newSpeed);
        carpetD.setSpeed(newSpeed);

        carpetD.addVectors(windD);

        limitSpeed.toMs();

        System.out.println("---ZADANIE D---");
        System.out.println("Mag poruszał się z prędkością " + carpetD.getSpeed() + "m/s, a ograniczenie prędkości wynosi " + limitSpeed);
        System.out.println("Czy Mag przekroczyl predkosc? " + (carpetD.getSpeed()>limitSpeed.getSpeedKnot()));


    }
}
