package practico4;

import java.util.Scanner;

public class conversionABinario {
    private nodo<Integer> root = null;

    public void push(Integer numero){
        nodo<Integer> newNodo = new nodo<Integer>(numero);
        newNodo.next = root;
        root = newNodo;
    }
    public Integer pop(){
        if(isEmpty()){
            throw new IllegalStateException("La pila se encuentra vacia.");
        }
        Integer numero = root.elem; //asigno a numero el valor del top
        root = root.next; //el nuevo top es el siguiente al antiguo top
        return numero; //devuelvo el antiguo top, ahora eliminado
    }
    public boolean isEmpty(){
        return this.root == null ? true : false;
    }
    public String conversorABinario(Integer numero){
            if(numero == 0){
            return "0";
        }else{
            String resultado;
            while(numero>0){
                

            }
            return 
        }
    }
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int numero;
        conversionABinario cb = new conversionABinario();
        System.out.print("Ingrese numero = ");
        numero = Integer.parseInt(consola.nextLine());
        cb.push(numero);
        System.out.println("El numero "+numero+" en binario es el "+cb.conversorABinario(numero));
        consola.close();
    }
}
