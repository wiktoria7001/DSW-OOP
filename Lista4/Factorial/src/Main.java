public class Main {
    public static void main(String[] args) {

        try{
            System.out.println(factorial(9));
        }

         catch (NegativeNumberException ex) {
             System.out.println(ex.getMessage());
        }
    }

    public static int factorial(int num) throws NegativeNumberException {
        if (num<0){
            throw new NegativeNumberException("The number must be positve");
        }
        for (int i = num-1; i >= 1; i--) {
            num *= i;
        }
        return num;
    }
}

class NegativeNumberException extends Exception{
    public NegativeNumberException(String string){
        super(string);
    }
}
