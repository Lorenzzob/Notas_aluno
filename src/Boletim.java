
import java.util.Locale;
import java.util.Scanner;

public class Boletim {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);



        Estudante estudante = new Estudante();

        System.out.print("Digite o nome do aluno: ");
        estudante.setName(sc.nextLine());

        System.out.println("Quantas notas serão digitadas? ");
        int nota = sc.nextInt();

        System.out.println("Digite as notas de " + estudante.getName());

        for(int i = 0; i<nota; i++) {
            estudante.notas.add(sc.nextDouble());

        }


        System.out.printf("A média do aluno: " + estudante.getName() + " é = %.1f", estudante.media());


        System.out.println("O aluno " + estudante.getName() + " está " + (estudante.isAprovado() ? "aprovado" : "reprovado"));
        

        sc.close();


    }
}
