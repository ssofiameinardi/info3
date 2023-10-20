
import java.util.Scanner;

public class RecursividadFactorial{
    public int factorial(int numero){
        if(numero == 1){
            return 1;
        }else{
            return numero*factorial(numero-1);
        }
    }

    public static void main(String[] args){
        int num;
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese numero = ");
        num = Integer.parseInt(consola.nextLine());
        RecursividadFactorial r = new RecursividadFactorial();
        System.out.println("El factorial de "+num+" es = "+r.factorial(num));
        consola.close();
    }
}