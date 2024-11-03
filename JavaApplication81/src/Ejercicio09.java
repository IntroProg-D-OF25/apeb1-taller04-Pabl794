import java.util.Scanner;
public class Ejercicio09 {
    static Scanner entrada = new Scanner (System.in);
    public static void main(String[] args) {
         float baseP, alturaP, areaA, areaP, areaB, areaTotal;
        
        System.out.println("Ingresa la base del triangulo: "  );
        baseP = entrada.nextFloat();
        System.out.println("Ingresa la altura del triangulo:");
        alturaP = entrada.nextFloat();
        areaA = ((baseP * alturaP)/2)* 3;
        areaP = baseP * baseP;
        areaB = baseP * alturaP;
        areaTotal = areaA + areaP + areaB;
        System.out.println("area total = " + areaTotal);
        
        /*
        Ingresa la base del triangulo: 
        2
        Ingresa la altura del triangulo:
        3
        area total = 19.0
        */
    }
    
}
