import java.util.Scanner;

public class TestIf {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe tu edad: ");
        int edad = entrada.nextInt(); entrada.nextLine();

        if(edad>18){//Cuando tenemos dos opciones sencillas podemos usar if-else
            System.out.println("Puedes volver a votar...");
            System.out.println();
        }else if(edad<18)
            System.out.println("Aún no puedes votar...");
        else
            System.out.println("Puedes votar por primera vez...");

        entrada.close();

    }

}


/*
*   Operadores relacionales:
*
*   == comparacion
*   != diferente de
*    > mayor que
*    < menor que
*   <= menor o igual
*   >= mayor o igual
*
* */