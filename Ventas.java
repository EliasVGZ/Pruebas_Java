import java.util.Scanner;

public class Ventas {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero de ventas:");

        int numVentas=sc.nextInt();

        int sumaVentas=0;

        for (int i=0;i<numVentas;i++){

                System.out.println("Introduce el precio de la venta " +(i+1));
                int venta=sc.nextInt();

                sumaVentas=sumaVentas+venta;

        }
        System.out.println("Las suma de las ventas es: "+sumaVentas);


    }
}
