package practico4;

public class nodo <Anytype>{
    Anytype elem;
    nodo<Anytype> next;

    public nodo(Anytype elem){
        this.elem = elem;
        this.next = null;
    }
}
