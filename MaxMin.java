import java.io.*;

public class MaxMin {

    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        int nummax = 0;
        int nummin = 999999999;
        System.out.println("Ingrese un numero (Si el numero ingresado es cero, cierra la carga)");
        do {
            numero = Integer.parseInt(bufEntrada.readLine());
            if (numero == 0) {
                System.out.println("Carga terminada");
            } else {
                if (numero > nummax) {
                    nummax = numero;
                }
                if (numero < nummin) {
                    nummin = numero;
                }
            }
        } while (numero > 0);

        System.out.println("El valor maximo es: " + nummax);
        System.out.println("El valor minimo es: " + nummin);
    }
}
