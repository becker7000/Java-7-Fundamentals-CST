public class Usuario {

    //Atributos:
    int id;
    String nombre;
    String correo;

    void describir(){
        String datos = String.format("\n\t +-----------------+" +
                                            "\n\t | Id: %d" +
                                            "\n\t | Nombre: %s " +
                                            "\n\t | Email: %s" +
                                            "\n\t +-----------------+ \n",id,nombre,correo);
        System.out.printf("%s",datos);
    }
}


/*
*   Ejercicio: hacer una clase llamada Producto
*   los atributos son bajo su critero (Nombre, Costo,Id)
*
*   Despues generar una Test que contenga una lista de productos
*       y con esa lista se pueda hacer lo siguiente:
*       1) Agreagar 2)Leer 3)Actualizar 4)Eliminar
*
* */