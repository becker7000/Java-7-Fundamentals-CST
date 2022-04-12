public class TestStringBuilder {

    public static void main(String[] args) {

        String tel="5512345678";
        StringBuilder texto = new StringBuilder();

        float peso = 55.4f;

        texto.append("Peso: ");
        texto.append(peso);

        texto.append(" Otra vez el peso: ");
        texto.append(peso);

        int posicion = texto.indexOf(" Otra vez el peso: ");
        System.out.printf("\n\t El indice es: %d\n\t",posicion);

        texto.insert(posicion," (modificado)");

        System.out.println(texto);


    }

}
