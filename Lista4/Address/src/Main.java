public class Main {
    public static void main(String[] args) {
        try {
            Address address = new Address("Strzegomska", "55", "53-611","Wroclaw");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }


}
