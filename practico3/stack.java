package practico3;

public class stack<Anytype> {
 
    private Integer index; //indice donde está el último elemento
    private Integer size; //tamanio del arreglo
    private Anytype array[];

    public stack(Integer size){
        this.index = 0;
        this.size = size;
        this.array = (Anytype[]) new Object[size];
    }

    public void push(Anytype item) throws Exception{
        if(isFull()){
            throw new Exception("La pila está llena.");
        }
        this.array[this.index] = item;
        this.index++;
    }
    public Anytype pop() throws Exception{
        if(isEmpty()){
            throw new Exception("La pila está vacía.");
        }
        Anytype value = this.array[this.index - 1]; // asignamos el ultimo valor d la pila
        this.index--; //decrementamos el indice de la pila
        return value; //devolvemos el ultimo valor de la pila
    }
    public Anytype top(){
        return this.array[this.index - 1]; //retorna el ultimo valor
    }

    public boolean isEmpty(){
        return this.index==0;
    }
    public void makeEmpty(){
        this.index = 0;
    }
    public boolean isFull(){
        return this.index == this.size; 
    }
}
