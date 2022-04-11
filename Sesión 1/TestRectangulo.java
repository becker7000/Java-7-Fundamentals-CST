public class TestRectangulo {

    public static void main(String[] args) {

        //Declaracion de una variable tipo objeto
        //Intanciando la clase Rectangulo
        Rectangulo r1 = new Rectangulo();

        r1.base=30;
        r1.altura=10;

        r1.visualizar();
        r1.calcularArea();
        r1.calcularPerimetro();

        r1.base=5;
        r1.altura=12;
        r1.visualizar();
        r1.calcularArea();
        r1.calcularPerimetro();

        Rectangulo r2=new Rectangulo();
        r2.base=2;
        r2.altura=8;
        r2.visualizar();
        r2.calcularArea();
        r2.calcularPerimetro();

    }

}
