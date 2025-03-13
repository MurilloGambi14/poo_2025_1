import java.util.Scanner;
public class SomaDoisNumeros{
    public static void main(String [] args){
        // declaração de variaveis
        int primeiroOperando;
        int segundoOperando;
        int resultado;
        Scanner leitor = new Scanner(System.in);
        // entrada
        System.out.println("Digite o primeiro valor:");
        primeiroOperando = leitor.nextInt();

        System.out.println("Digite o segundo valor:");
        segundoOperando = leitor.nextInt();

        //saida

        resultado = primeiroOperando + segundoOperando;

        System.out.println("Resultado: " + resultado);
    }
}