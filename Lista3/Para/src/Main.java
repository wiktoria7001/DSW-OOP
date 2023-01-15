public class Main {
    public static void main(String[] args) {


        Para <String> paraStringow = new Para<>("lewy", "prawy");
        System.out.println(paraStringow);
        System.out.println("Najwiekszy element "+ paraStringow.max());
        paraStringow.swap();
        System.out.println(paraStringow);

        System.out.println();

        Para <Integer> paraInt = new Para<>(0,1);
        System.out.println(paraInt);
        System.out.println("Najwiekszy element " + paraInt.max());
        paraInt.swap();
        System.out.println(paraInt);

        System.out.println();

        Para <Double> paraDouble = new Para<>(0.1, 1.0);

        System.out.println(paraDouble);
        System.out.println("Najwiekszy element " + paraDouble.max());
        paraDouble.swap();
        System.out.println(paraDouble);
        
    }
}
