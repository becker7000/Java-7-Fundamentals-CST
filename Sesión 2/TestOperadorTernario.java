public class TestOperadorTernario {

    public static void main(String[] args) {

        int moneda;
        //Casting de double a int:
        // 1.12 -> 1    0.32 -> 0
        moneda=(int)(Math.random()*2);
        //Duelve valores: 0 o 1

        MonedaTexto monText = MonedaTexto.AGUILA;

        /*
        * Se le asigna un valor a la variable monText (MondaTexto)
        * tal asignacion se hace a través de el operador ternario
        * que depende de una condición (moneda==0) si esta condicion
        * es verdadera entonces se asigna el primera valor (MonedaTexto.SOL)
        * en caso contrario se asigna el segundo valor (MonedaTexto.AGUILA).
        * */

        monText = (moneda==0)? (MonedaTexto.SOL): MonedaTexto.AGUILA;

        System.out.println("\n\t El resultado de lanzar la moneda es: "+monText);

    }

}
