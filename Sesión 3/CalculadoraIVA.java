import java.util.Scanner;

public class CalculadoraIVA {

    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);

        System.out.println("Escribe un monto sin I.V.A. ");
        var montoSinIva= entrada.nextInt(); entrada.nextLine();
        var montoConIva = montoSinIva*0.16+montoSinIva;

        System.out.println("El monto con I.V.A. es: "+montoConIva);

        entrada.close();
    }

}


/*
* Hacer una calculadora que pida un monto y un porcentaje;
* Dame un monto: 200
* Dame un porcentaje: 15
* El monto con descuento es: 170
* */