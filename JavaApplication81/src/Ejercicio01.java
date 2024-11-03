/*Generar un algoritmo que permite calcular y presentar el área de un triángulo. Los datos deben ser pedidos al usuario.*/
import java.util.Scanner;public class Ejercicio01 {
    public static void main(String[] args) {
        double baseTriangulo, alturaTriangulo, areaTriangulo;
        Scanner calculo = new Scanner(System.in);
        
        System.out.println("ingrese la base de el triangulo:");
        baseTriangulo = calculo.nextDouble();
        
        System.out.println("ingrese el area del Triangulo:");
        alturaTriangulo = calculo.nextDouble();
        
        areaTriangulo= ((baseTriangulo * alturaTriangulo)/2);
        System.out.println("Area del Triangulo = " + areaTriangulo);
        
        /*
        ingrese la base de el triangulo:
         4
        ingrese el area del Triangulo:
        6
        Area del Triangulo = 12.0
        */
  
    }
}
