public class Main {
    
    public static void main(String[] args) {
        try {
            Stack stack = new Stack(-5);
        }
        catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

        Stack stack1 = new Stack(5);
        try{
            stack1.pop();
        }
        catch (StackEmptyException ex){
            System.out.println(ex.getMessage());
        }

        try {
            for (int i = 1; i < 10; i++) {
                stack1.push(i);
            }
        }
        catch(StackFullException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Stack size: " + stack1.size());
        stack1.clear();

        try{
            stack1.top();
        }
        catch (StackEmptyException ex){
            System.out.println(ex.getMessage());
        }
    }
}
