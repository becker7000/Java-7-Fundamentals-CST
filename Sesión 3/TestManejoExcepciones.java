import java.util.Scanner;

public class TestManejoExcepciones {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try{
            String sSueldo = "30000x";
            double dSueldo = Double.parseDouble(sSueldo);
            System.out.printf("\n\t Sueldo transformado: %.2f",dSueldo);
        }catch (NumberFormatException ex){
            System.out.println("\n\t Error al transformar en el manejo de los datos. "+ex.getMessage());
        }finally {
            System.out.println("Por favor, de un nuevo sueldo: ");
            double dSueldo=entrada.nextDouble(); entrada.nextLine();
            System.out.println("\n\tAhora el sueldo es: "+dSueldo);
        }

        entrada.close();
    }

}

/*
*  Agregar el manejo de excepciones
*  al programa de descuentos.
* */