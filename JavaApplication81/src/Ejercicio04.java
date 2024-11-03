import java.util.Scanner;
public class Ejercicio04 {
static Scanner entrada = new Scanner (System.in);
    public static void main(String[] args) {
        int minutos_consumidos;
        double costoPorminuto, valortotal;
        System.out.print("Ingresa el costo por minuto: ");
        costoPorminuto = entrada.nextDouble();

        System.out.print("Ingresa los minutos consumidos: " );   
        minutos_consumidos = entrada.nextInt();
        
        valortotal = minutos_consumidos * costoPorminuto;
        System.out.println(" total a pagar = " + valortotal);
        
        
        /*
        Ingresa el costo por minuto: 30
        Ingresa los minutos consumidos: 90
        total a pagar = 2700.0
        */
    }
    }

