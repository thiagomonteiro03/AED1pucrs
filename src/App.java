import java.util.Scanner;

public class App {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Digite o valor de n: ");
        int n;
        n = in.nextInt();
        String numeros = "";

        for(int i = 1; i<=n;i++){

            numeros+= + i + ", ";

        }

        System.out.println(numeros);
        
    }
}
