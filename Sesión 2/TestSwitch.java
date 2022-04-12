import java.util.Scanner;

public class TestSwitch {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\n\t Elige una opción:" +
                            "\n\t1) Opcion A"+
                            "\n\t2) Opcion B" +
                            "\n\t3) Opcion C" +
                            "\n\t4) Opcion D\n\t");

        int opcion = entrada.nextInt(); entrada.nextLine();

        switch (opcion){
            case 1:
                System.out.println("\n\tHola, soy la opcion A");
                break;
            case 2:
                System.out.println("\n\tHola, soy la opcion B");
                break;
            case 3:
                System.out.println("\n\tHola, soy la opcion C");
                break;
            case 4:
                System.out.println("\n\tHola, soy la opcion D");
                break;
            default: //Opcional
                System.out.println("\n\tOpción no valida");
                break; //El ultimo break es opcion
        }

        entrada.close();
    }

}

/*
*  Hacer una TestDado
*   Genera numeros aleatorios entre 1 y 6
*   y de acuerdo a ellos nos imprime el resultado en pantalla
*   pero en su version texto (enum) usando la estructura switch.
* */