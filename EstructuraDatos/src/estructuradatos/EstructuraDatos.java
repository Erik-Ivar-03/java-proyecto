package estructuradatos;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EstructuraDatos {

  public static void main(String[] args) {
      try {
          
    boolean salir=false;
    Scanner scanner = new Scanner(System.in);
     
    while(!salir){
    System.out.println("===========================");
    System.out.println("Elige una opcion");
    System.out.println("1 - array");
    System.out.println("2 - arraylist");
    System.out.println("3 - has map");
    System.out.println("4 - salir");
    System.out.println("Erik Ivar Apaza Gordillo");    
    System.out.println("===========================");
     
    System.out.println("Ingrese una opcion:");
    int opcion =scanner.nextInt();
     
    switch (opcion) {
      case 1: 
        System.out.println("Bienvenido a la ED Array");
        int [] edades = {12,40,30,50,7,5,60,70,100};
        String[] nombres ={"Daniel", "Marcos","Diego","Ariel"};
         
        //long
        System.out.println("Longitud edades: "+edades.length);
        System.out.println("Longitud Nombres: "+nombres.length);
         
         
        //combiar un valor
        edades[1] = 38;
        nombres[3] = "David" ;
        System.out.println("Nuevo dato edad: " + edades[1]);
        System.out.println("Nuevo Dato nombre: " + nombres[3]);
         
        //convertir un Array a String
        System.out.println(Arrays.toString(edades));
        System.out.println(Arrays.toString(nombres));
         
        //clonar
        int[] edadesClon = edades.clone();
        System.out.println("Array clonado: "+Arrays.toString(edadesClon));
         
      case 2:
        System.out.println("Bienvenido a Array list");
         
        ArrayList<String> ListaNombres = new ArrayList<>();
         
        //agregar datos a la lista
        ListaNombres.add("David");
        ListaNombres.add("Marco");
        ListaNombres.add("Julio");
         
        //Longitud de la lista
        System.out.println("Tamaño lista" +ListaNombres.size());
         
        //remover un elemto de la lista
        ListaNombres.remove(2);
         
        //obtener un elemto de la lista
        ListaNombres.get(opcion);
         
        //compribar si la lista esta vacio
        System.out.println("Lista vacia?: "+ListaNombres.isEmpty());
         
        //comprobar si un elemento existe
        System.out.println("Existe: "+ListaNombres.contains("David"));
        break;
       
      case 3:
        System.out.println("Bienvenido a HasMap");
         
         
        Map<String,Integer> edades1 = new HashMap<>();
         
        //insertar data 
        edades1.put("Erik", 18);
        edades1.put("Pavel", 8);
        edades1.put("Marco", 12);
        edades1.put("Santiago", 14);
        edades1.put("Vidal", 62);
        edades1.put("Juan", 15);
         
         
        //eliminar data
        edades1.remove("Juan"); 
         
        //recuperar valor
        System.out.println("Edad Erik: " + edades1.get("Erik"));
         
        //Longitud del mapa
        edades1.size();
         
        //imprimir las llaves(keys)
        for(String key: edades1.keySet()){
          System.out.println("Llave: " + key);
        }   
         
        //imprimir valores (value)
        for(Integer value: edades1.values()){
          System.out.println("Valores: " + value);
        }
           
        //imprimir las llaves y los valores
        for(Map.Entry<String,Integer> lv : edades1.entrySet()){
          System.out.println("Llave: " +lv.getKey() + "valor: "+lv.getValue());
        }
        
      default:
          System.out.println("elija una opcion valida");
          break;    
        }
    } 
        scanner.close();
    } catch (Exception e) {
        System.out.println(" Ocurrio un error "+ e.getMessage());
    } finally{
          System.out.println("Gracias por usar el programa");
      }
  }
}
