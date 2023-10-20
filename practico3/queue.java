package practico3;

public class queue<Anytype> {
    private Integer size;
    private Anytype array[];
    private Integer front;
    private Integer back;

    public queue(){
        this.size = array.length;
        this.array = (Anytype[]) new Object[size];
        makeEmpty();
    }

    private int increment(int x){
        if(++x == size){
            x = 0;
        }
        return x;
    }

    public void enqueue(Anytype x){
        if(size == array.length){
            doubleQueue();
        }
        back = increment (back);
        array[back] = x;
        size++;
    }

    private void doubleQueue(){ //Expande el arreglo
        Anytype [] newArray;
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
