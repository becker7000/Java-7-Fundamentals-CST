import java.util.Scanner;

public class TestMultiplo3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe un numero entero: ");
        int entero = entrada.nextInt(); entrada.nextLine();

        if(entero%3==0) {
            System.out.printf("El número %d es multiplo de 3",entero);
            if(entero%6==0)
                System.out.printf(" y también %d es multiplo de 6.",entero);
        }else
            System.out.printf("El número %d no es multiplo de 3.",entero);


        entrada.close();
    }

}
