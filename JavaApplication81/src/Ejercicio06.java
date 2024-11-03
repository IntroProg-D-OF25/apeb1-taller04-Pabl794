import java.util.Scanner;
public class Ejercicio06 {
    static Scanner entrada = new Scanner (System.in);
    public static void main(String[] args) {
       double montoPrestamo, interesMensual, numerador, denominador, pagoMensual;
        System.out.print("Ingresa el monto del prestamo: " );   
        montoPrestamo = entrada.nextDouble();
        System.out.print("Ingresa el interes mensual: ");
        interesMensual = entrada.nextDouble() / 100;
  
        numerador = interesMensual * Math.pow((1 + interesMensual), 12);
        denominador = Math.pow((1 + interesMensual), 12) - 1;
        pagoMensual = (montoPrestamo * (numerador /(denominador)));
        System.out.println("El pago mensual es: " + pagoMensual);
        
        /*
        Ingresa el monto del prestamo: 2000
        Ingresa el interes mensual: 60
        El pago mensual es: 1204.2784565456545
        */
    }
}
