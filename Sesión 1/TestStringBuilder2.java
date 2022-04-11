import java.util.Scanner;

public class TestStringBuilder2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        StringBuilder reporte = new StringBuilder("Nombre: @nombre, Edad: @edad, Peso: @peso");

        int inombre = reporte.indexOf("@nombre");
        reporte.delete(inombre,inombre+"@nombre".length());

        System.out.println("Dame un nombre: ");
        String nombre = entrada.nextLine(); //Esto guarda una cadena
        reporte.insert(inombre,nombre);

        int iedad=reporte.indexOf("@edad");
        reporte.delete(iedad,iedad+"@edad".length());

        System.out.println("Dame una edad: ");
        int edad = entrada.nextInt(); entrada.nextLine(); //Cerramos la linea
        reporte.insert(iedad,edad);


        /*
        * Aquí va el código de el peso....
        * */

        System.out.println(reporte); //SALIDA FINAL
        entrada.close();

    }

}
