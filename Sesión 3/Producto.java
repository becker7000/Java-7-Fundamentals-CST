public class Producto implements IPrecio {

    private String codigo;
    private String nombre;
    private double precio;

    public Producto(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = 20.0;
    }

    public double getPrecio(){
        return this.precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
