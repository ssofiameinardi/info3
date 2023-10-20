package practico5;

import java.util.Scanner;
import java.util.Random;
public class main {

    public static int depth(binaryNode<Integer> root){
        //debe determinar la cantidad de niveles que tiene el arbol
        if(root == null){
            return 0;
        }else{
            int leftDepth = depth(root.getLeft());
            int rightDepth = depth(root.getRight());
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }
    public static void dtree(Integer rootIt, int nodoABorrar){
        //Debe localizar el nodo a borrar, eliminarlo y luego imprimir inOrder. Si no lo encuentra, imprimir error.
        //TODO
    }
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        char op, rta;
        int numero;
        Random random = new Random();
        binaryTree<Integer> bt = new binaryTree<Integer>();
        binaryNode<Integer> root = new binaryNode<Integer>();

        do{
            System.out.println("a. Generar arbol de numeros entre 0-25.\nb. mostrar inOrder.\nc. Duplicados?");
            System.out.println("d. Niveles del arbol.\ne. borrar nodo.");
            System.out.print("Ingrese opcion = ");
            op = consola.nextLine().charAt(0);
            switch(op){
                case 'a':
                case 'A':
                    for(int i = 0; i < 10; i++){
                        numero = random.nextInt(26);
                        binaryTree<Integer> newBt = new binaryTree<>(numero);
                        bt.merge(numero, bt, newBt);
                    }
                    break;
                case 'b':
                case 'B':
                    System.out.println("\nRecorrido en orden del arbol: ");
                    bt.printInOrder();
                    break;
                case 'c':
                case 'C':
                    break;
                case 'd':
                case 'D':
                    System.out.println("El arbol tiene "+depth(root)+" niveles.");
                    break;
                case 'e':
                case 'E':
                    int elem;
                    System.out.print("Ingrese el elemento a borrar = ");
                    elem = Integer.parseInt(consola.nextLine());
                    dtree(null, elem); //CORREGIR
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
                    break;
            }
            System.out.println("Desea realizar otra cosa? S/N");
            System.out.print("Ingrese opcion = ");
            rta = consola.nextLine().charAt(0);
        }while(rta == 's' || rta == 'S');
        consola.close();
    }
}
