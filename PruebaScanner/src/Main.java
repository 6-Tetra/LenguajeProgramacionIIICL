import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa tu nombre completo y presiona enter: ");
        String nombreUsuario = scanner.nextLine();

        System.out.println("\n Ahora ingresa tu edad: ");
        Byte Edad = scanner.nextByte();

        System.out.println("---Resumen de informacion---");
        System.out.println("\n Nombre: "+ nombreUsuario);
        System.out.println("\n Edad: "+ Edad);
    }
}
