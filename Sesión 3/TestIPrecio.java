import java.util.ArrayList;

public class TestIPrecio {

    public static void main(String[] args) {

        Libro l1 = new Libro("li001","El llano en llamas","Juan Rulfo");
        Libro l2 = new Libro("li002","Alicia en el pais de las maravillas","Lewis Carroll");
        Producto p1 = new Producto("pro001","Red Bull");
        Producto p2 = new Producto("pro002","Barra de avena");

        ArrayList<IPrecio> precios = new ArrayList<>();

        // Interfaces objeto: son objetos que están restringidas o limitas a los métodos de la interfas.

        IPrecio precio1=l1;
        IPrecio precio2=l2;
        IPrecio precio3=p1;
        IPrecio precio4=p2;

        precios.add(precio1);
        precios.add(precio2);
        precios.add(precio3);
        precios.add(precio4);

        double total=0;
        for(IPrecio p : precios)
            total+=p.getPrecio();

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("El total a pagar es: "+total);
    }

}

/*
* Reto: crear una clase llamada Ticket que contenga un metodo generarTicket
* */