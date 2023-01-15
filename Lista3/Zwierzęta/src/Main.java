public class Main {
    public static void main(String[] args) {

        Mammal mammal1 = new Mammal("cow");
        Mammal mammal2 = new Mammal("horse");

        Bird bird1 = new Bird("chiicken");
        Bird bird2 = new Bird("duck");

        Enclosure<Mammal> mammalEnclosure = new Enclosure<>();
        Enclosure<Bird> birdEnclosure = new Enclosure<>();

        mammalEnclosure.addAnimal(mammal1);
        mammalEnclosure.addAnimal(mammal2);
        System.out.println(mammalEnclosure.getNumberOfAnimals());
        System.out.println(mammalEnclosure);

        birdEnclosure.addAnimal(bird1);
        birdEnclosure.addAnimal(bird2);
        birdEnclosure.removeAnimals(bird1);
        System.out.println(birdEnclosure.getNumberOfAnimals());
        System.out.println(birdEnclosure);


    }
}
