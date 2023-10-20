
import java.util.Scanner;

public class RecursividadPotencia{

    public int potencia (int base, int exp){
        if(exp == 0 ){
            return 1;
        }else{
            return base*(potencia(base, exp-1));
        }
    }

    public static void main(String[] args){
        Scanner consola = new Scanner(System.in);
        int b, e;
        System.out.print("Ingrese base = ");
        b = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese exponente = ");
        e = Integer.parseInt(consola.nextLine());
        RecursividadPotencia r = new RecursividadPotencia();
        System.out.println(b+"^"+e+" = "+r.potencia(b,e));    
        consola.close();
    }
}