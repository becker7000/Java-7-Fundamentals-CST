public class TestDado {

    public static void main(String[] args) {

        //Se generan números del 1 al 6, aleatorios.
        int dado = (int) (Math.random() * 6 + 1);

        switch (dado) {
            case 1:
                System.out.println("DADO = "+DadoTexto.UNO);
                break;
            case 2:
                System.out.println("DADO = "+DadoTexto.DOS);
                break;
            case 3:
                System.out.println("DADO = "+DadoTexto.TRES);
                break;
            case 4:
                System.out.println("DADO = "+DadoTexto.CUATRO);
                break;
            case 5:
                System.out.println("DADO = "+DadoTexto.CINCO);
                break;
            case 6:
                System.out.println("DADO = "+DadoTexto.SEIS);
                break;
        }
    }
}
