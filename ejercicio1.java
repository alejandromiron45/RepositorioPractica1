import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("escriba un número, 0 para salir: ");
        int n = teclado.nextInt();
        int nMayor = Integer.MIN_VALUE;

        while (n != 0) {
            if (n > nMayor) {
                nMayor = n;}

            System.out.print("escriba un número, 0 para salir: ");
            n = teclado.nextInt();}

        if (nMayor != Integer.MIN_VALUE) {
            System.out.println("el numero con mayor valor introducido es: " + nMayor);}
        else {
            System.out.println("No se introdujeron números.");}

    }
}
