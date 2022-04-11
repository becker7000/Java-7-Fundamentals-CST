public class Television {

    //Atributos;
    int pulgadas;
    String marca;
    boolean hd;
    double costo;

    //Métodos;
    void mostrarInformacion(){

        System.out.printf("\n\t Marca: %s",marca);
        System.out.printf("\n\t Pulgadas: %d",pulgadas);
        System.out.printf("\n\t Es HD?: %B",hd);
        System.out.printf("\n\t Costo: %.2f",costo);

    }

}
