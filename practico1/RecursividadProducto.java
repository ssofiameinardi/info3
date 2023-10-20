import java.util.Scanner;

public class RecursividadProducto {
    public int producto(int num1, int num2){
        if(num1 == 0 || num2 == 0){
            return 0;
        }else{
            return num1+producto(num1, num2-1);
        }

    }
    public static void main(String[] args) {
        int n1, n2;
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese numero 1 = ");
        n1 = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese numero 2 = ");
        n2 = Integer.parseInt(consola.nextLine());
        RecursividadProducto r = new RecursividadProducto();
        System.out.println(n1+"*"+n2+" = "+r.producto(n1,n2));
        consola.close();
    }    
}
