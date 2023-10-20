package practico4;

public class stackList<Anytype> {
    private nodo<Anytype> root = null;

    public void push(Anytype element){ //agregar elemento a la pila
        nodo<Anytype> newNodo = new nodo<Anytype>(element);
        newNodo.next = root;
        root = newNodo;
    }
    public Anytype pop(){ //borramos y retornamos el ultimo valor
        Anytype element = root.elem;
        root = root.next;
        return element;
    }
    public Anytype top(){ //retorna el ultimo valor
        return root.elem;
    }
    public boolean isEmpty(){
        return this.root == null ? true: false;
    }
    public void makeEmpty(){
        this.root = null;
    }
    public int size(){
        int count = 0;
        nodo<Anytype> actual = this.root;
        while(actual != null){
            count++;
            actual = actual.next;
        } 
        return count;
    }
}

