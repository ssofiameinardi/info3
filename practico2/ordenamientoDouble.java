package practico2;

import java.util.Random;
import java.util.Scanner;

public class ordenamientoDouble {
     public static void cargarArregloAleatorio(double []a){
        Random random = new Random();
        for(int i = 0; i < a.length; i++){
            a[i] = random.nextDouble(150);        
        }
    }
    public static void mostrarArreglo(double []a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+"\n");
        }
    }
    public static double[] insercion(double[] a) {
        double temp;
        for (int i = 1; i < a.length; i++) {
           for (int j = i; j > 0 && a[j - 1] > a[j]; j--) {
                temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
            }
        }
        return a;
    }

    public static double[] shell(double[] a, int n) {
        int gap;
        double temp;
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

    public static double[] quick(double[] a, int izq, int der) {
        int i, j;
        double temp;
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
        double []a = new double[tamanio];
        
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
