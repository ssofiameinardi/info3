

import java.util.Scanner;

public class RecursividadSuma{
    public int suma(int numero){
        if(numero == 1){
            return 1;
        }else{
            return numero+suma(numero-1);
        }
    }
    
    public static void main(String[] args){
        int num;
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese numero = ");
        num = Integer.parseInt(consola.nextLine());
        RecursividadSuma r = new RecursividadSuma();
        System.out.println("La sucesión de numeros enteros positivos hasta "+num+" es = "+r.suma(num));
        consola.close();
    }
}