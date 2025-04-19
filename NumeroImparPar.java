
import java.util.Scanner; //biblioteca que scaneia o teclado.

public class NumeroImparPar { //nome da classe
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //objeto para o scanner que sera usado para armazenar oque o usuario digitar

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt(); //o obejto  novo sera usado para receber um valor

        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
        
        scanner.close();
    }
}
