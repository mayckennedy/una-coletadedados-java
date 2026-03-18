import java.util.Scanner;
public class coletaDados {
public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
System.out.println("\nCadastro de viajantes");
System.out.print("\ndigite o seu nome:");
String nome = leitor. nextLine();
System.out.print("Digite sua idade");
int idade = leitor. nextInt();
System.out.println("nome:" + nome);
System.out.println("idade:" + idade);

leitor.close();

}
}