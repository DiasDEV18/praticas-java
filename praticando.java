import java.util.Scanner; 

public class praticando {

    public static void main(String[] args) {
        try (Scanner scr = new Scanner(System.in)) {
            System.out.println("Qual seu nome? ");
            String nome = scr.nextLine();
            
            System.out.println("Bem-vindo: " + nome);

            System.out.println("Digite sua primeira nota: ");
            double nota1 = scr.nextDouble();

            System.out.println("Digite sua segunda nota: ");
            double nota2 = scr.nextDouble();

            System.out.println("Digite sua terceira nota: ");
            double nota3 = scr.nextDouble();

            double media = (nota1+nota2+nota3) /3;
            int mediaInteira = (int) Math.round(media);

            System.out.println("Sua media = " + mediaInteira);

            if (media>=7) {
                System.out.println("Você está APROVADO! ");
            }
            else if (media>5) {
                System.out.println("Você está em RECUPERAÇÂO! ");
            }
            else {
                System.out.println("Você está REPROVADO! ");
            }

        


        }


    }

    }


