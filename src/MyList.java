import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    private final int DEFAULT_CAPACITY=10;
    private Object[] elements;

    public MyList() {
        this.elements = new Object[DEFAULT_CAPACITY] ;
    }

    public MyList(int size, Object[] elements) {
        this.size = size;
        this.elements = elements;
    }
    private void ensureCapa(){
        int newSize=elements.length*2;
        elements=Arrays.copyOf(elements,newSize);
    }
    public void add(E e){
        if(size== elements.length){
            ensureCapa();
        }
        else{
            elements[size++]=e;
        }
    }
    public E get(int index){
        if(index>=size|| index<0){
            throw new IndexOutOfBoundsException("Index: "+ index+ ", size "+ index);
        }
        return (E) elements[index];
    }
    public int getSize() {
        return size;
    }
}
