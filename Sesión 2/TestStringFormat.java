import java.util.Scanner;

public class TestStringFormat {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe un nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Escribe un correo: ");
        String correo = entrada.nextLine();
        System.out.println("Escribe una edad: ");
        int edad = entrada.nextInt(); entrada.nextLine();

        System.out.println("\n\t Datos del usuario: ");
        String reporte = String.format("\n\t Nombre: %s, Correo: %s, Edad: %d",nombre,correo,edad);

        System.out.println(reporte);


        entrada.close();
    }

}
