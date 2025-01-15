import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do seu Herói: ");
        String nome = sc.nextLine();
        System.out.print("Digite a quantidade de experiência: ");
        double xp = sc.nextDouble();
        
        String nivel;

        if(xp <= 1000.0) {
            nivel = "Ferro";
        }
        else if (xp <= 2000.0) {
            nivel = "Bronze";
        }
        else if (xp <= 5000.0) {
            nivel = "Prata";
        }
        else if (xp <= 7000.0) {
            nivel = "Ouro";
        }
        else if (xp <= 8000.0) {
            nivel = "Platina";
        }
        else if (xp <= 9000.0) {
            nivel = "Ascendente";
        }
        else if (xp <= 10000.0) {
            nivel = "Imortal";
        } else {
            nivel = "Radiante";
        }

        System.out.println();
        System.out.println("O Herói de nome " + nome + " está no nível de " + nivel);

    }
}
