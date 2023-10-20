package practico4;

import java.util.Scanner;

public class colaDeEnteros {
    private nodo<Integer> front;
    private nodo<Integer> back;

    public colaDeEnteros(){
        this.front = null;
        this.back = null;
    }
    public void enqueue(Integer elem){
        nodo<Integer> newNodo = new nodo<Integer>(elem);
        if(isEmpty()){
            front = newNodo;
            back = newNodo;
        }else{
            back.next = newNodo;
            back = newNodo;
        }
    }
    public Integer dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("La cola está vacía.");
        }
        Integer dato = front.elem;
        front = front.next;
        if(front == null){
            back = null;
        }
        return dato;
    }
    public Integer front(){
        if(isEmpty()){
            throw new IllegalStateException("La cola está vacía.");
        }
        return front.elem;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        char rta;
        int numero;
        int suma=0;
        colaDeEnteros ce = new colaDeEnteros();

        do{
            System.out.print("Ingrese un numero = ");
            numero = Integer.parseInt(consola.nextLine());
            ce.enqueue(numero);
            System.out.println("¿Desea agregar mas elementos? S/N");
            System.out.print("Ingrese opcion = ");
            rta = consola.nextLine().charAt(0);
        }while(rta == 's' || rta == 'S');
        while(!ce.isEmpty()){
            suma = suma + ce.dequeue();
        }
        System.out.println("La sumatoria de los elementos de la cola es "+suma);
        consola.close();
    }
}
