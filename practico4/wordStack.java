package practico4;
import java.util.Scanner;

public class wordStack {
    private nodo<String>root = null;
    
    public void push(String element){
        nodo<String> newNodo = new nodo<String>(element);
        newNodo.next = root;
        root = newNodo;
    }
    public String pop(){
        if(isEmpty()){
            throw new IllegalStateException("la pila se encuentra vacía.");
        }
        String element = root.elem;
        root = root.next;
        return element;
    }
    public boolean isEmpty(){
        return this.root == null ? true: false;
    }
    public static void main(String[] args) {
        String word;
        char rta;
        Scanner consola = new Scanner(System.in);
        wordStack w = new wordStack();
        do{
            System.out.print("Ingrese una palabra = ");
            word = consola.nextLine();
            w.push(word);
            System.out.println("¿Desea ingresar mas palabras? S/N");
            System.out.print("Ingrese opcion = ");
            rta = consola.nextLine().charAt(0);
        }while(rta == 's' || rta == 'S');
        System.out.println("Orden inverso de las palabras ingresadas: ");
        while(!w.isEmpty()){
            String palabra  = w.pop();
            if(palabra != null)
                System.out.println(palabra);
        }
        consola.close();
    }
}
