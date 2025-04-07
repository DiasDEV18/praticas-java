import java.util.Scanner;
import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try (Scanner scr = new Scanner(System.in)) {
            Random num = new Random();
            
            System.out.println("Escolha uma opção:");
            System.out.println("1- Dizer Olá");
            System.out.println("2- Mostrar a data de hoje");
            System.out.println("3- Mostrar número aleatório de 1 a 100");
            System.out.println("4- Sair");
            
            int opcao = scr.nextInt();
            
            switch (opcao) {
                case 1 -> System.out.println("Olá, tudo bem?");
                case 2 -> {
                    LocalDate data = LocalDate.now();
                    System.out.println("A data de hoje é: " + data);
                }
                case 3 -> {
                    int aleatorio = num.nextInt(100) + 1;
                    System.out.println("Número aleatório: " + aleatorio);
                }
                case 4 -> System.out.println("Saindo do programa");
                default -> System.out.println("Opção inválida");
            }
        }
        
    }
}



