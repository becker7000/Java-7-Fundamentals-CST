public class TestCliente {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("1","Carlos");
        c1.mostrar();

        c1.setNombre("Pepe"); //Sobreescriben
        c1.mostrar();

        //Getters son de sólo lectura:
        System.out.println("\n\t Id del cliente: "+c1.getId());

        ClienteLinea cl1 = new ClienteLinea("2","Toño","tono@gmail.com");
        cl1.mostrar();

    }
}


/*
*  Una puerta, un regalo y una ventana...
*   Los 3 pueden abrirse pero no de la misma forma.
*   Polimorfico
* */