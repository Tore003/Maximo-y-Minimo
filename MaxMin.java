import java.io.*;

public class MaxMin {

    
    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        int nummax=0;
        int nummin=0;
        System.out.println("Ingrese un numero (Si el numero ingresado es cero, cierra la carga)");
        numero = Integer.parseInt(bufEntrada.readLine());

        while(numero>0)
        {
            if(numero==0)
        {
            System.out.println("Carga terminada");
        }
            nummax=numero;
            if(numero>nummax)
            {
                nummax=numero;
            }
            if(numero<nummin)
            {
                nummin=numero;
            }
        }
        System.out.println("El valor maximo es: " +nummax);
        System.out.println("El valor minimo es: " +nummin);
        
    }
}
