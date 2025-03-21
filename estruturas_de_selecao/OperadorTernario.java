// import static javax.swing.JOptionPane.showInputDialog;
// import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
public class OperadorTernario {
    public static void main(String[] args) {
        var idade = parseInt(showInputDialog("Digite sua idade"));
        var resposta = idade >= 18 ? "Sim" : "Não" ;
        showMessageDialog(null, resposta);
        // System.out.println(resposta); 
        System.out.println(idade >= 18 ? "Sim" : "Nao");

    }
}
