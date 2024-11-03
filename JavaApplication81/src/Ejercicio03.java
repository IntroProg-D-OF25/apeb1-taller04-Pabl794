import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        int num;
        
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese un numero del 2 al 6:");
        num= (int) teclado.nextDouble();
        System.out.println("1 x" + num + "=" + (1*num));
        System.out.println("2 x" + num + "=" + (2*num));
        System.out.println("3 x" + num + "=" + (3*num));
        System.out.println("4 x" + num + "=" + (4*num));
        System.out.println("5 x" + num + "=" + (5*num));
        System.out.println("6 x" + num + "=" + (6*num));
        System.out.println("7 x" + num + "=" + (7*num));
        System.out.println("8 x" + num + "=" + (8*num));
        System.out.println("9 x" + num + "=" + (9*num));
        System.out.println("10 x" + num + "=" + (10*num));
        System.out.println("11 x" + num + "=" + (11*num));
        System.out.println("12 x" + num + "=" + (12*num));
        
        /*
        Ingrese un numero del 2 al 6:
        4
        1 x4=4
        2 x4=8
        3 x4=12
        4 x4=16
        5 x4=20
        6 x4=24
        7 x4=28
        8 x4=32
        9 x4=36
        10 x4=40
        11 x4=44
        12 x4=48
        */
    }
    
}
