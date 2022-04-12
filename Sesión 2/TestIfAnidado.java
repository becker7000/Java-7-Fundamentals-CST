import java.util.Scanner;

public class TestIfAnidado {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String letra;
        System.out.println("Escribe la letra a/A: ");
        letra = entrada.nextLine();

        if( letra.equals("A") || letra.equals("a") ){

            if ( letra.equals("A") )
                System.out.println("La letra es A mayuscula.");
            else
                System.out.print("La letra es a minuscula.");

        }else
            System.out.println("La letra o simbolo no es a/A.");

        entrada.close();
    }

}


/*
*  Hacer un TestMultiplo3
*
*   Dame un numero: 9
*       9 es multiplo de 3
*
*   Dame un numero: 10
*       10 no es multiplo de 3
*
*   Pista: usar %
*
* */