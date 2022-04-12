import java.util.Scanner;

public class TestFactorial {

    public static void main(String[] args) {

        // 4! = 4*3*2*1=24
        Scanner entrada = new Scanner(System.in);

        int n;
        do{ //Usando la estructura de repetición do-while como un filtro.
            System.out.println("\n\t Dame un numero entero en rango: [0,16]: ");
            n = entrada.nextInt(); entrada.nextLine();
        }while(n<0 || n>16);

        int factorial=1;
        //Las multiplicaciones inician en 1.

        for(int i=n;i>=1;i--)
            factorial*=i;

        System.out.printf("\n\t %d ! = %d",n,factorial);
        entrada.close();
    }

}


/*
* Usar el ciclo do-while para filtrar una entrada de numeros enteros
* la cual solo acepte numeros entre los rangos [5,10) U (15,20].
* */

// ( n<5 || (n >=10 && n<=15) || n>20 )