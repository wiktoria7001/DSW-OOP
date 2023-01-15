public class Para <T extends Comparable<T>> {
    private T left;
    private T right;

public Para(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public void setLeft(T left) {
        this.left = left;
    }

    public T getRight() {
        return right;
    }

    public void setRight(T right) {
        this.right = right;
    }

    public void swap() {
        T temp = left;
        left = right;
        right = temp;
    }

    public T max(){
        return left.compareTo(right) < 0 ? right : left;
    }

    @Override
    public String toString() {
        return "Lewy element - " + this.left + ". Prawy element - " + this.right;
    }



}
