import java.util.Scanner;

public class RecursividadConteo {
    public String conteo(int numero){
        if(numero == 1){
            return "1";
        }else{
            return numero+","+conteo(numero-1);
        }
    }
    public static void main(String[] args) {
        int num;
        Scanner consola = new Scanner(System.in); 
        System.out.print("Ingrese un número = ");
        num = Integer.parseInt(consola.nextLine());
        RecursividadConteo r = new RecursividadConteo();
        System.out.println("El conteo regresivo desde "+num+" es "+r.conteo(num));   
        consola.close();
    }
}
