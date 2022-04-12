import java.util.ArrayList;
import java.util.Scanner;

public class TestUsuarios {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();

        int opcion=0; //Implementar un filtro
        int idGlobal=1;

        //opcion puede funcionar como una centinela.
        while(opcion!=5){

            System.out.print("\n\t Selecciona una opción: ");
            System.out.print("\n\t 1) Agregar usuario");
            System.out.print("\n\t 2) Ver usuarios");
            System.out.print("\n\t 3) Modificar usuario"); //Agregar centinela para cuando no existe el usuario
            System.out.print("\n\t 4) Eliminar usuario"); //También se puede usar una centinela
            System.out.print("\n\t 5) Salir");
            System.out.print("\n\t Opción: ");

            opcion= entrada.nextInt(); entrada.nextLine(); //Se puede filtrar

            switch (opcion){
                case 1:
                    Usuario user = new Usuario();
                    user.id=idGlobal++;

                    System.out.println("Dame el nombre del usuario: ");
                    user.nombre= entrada.nextLine();
                    System.out.println("Dame el correo del usuario: ");
                    user.correo= entrada.nextLine();

                    usuarios.add(user);
                    System.out.println("Usuario agregado: ");
                    user.describir();
                    break;
                case 2:
                    if(usuarios.isEmpty()){
                        System.out.println("La lista de usuarios está vacía.");
                    }else{
                        System.out.println("Lista de usuarios: ");
                        for(Usuario user_: usuarios )
                            user_.describir();
                    }
                    break;
                case 3:
                    System.out.println("Dame el ID del usuario a modificar: ");
                    int id = entrada.nextInt(); entrada.nextLine();
                    //Busqueda secuencial:
                    for (Usuario user_: usuarios ){
                        if(user_.id==id){
                            System.out.println("Usuario encontrado: ");
                            user_.describir();
                            System.out.println("Dame el nuevo nombre: ");
                            user_.nombre= entrada.nextLine();
                            System.out.println("Dame el nuevo correo: ");
                            user_.correo= entrada.nextLine();
                            System.out.println("Usuario modificado: ");
                            user_.describir();
                            break; //Rompemos el for inmedianto
                        }
                    }
                    break; // Rompemos el switch
                case 4:
                    System.out.println("Dame el ID del usuario a eliminar: ");
                    int id_ = entrada.nextInt(); entrada.nextLine();
                    //Busqueda secuencial para eliminar:
                    for (Usuario user_: usuarios ){
                        if(user_.id==id_){
                            System.out.println("Usuario encontrado: ");
                            user_.describir();
                            usuarios.remove(user_);
                            System.out.println("Usuario eliminado!");
                            break; //Rompemos el for inmedianto
                        }
                    }
                    break;
                case 5:
                    System.out.println("Fin del programa...");
                    break;
                default:
                    System.out.println("Opción no valida!");
                    break;
            }

            System.out.println("Pulsa [ENTER] para continuar...");
            entrada.nextLine();
        }

        entrada.close();
    }

}

/*
*  API: Aplication programming interface
*  CRUD : CREATE-READ-UPDATE-DELETE
* */