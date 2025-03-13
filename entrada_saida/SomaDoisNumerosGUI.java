import javax.swing.JOptionPane;
public class SomaDoisNumerosGUI{
    static public void main(String [] args){
        double v1;
        double v2;
        double solucao;

        v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite valor 1 "));
        v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite valor 2"));

        solucao = v1 + v2;

        JOptionPane.showMessageDialog(null, "Resultado: " + solucao);
    }
}