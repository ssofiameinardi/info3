import java.util.Scanner;

public class RecursividadBinario {
    public int binario(int numero){
        if(numero == 0){
            return 0;
        }
        if(numero % 2 == 1){
            return binario(numero/2)+1;
        }else{
            return binario(numero/2);
        }
    }
    public int conversionABinario(int numero){
        if(numero > 1){
            return conversionABinario(numero/2)*10 + numero%2;
        }else{
            return numero%2;
        }
    }
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un numero = ");
        num = Integer.parseInt(consola.nextLine());
        RecursividadBinario r = new RecursividadBinario();
        System.out.println("Hay "+r.binario(num)+" en el numero "+num);
        System.out.println("El numero "+num+" en binario es el "+r.conversionABinario(num));
        consola.close();
    }
}
