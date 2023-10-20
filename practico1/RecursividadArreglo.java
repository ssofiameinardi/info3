
import java.util.Scanner;
import java.util.Random;

public class RecursividadArreglo{
    public void arreglo(int []a, int n){
        if(n >= 0){
            System.out.println(a[n]);
            arreglo(a, n-1);
        }
    }
    public static void main(String[] args) {
        int tamanio;
        Random random  = new Random();
        Scanner consola  = new Scanner(System.in);
        System.out.print("Ingrese tamanio del arreglo = ");
        tamanio = Integer.parseInt(consola.nextLine());
        int []a = new int[tamanio];
        for(int i = 0; i < tamanio; i++){
            a[i] = random.nextInt(150);        
        }
        System.out.println("Arreglo en forma ordenada : ");
        for(int i = 0; i < tamanio; i++){
            System.out.println(a[i]);
        }
        System.out.println("Arreglo en forma ordenada descendentemente : ");
        RecursividadArreglo r = new RecursividadArreglo();
        r.arreglo(a, tamanio-1);
        consola.close();
    }

}