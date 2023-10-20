package practico3;

public class ordenamientoQueue {
    private Integer size;
    private int array[];
    private Integer front;
    private Integer back;

    public ordenamientoQueue(){
        this.size = size;
        this.array = int[] new Object[size];
        makeEmpty();
    }

    private int increment(int x){
        if(++x == size){
            x = 0;
        }
        return x;
    }

    public void enqueue(int x){
        if(size == array.length){
            doubleQueue();
        }
        back = increment (back);
        array[back] = x;
        size++;
    }

    private void doubleQueue(){ //Expande el arreglo
        int [] newArray;
        newArray = (Anytype []) new Object[array.length*2];
        for(int i=0; i < size; i++, front = increment(front)){
            newArray[i] = array[front];
        }
        array = newArray;
        front = 0;
        back = size - 1;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }

    public Anytype dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Cola vacía.");
        }
        size--;
        Anytype returnValue = array[front];
        return returnValue;
    }
    public Anytype getFront(){
        if(isEmpty()){
            throw new IllegalStateException("Cola vacía.");
        }
        return array[front];
    }
    public void makeEmpty(){
        size = 0;
        front = 0;
        back = -1;
    }
}
