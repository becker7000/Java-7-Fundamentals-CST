public class TestArreglos {

    public static void main(String[] args) {

        //tipo nombre[] = new tipo[tamaño]
        int num[] = new int[10];

        // num[0], num[1], num[2],...
        for(int i=0;i<num.length;i++)
            num[i]=(int)(Math.random()*50+1);
           //Esto genera numeros aleatorios entre 1 y 50.

        System.out.println("\n\t Arreglo desordenado: ");
        for(int x : num)
            System.out.print(" "+x);

        int suma = 0;
        for(int i=0; i< num.length; i++)
            suma+=num[i]; //suma=suma+num[i]
        System.out.println("\n\tLa suma de los valores es: "+suma);

        double promedio =  (double)suma/(double)num.length;
        System.out.println("\n\t El promedio de los valores es: "+promedio);

        //Algorítmo de ordenamiento por método de la burbuja... (directo)
        for(int i=0; i< num.length;i++){
            for(int j=0;j< num.length;j++){
                if(num[i]<num[j]){ // 5 , 2 , 3 , 1
                    int aux=num[i]; //La variable aux nos ayuda a salvar
                    num[i]=num[j];  // el valor de num[i]
                    num[j]=aux;
                }
            }
        }

        System.out.println("\n\t Arreglo ordenado: ");
        for(int x : num)
            System.out.print(" "+x);

        System.out.println("\n\t El elemento mas pequeño es: "+num[0]);
        System.out.println("\n\t El elemento mas grande es: "+num[num.length-1]);

    }

}

/*
* Tipos básicos de errores:
* 1) Errores de compilación (Practicando mucho)
* 2) Error en tiempo de ejecución (Usando el control de excepciones
* 3) Errores lógicos (Haciendo muchas pruebas)
*
* */

/*
*  Ordenamiento por el metodo de la burbuja:
*   5 , 2 , 3 , 1
*
*   2 , 5 , 3 , 1
*   2 , 3 , 5 , 1
*   2 , 3 , 1 , 5
*
*   2 , 3 , 1 , 5
*   2 , 1 , 3 , 5
*
*   1 , 2 , 3 , 5
*
*
*
* */

/*
* Reto: agregarle el calculo de la mediana y la moda.
* */