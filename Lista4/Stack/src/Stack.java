public class Stack {

    private Integer[] elements;
    private int size = 0;

    public Stack(int max){
        if (max<0){
            throw new IllegalArgumentException("Number must be positive");
        }
        this.elements = new Integer[max];
    }

    public void push(int num){
        if (this.elements.length <= this.size){
            throw new StackFullException();
        }
        this.elements[size++]= num;
    }

    public int pop(){
        if (this.size == 0){
            throw new StackEmptyException();
        }
        int temp = this.elements[this.size-1];
        this.elements[this.size-1] = null;
        return temp;
    }

    public void clear(){
        for( int i = 0; i< elements.length; i++){
            this.elements[i] = null;
        }
        this.size = 0;
    }

    public int top(){
        if (this.size == 0){
            throw new StackEmptyException();
        }
        return this.elements[this.size-1];
    }

    public int size(){
        return this.size;
    }
}

