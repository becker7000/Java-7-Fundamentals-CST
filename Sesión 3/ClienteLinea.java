public class ClienteLinea extends Cliente {

    private String correo;

    public ClienteLinea(String id, String nombre, String correo) {
        super(id, nombre);
        this.correo = correo;
    }

    public void mostrar(){
        super.mostrar();
        System.out.print("\n\t Correo: "+this.correo);
    }

}

/*
*  Reto: Generar otra clase que herede de Cliente
*   llamada ClienteTienda.
* */