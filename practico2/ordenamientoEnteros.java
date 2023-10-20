package practico2;

import java.util.Scanner;
import java.util.Random;

public class ordenamientoEnteros {
    public static void cargarArregloAleatorio(int []a){
        Random random = new Random();
        for(int i = 0; i < a.length; i++){
            a[i] = random.nextInt(150);        
        }
    }
    public static void mostrarArreglo(int []a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+"\n");
        }
    }
    public static int[] insercion(int[] a) {
        int temp;
        for (int i = 1; i < a.length; i++) {
           for (int j = i; j > 0 && a[j - 1] > a[j]; j--) {
                temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
            }
        }
        return a;
    }

    public static int[] shell(int[] a, int n) {
        int gap, temp;
        for (gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                for (int j = i - gap; j >= 0 && a[j] > a[j + gap]; j -= gap) {
                    temp = a[j];
                    a[j] = a[j + gap];
                    a[j + gap] = temp;
                }
            }
        }
        return a;
    }

    public static int[] quick(int[] a, int izq, int der) {
        int temp, i, j;
        i = izq;
        j = der;
        do {
            while (a[j] > a[i] && j > i) j--;
            if (i < j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
            while (a[i] < a[j] && i < j) i++;
            if (i < j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j--;
            }
        } while (i < j);
        if (izq < j) quick(a, izq, j - 1);
        if (i < der) quick(a, i + 1, der);
        return a;
    }
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int tamanio, op;
        char rta;
        System.out.print("Ingrese tamanio del arreglo = ");
        tamanio = Integer.parseInt(consola.nextLine());
        int []a = new int[tamanio];
        
        do{
            System.out.println("1. Cargar arreglo aleatoriamente\n2. Mostrar arreglo");
            System.out.println("3. Ordenamiento por insercion\n4. Ordenamiento ShellSort\n5. Ordenamiento QuickSort\n");
            System.out.print("Ingrese opcion = ");
            op = Integer.parseInt(consola.nextLine());
            switch(op){
                case 1:
                    cargarArregloAleatorio(a);
                    break;
                case 2:
                    mostrarArreglo(a);
                    break;
                case 3:
                    a = insercion(a);
                    System.out.println("Arreglo ordenado = \n");
                    mostrarArreglo(a);
                    break;
                case 4:
                    a = shell(a, a.length);
                    System.out.println("Arreglo ordenado:");
                    mostrarArreglo(a);
                    break;
                case 5:
                    a = quick(a,0, a.length);
                    System.out.println("Arreglo ordenado:");
                    mostrarArreglo(a);
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
                    break;
            }
            System.out.println("Desea realizar otra operacion? s/n\n");
            System.out.print("Ingrese opcion = ");
            rta = consola.nextLine().charAt(0);
            consola.close();
        }while(rta == 's' || rta == 'S');    
    }
}
