import java.util.Scanner;

public class exercicio7{

    public static void main(String[]args){
       
        int[] numerosInteiros = new int[5];
        int soma = 0;
        int mult = 1;

        System.out.println(" Digite cinco números inteiros:");
        for (int i=0; i < numerosInteiros.length; i++){
            Scanner scanner = new Scanner(System.in);
            numerosInteiros[i] = scanner.nextInt();
        }
        // soma e mult
        for (int i=0; i< numerosInteiros.length; i++){
            soma = soma + numerosInteiros[i];
            mult = soma * numerosInteiros[i];
        }
        // dai pra baixo é apenas print das variaveis.
        System.out.println(" Numeros digitados: ");
        for (int i=0; i < numerosInteiros.length; i++){
            System.out.println(numerosInteiros[i]);
        }

        System.out.println("Multiplicação dos números:");
        for (int i=0; i< numerosInteiros.length; i++){
            System.out.println(mult);
        }

        System.out.println("Soma dos números:");
        for (int i=0; i< numerosInteiros.length; i++){
            System.out.println(soma);
        }
    }
}