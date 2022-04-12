public class TestOperadoresLogicos {

    public static void main(String[] args) {

        int numero = 15;

        if((numero>=10) && (numero<=20))
            System.out.printf("\n\t El numero %d está en el rango.",numero);
        else
            System.out.printf("\n\t El número %d está fuera del rango",numero);

    }

}

/*
*  Hacer un TestAnd
*   Dame un numero: 10
*      El numero es par y ademas es multiplo de 5
*   Dame un numero: 11
*      El numero es impar
*   Nota: usar &&
* */