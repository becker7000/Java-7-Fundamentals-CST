import java.util.Scanner;

public class TestMatrices2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("\n\t Matriz: ");
        for(int i=0;i< matrix.length;i++){
            System.out.println();
            for (int j=0;j< matrix.length;j++){
                matrix[i][j]=(int)(Math.random()*50+1);
                System.out.print("\t "+matrix[i][j]);
            }
        }

        System.out.println("\n\tEscribe un numero entero: ");
        int num = entrada.nextInt(); entrada.nextLine();

        System.out.printf("\n\t Matriz multiplicada por %d: ",num);
        for(int i=0;i< matrix.length;i++){
            System.out.println();
            for (int j=0;j< matrix.length;j++){
                matrix[i][j]*=num;
                System.out.print("\t "+matrix[i][j]);
            }
        }
    }
}

/*
* Reto: Hacer un programa que multiplique una matriz por otra matriz.
* */