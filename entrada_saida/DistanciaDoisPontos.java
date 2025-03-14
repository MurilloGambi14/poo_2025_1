import java.util.Scanner;

public class DistanciaDoisPontos{
    public static void main(String [] args){
        float x1;
        float x2;
        float y1;
        float y2;
        float distancia;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite x1: ");
        x1 = leitor.nextFloat();

        System.out.println("Digite x2: ");
        x2 = leitor.nextFloat();

        System.out.println("Digite y1: ");
        y1 = leitor.nextFloat();

        System.out.println("Digite y2: ");
        y2 = leitor.nextFloat();

        distancia = (float)(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));

        System.out.println("Distancia dos pontos é: " + distancia);

        

    }

    
}