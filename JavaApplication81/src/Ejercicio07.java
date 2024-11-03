import java.util.Scanner;
public class Ejercicio07 {
    static Scanner entrada = new Scanner (System.in);
    public static void main(String[] args) {
        double costok, kilovatioConsumido, descuento, precioPlanilla;
       
        System.out.print("Ingresa el costo del kilovatio/hora: " );   
        costok = entrada.nextDouble();
        System.out.print("Ingresa la cantidad de kilovatios consumidos: ");
        kilovatioConsumido = entrada.nextDouble();
        
        
        descuento =(kilovatioConsumido * costok ) * 0.10;
        precioPlanilla =(kilovatioConsumido * costok ) - descuento ;
        System.out.println("Total a pagar = " + precioPlanilla);
        
        /*
        Ingresa el costo del kilovatio/hora: 10
        Ingresa la cantidad de kilovatios consumidos: 50
        Total a pagar = 450.0
        */
    }
}
