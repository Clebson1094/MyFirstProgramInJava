public class MeuPrimeiroPrograma {

    public static void main(String[] args) {

        String nome = "Jose";

        double altura = 1.75;

        int idade = 19;

        boolean maior = false;

        if (idade<= 13) {
            System.out.println("Criança");
        } else if (idade < 18) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Adulto");
        }

        for (int voltas = 0; voltas < 5; voltas++) {
            System.out.println(voltas);
        }

        int resultado = somar(5, 4);
        System.out.println(resultado);

        classificarIdade(resultado);
    }

    public static int somar(int a, int b) {
        return a + b;
    }


    public static void classificarIdade(int idade){
        if (idade <= 13) {
            System.out.println("Criança");
        } else if (idade < 18) {
            System.out.println("Adolescente");
        }  else {
            System.out.println("Adulto");
        }
    }
}
