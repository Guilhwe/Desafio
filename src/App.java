
import java.util.Scanner;

public class App {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int saldo = 1000;
        String nombre = "Guilherme Melo";
        String tipoCuenta = "Corriente";
        boolean salir = false;
        System.out.println("*****************************************");
        System.out.println("********** Datos del cliente ************");
        System.out.println();
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo:"+ saldo);
        System.out.println();
        System.out.println("*****************************************");
        while (salir == false) {
        

        System.out.println("Operaciones:");
        System.out.println();
        System.out.println("1.Consultgar saldo");
        System.out.println("2.Ingresar");
        System.out.println("3.Retirar");
        System.out.println("4.Salir");
        System.out.println();
        System.out.println("*****************************************");

        System.out.println("Elija la operación deseada:");
        System.out.println();
        String opcion = scanner.nextLine();
        
        switch (opcion) {
            case "1":
                System.out.println("Su saldo es de " + saldo);
                salto();
                break;
            case "2":
                System.out.println("Cuanto dinero quieres ingresar?");
                int ingreso = scanner.nextInt();
                saldo += ingreso;
                System.out.println("Operación realizada con éxito");
                scanner.nextLine();
                salto();
                break;
            case "3":
                System.out.println("Cuanto dinero quieres retirar?");
                int retiro = scanner.nextInt();
                if (retiro > saldo) {
                    System.out.println("No tienes suficiente saldo");
                } else {
                    saldo -= retiro;
                    System.out.println("Operación realizada con éxito");
                }
                scanner.nextLine();
                salto();
                break;
            case "4":
                System.out.println("Gracias por usar nuestros servicios");
                salir = true;
                salto();
                break;
            default:
                System.out.println("Opción no válida");  
                salto();
                break;
        }
        }
       
    }
    public static void salto () {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
        
    }

    
   
}
