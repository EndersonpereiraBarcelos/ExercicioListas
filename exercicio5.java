import java.util.Scanner;

public class exercicio5 {

    public static void main(String[]args){

        int i = 0;
        Scanner sc = new Scanner (System.in);
        int [] vlido = new int[20];
        int [] vpar = new int [20];
        int [] vimpar = new int [20];
        int vetores[][] = new int[20][20];

        System.out.println("digite numeros ");
        for (i=0; i<20;i++){
            int n= sc.nextInt();
            vlido[i] = n;
            vetores[vlido[i] % 2][i] = vlido[i];
        }

        System.out.println("Numeros lidos é  ");
        for (i=0; i<9; i++){
            System.out.println(vlido[i]);

        }

        System.out.println("Os numeros pares são  ");
        for (i=0; i<vpar.length; i++) {
            System.out.println (vetores[0][i]);
        }

        System.out.println("Os numeros impares são ");
        for (i=0; i<vimpar.length; i++) {
            System.out.println (vetores[1][i]);
        }
   
    }

}
