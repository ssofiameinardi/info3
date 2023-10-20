package practico3;

import java.util.Stack;
import java.util.Scanner;
public class palindromos {
    public static boolean esPalindromo(String cadena){
        cadena = cadena.replaceAll("\\s", "").toLowerCase();
        
        int longitud = cadena.length();
        int mitad = longitud/2;

        Stack <Character> pila = new Stack<>();
        for(int i = 0; i < mitad; i++){
            pila.push(cadena.charAt(i));
        }
        for(int i = mitad; i < longitud; i++){
            char caracter = cadena.charAt(i);
            char caracterEnPila = pila.pop();
            
            if(caracter != caracterEnPila){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String cadena1;
        char rta;
        do{
            System.out.print("Ingrese la oración = ");
            cadena1 = consola.nextLine();
            if(esPalindromo(cadena1)){
                System.out.println(cadena1+" es palindromo.");
            }else{
                System.out.println(cadena1+" no es palindromo.");
            }
            System.out.println("Desea continuar? S/N");
            System.out.print("Ingrese opcion = ");
            rta = consola.nextLine().charAt(0);
        }while(rta=='s'||rta=='S');    
        consola.close();
    }
}
