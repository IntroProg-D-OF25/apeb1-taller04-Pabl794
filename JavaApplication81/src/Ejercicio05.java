import java.util.Scanner;
public class Ejercicio05 {
static Scanner entrada = new Scanner (System.in);
    public static void main(String[] args) {
        double cpu, teclado, pantalla, raton, totalDecomputadora;
        System.out.print("Ingresa el valor del CPU: " );   
        cpu = entrada.nextDouble();
        System.out.print("Ingresa el valor del teclado: ");
        teclado = entrada.nextDouble();
        System.out.print("Ingresa el valor de la pantalla: ");
        pantalla = entrada.nextDouble();
        System.out.print("Ingresa el valor del raton: ");
        raton = entrada.nextDouble();
       
       totalDecomputadora = teclado + pantalla +raton  + cpu;
        System.out.println("El valor de la computadora es = " + totalDecomputadora);
        /*
        Ingresa el valor del CPU: 100
        Ingresa el valor del teclado: 50
        Ingresa el valor de la pantalla: 200
        Ingresa el valor del raton: 20
        El valor de la computadora es = 370.0
        */
    }
    
}
