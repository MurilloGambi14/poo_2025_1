package estrutura_de_repeticao;
import static javax.swing.JOptionPane.*;
import static java.lang.Double.parseDouble;
public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        double nota1, nota2, media;
        int contador = 1;
        do{
            System.out.println(contador);
            contador += 1;
        }while(contador <= 3);
        System.out.println("Acabou");
    }
}


// while (contador <= 3) {
    //     nota1 = parseDouble(showInputDialog("Nota 1"));
    //     nota2 = parseDouble(showInputDialog("Nota2"));
    //     media = (nota1 + nota2) / 2;
    
    //     if(media >= 6)
    //         showMessageDialog(null, "Aprovado");
    //     else
    //         showMessageDialog(null, "Reprovado");
    
    //     contador += 1;
    
    
    // for(int contador = 1;contador <= 3;contador += 1) {
    //     nota1 = parseDouble(showInputDialog("Nota 1"));
    //     nota2 = parseDouble(showInputDialog("Nota2"));
    //     media = (nota1 + nota2) / 2;
    
    //     if(media >= 6)
    //         showMessageDialog(null, "Aprovado");
    //     else
    //         showMessageDialog(null, "Reprovado");
    // }
