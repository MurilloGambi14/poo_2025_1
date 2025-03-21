public class SwitchCase {
    public static void main(String[] args) {
        var nota = Integer.parseInt (args[0]);
        if(nota >= 0 && nota <= 10){
            switch (nota) {
                case 10:
                case 9:
                    System.out.println("B");
                    break;
                case 8:
                    System.out.println("C");
                    break;
                case 7:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("Estudar um pouco mais");

            }
        }
        
    }
}