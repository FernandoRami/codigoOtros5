import java.util.Scanner;

public class Codigo5 {
    public static void main(String[] args) {//se hizo la clase main
        Scanner s = new Scanner(System.in); // se importo el scanner
        System.out.print("Introduzca un número: ");
        int ni = s.nextInt(); // Use nextInt() para leer int
        int c = ni;

        int afo = 0;
        int noAfo = 0;

        while (ni > 0) {
            int digito = ni % 10; // quite el int
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++;
            } else {
                noAfo++;
            }
            ni /= 10;
        }

       
        if (afo > noAfo) {
            System.out.println("El " + c + " es un número afortunado."); // corregi println
        } else {
            System.out.println("El " + c + " no es un número afortunado.");
        }

        s.close(); //cerre el scanner
    }
}

