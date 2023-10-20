package practico4;

public class queueList<Anytype> {
    private nodo<Anytype> front;
    private nodo<Anytype> back;

    public queueList(){
        this.front = null;
        this.back = null;
    }
    public void enqueue(Anytype elem){
        nodo<Anytype> newNodo = new nodo<Anytype>(elem);
        if(isEmpty()){
            front = newNodo;
            back = newNodo;
        }else{
            back.next = newNodo;
            back = newNodo;
        }
    }
    public Anytype dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("La cola está vacía.");
        }
        Anytype dato = front.elem;
        front = front.next;
        if(front == null){
            back = null;
        }
        return dato;
    }
    public Anytype front(){
        if(isEmpty()){
            throw new IllegalStateException("La cola está vacía.");
        }
        return front.elem;
    }
    public boolean isEmpty(){
        return front == null;
    }

}
