public class TestResiduo {

    public static void main(String[] args){

        int segundos;
        segundos=410;
        // 360 (6 minutos) + 50 segundos

        int minutos;
        minutos=segundos/60;

        int seg;
        seg=segundos%60;

        System.out.printf("\n\t %d segundos equivalen a" +
                " %d minuto(s) con %d segundo(s)",segundos,minutos,seg);
    }

}
