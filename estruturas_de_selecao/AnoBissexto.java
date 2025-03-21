public class AnoBissexto {
    public static void main(String[] args) {
        int ano = 1990;
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
            System.out.println("Ano Bissexto");
        }
        else{
            System.out.println("Ano não é bissexto");
        }
    }
}
