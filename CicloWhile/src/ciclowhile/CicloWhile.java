package ciclowhile;

import java.util.Scanner;

public class CicloWhile {
    public static void main(String[] args) {
        boolean salir = false;
        Scanner scanner = new Scanner(System.in);
        
        while(!salir){
        System.out.println("===========================");
        System.out.println("Elige una opcion");
        System.out.println("1 - Saludar");
        System.out.println("2 - Despedir");
        System.out.println("3 - Insultar :D");
        System.out.println("4 - Salir");
        System.out.println("Erik Ivar Apaza Gordillo");
        System.out.println("===========================");
        
        int Opcion = scanner.nextInt();
        
                switch (Opcion){
                    
                    case 1:
                        
                        System.out.println("¡Hola! ¿Como estas?");
                    break;
                    
                    case 2:
                        int[] numeros = {1,2,3,4,5,6,7,8,9};
                        Object[] NumerosLetras= {12, "Erik", 123.321, true, "Pavel"};
                        for(Object nl: NumerosLetras){
                            System.out.println(nl);
                        }
                        
                        for(int n=0;n<numeros.length;n++){
                            if(numeros[n]==2)
                            System.out.println(numeros[n]);
                        }                             
                                
                    break;
                    
                    case 3:
                         for (int i = 1; i<=1;i++){
                        //2
                        //("wa");
                        }
                        System.out.println("Calla mongol!");
                    break;
                    
                    case 4:
                        System.out.println("Chau >:");
                        salir = true;
                    break;
                        
                    default:
                        System.out.println("Opcion no valida. Por favor, elige una opcion valida. ");
                        
                    break;   
                }
            System.out.println("Fin del programa");
        }
    scanner.close();
    }
}
