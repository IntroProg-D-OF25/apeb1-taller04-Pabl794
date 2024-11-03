import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        double gastosHijo1, gastosHijo2, gastosHijo3, TotalGastos;
        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("ingresa los gastos del primer hijo:");
        gastosHijo1= Teclado.nextDouble();
        
        System.out.println("ingresa los gastos del segundo hijo:");
        gastosHijo2 = Teclado.nextDouble();
        
        System.out.println("ingresa los gastos del tercer hijo:");
        gastosHijo3= Teclado.nextDouble();
        
        TotalGastos= (gastosHijo1+gastosHijo2+gastosHijo3);
        System.out.println("TotalDeGastos = " + TotalGastos);
        
        /*
        ingresa los gastos del primer hijo:
        200
        ingresa los gastos del segundo hijo:
        300
        ingresa los gastos del tercer hijo:
        122
        TotalDeGastos = 622.0
        */
    }
}
