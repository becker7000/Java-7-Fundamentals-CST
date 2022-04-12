public class TestTablasMulti {

    public static void main(String[] args) {

        int i=1;

        while(i<=10){
            System.out.println();
            int j=1;
            while(j<=10){ //While anidado
                System.out.printf("\n\t %d * %d = %d",i,j,i*j);
                j++;
            }
            i++;
        }

        //Ciclar es cuando mi ciclo while se vuelve infinito.
    }

}
/*
* El Scope es el alcance de las variables,
* Scope quiere decir donde es reconocida una variable.
*
* Existen dos tipos básicos de scope:
* 1) Global (a nivel archivo)
* 2) Local (Dentro de un bloque de codigo)
*
* */