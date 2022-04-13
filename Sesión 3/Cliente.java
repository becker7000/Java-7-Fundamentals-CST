public class Cliente {

    //Atributos encapsulados
    private String id;
    private String nombre;

    //Constructor de la clase Cliente:
    public Cliente(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrar(){
        System.out.print("\n\t +-----Cliente---------+");
        System.out.printf("\n\t | Nombre: %s",this.nombre);
        System.out.print("\n\t +---------------------+\n");
    }
}
