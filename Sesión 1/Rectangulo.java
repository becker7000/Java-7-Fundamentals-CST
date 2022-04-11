public class Rectangulo {

    //Variables:
    double base;
    double altura;
    double area;
    double perimetro;

    void visualizar(){
        System.out.printf("\n\t+-----------+");
        System.out.printf("\n\t Base: %.2f",base);
        System.out.printf("\n\t Altura: %.2f",altura);
    }

    void calcularArea(){
        area=base*altura;
        System.out.printf("\n\t Area: %.2f",area);
    }

    void calcularPerimetro(){
        perimetro=2*altura+2*base;
        System.out.printf("\n\t Perimetro: %.2f",perimetro);
        System.out.printf("\n\t+-----------+");
    }

    //Reto: Calcular el perimetro.

}
/*
* Java tiene la capacidad de distingir entre mayusculas y minusculas
* esa capacidad se conoce como Case Sensitive.
* */

// x=5+2*3;
// a) 30  b) 11
//Java hace uso de la jerarquia de operaciones de la aritmetica.