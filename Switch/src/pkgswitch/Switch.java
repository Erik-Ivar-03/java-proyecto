package pkgswitch;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println("Elige una opcion");
        System.out.println("1 - Saludar");
        System.out.println("2 - Despedir");
        System.out.println("3 - Insultar :D");
        System.out.println("4 - Salir");
        System.out.println("Erik Ivar Apaza Gordillo");
        System.out.println("===========================");
        
        Scanner scanner = new Scanner(System.in);
        
        int Opcion = scanner.nextInt();
        
                switch (Opcion){
                    
                    case 1:
                        System.out.println("¡Hola! ¿Como estas?");
                    break;
                    
                    case 2:
                        System.out.println("¡Hasta luego!");
                    break;
                    
                    case 3:
                        System.out.println("Calla mongol!");
                    break;
                    
                    case 4:
                        System.out.println("Chau >:");
                    break;
                        
                    default:
                        System.out.println("Opcion no valida. Por favor, elige una opcion valida. ");
                        
                    break;   
                }
                scanner.close();
                System.out.println("Fin del programa");
    }
    
}
