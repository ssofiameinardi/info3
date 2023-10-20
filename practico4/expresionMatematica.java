package practico4;

import java.util.Scanner;

public class expresionMatematica {

    public expresionMatematica(){
        private nodo<String>root = null;
    
        public void push(String palabra){
            nodo<String> newNodo = new nodo<String>(palabra);
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
        public boolean parentesisBalanceados(String palabra){
            for(int i=0; i < palabra.length(); i++){
                char caracter = palabra.charAt(i);

                if(caracter == '('){
                    push(caracter);
                }else if(caracter == ')'){
                    if(isEmpty() || pop() != '('){
                        return false;
                    }
                }
            }
            return true; //pila vacia porque se eliminaron todos los parentesis, quiere decir que estan balanceados
        }
        public boolean isEmpty(){
            return this.root == null ? true: false;
        }
        public static void main(String[] args) {
            String word;
            char rta;
            Scanner consola = new Scanner(System.in);
            expresionMatematica e = new expresionMatematica();

            System.out.print("Ingrese la expresion matematica = ");
            word = consola.nextLine();
            e.push(word);
            if(e.parentesisBalanceados(word)){
                System.out.println("Los parentesis están balanceados.");
            }else{
                System.out.println("Revisar parentesis, no se encuentran balanceados.");
            }
            consola.close();
        }
}   
