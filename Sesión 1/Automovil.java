public class Automovil {

    /*
    * Estilos de nombramiento:
    *   PascalCase -> AutomovilElectrico
    *   snake_case -> automovil_electrico
    *   camelCase -> automovilElectrico
    * */

    /*
    * Estos son los atributo de la clase Automovil.
    * */
    String marca; // String siempre va con mayuscula inicial.
    String modelo;
    int potencia; // int siempre con minuscula inicial.

    void mostrar(){
        System.out.printf("\n\t Marca: %s",marca);
        System.out.printf("\n\t Modelo: %s",modelo);
        System.out.printf("\n\t Potencia: %d",potencia);
    }
}
