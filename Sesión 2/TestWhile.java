public class TestWhile {

    public static void main(String[] args) {

        // Imprimir los numeros del 1 al 10.
        // i se conoce como variable de control <- iterador

        int i=1; //Valor inicial es 1
        int suma=0; // Nota: comúnmente las sumas inician en cero.

        while(i<=10){
            if(i%2==0){
                System.out.printf("\n\t i =%d",i);
                suma+=i;
            }
            i++;
        }
        System.out.printf("\n\t Suma = %d",suma);

        /*
        * Tomamos en cuenta 3 cosas:
        * 1) La variable de control
        * 2) El incremento de esa variable de control
        * 3) La condición que rompe con el ciclo.
        * */

    }

}
