import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Entradas: Pedir um número inteiro
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = teclado.nextInt();
        teclado.close();
        //Processamento: Não tem
        //Saída: Mostrar o número digitado
        System.out.println("O número digitado foi: " + numero);
    }
}
