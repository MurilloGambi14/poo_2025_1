import java.util.Scanner;
public class IfESuasVariacoes {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);
        System.out.println("Digite a nota");
        var nota = leitor.nextDouble();
        
        if(nota >= 9){ 
            System.out.println("A");
            System.err.println("pa");
            }
        else if (nota >=8)
            System.out.println("b");
        else if (nota >=7)
            System.out.println("c");
        else
            System.out.println("estudar mais");
        
        
        
        
        System.out.println("Programa terminado");
    }

}


        // if(nota>= 6){
        //     System.out.println("Aprovado");
        //     System.out.println("Parabens");
        // }

        
        // else{
        //     System.out.println("Estudar mais");
        // }