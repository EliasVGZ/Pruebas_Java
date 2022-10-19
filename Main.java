import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Programador programador1 = new Programador();
        Comercial comercial1 = new Comercial();


        /* Input */
        System.out.println("Escriba el nombre del programador :");
        String lineaNombre = sc.nextLine(); // TODO: revisar lectura de ints como chars
        programador1.nombre = lineaNombre;

        System.out.println("¿En qué lenguaje programa? :");
        programador1.lenguaje = sc.nextLine();


        System.out.println("Escriba el nombre del comercial");
        comercial1.nombre = sc.nextLine();
        System.out.println("Escriba el apellido");
        comercial1.apellido = sc.nextLine();


        /* Output */
        System.out.println(programador1);
        System.out.println(comercial1);



    }


}