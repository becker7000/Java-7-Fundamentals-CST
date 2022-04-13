import java.util.Scanner;

public class TestMatrices {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame el rango de la matriz: ");
        int N= entrada.nextInt(); entrada.nextLine();
        int[][] matrixA= new int[N][N];
        int[][] matrixB= new int[N][N];

        System.out.println("\n\tMatriz A: ");
        for(int i=0;i < matrixA.length;i++){
            System.out.println();
            for(int j=0; j < matrixA.length;j++){
                matrixA[i][j]=(int)(Math.random()*30+20);
                //Generamos numeros aleatorios entre 20 y 20+30=50
                System.out.print("\t "+matrixA[i][j]);
            }
        }

        System.out.println("\n\tMatriz B: ");
        for(int i=0;i < matrixB.length;i++){
            System.out.println();
            for(int j=0; j < matrixB.length;j++){
                matrixB[i][j]=(int)(Math.random()*30+20);
                //Generamos numeros aleatorios entre 20 y 20+30=50
                System.out.print("\t "+matrixB[i][j]);
            }
        }

        int[][] sumaAB= new int[N][N];
        System.out.println("\n\tLa suma de las matrices A + B es: ");
        for(int i=0;i < sumaAB.length;i++){
            System.out.println();
            for(int j=0; j < sumaAB.length;j++){
                sumaAB[i][j]=matrixA[i][j]+matrixB[i][j];
                System.out.print("\t "+sumaAB[i][j]);
            }
        }


        entrada.close();
    }

}


/*
*  23(0,0)   12(0,1)   11(0,2)
*  5(1,0)    34(1,1)    3(1,2)
*  0(2,0)    123(2,1)  99(2,2)
* */

/*
* Ejercicio generar una matriz de 3x3 de numeros aleatorios
* luego pedir un numero y multiplicarlo por cada elemento de la matriz.
* Imprimir la matriz de nuevo ya multiplicada.
* */