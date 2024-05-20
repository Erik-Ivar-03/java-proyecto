package operacionesconcadenas;
public class OperacionesConCadenas {
    public static void main(String[] args) {
        String Nombres = "Erik Ivar";
        String Apellidos = "Apaza Gordillo";
        
        //comcatenar
                //Concat
        String NombreCompleto = Nombres + " " + Apellidos;
        System.out.println("Nombre Completo: " + NombreCompleto);
        
        //mayusculas
        String NombreCompleto1 = Nombres + " " + Apellidos;
        System.out.println("Nombre Completo: " + NombreCompleto1.toUpperCase());
        
        //minusculas 
        String NombreCompleto2 = Nombres + " " + Apellidos;
        System.out.println("Nombre Completo: " + NombreCompleto1.toLowerCase());
           
        String NombreCompleto3 = Nombres + " " + Apellidos;
        System.out.println("Nombre Completo: " + NombreCompleto1.length());
        
        String NombreCompleto4 = Nombres + " " + Apellidos;
        String[] NombreCortado = NombreCompleto4.split("");
      //  for(int 1 = 0; i < NombreCortado.length ; i++){
      //     System.out.println(NombreCortado[i]);
      //  }
        for(String nombre : NombreCortado){
           System.out.println(nombre);
        }
        //Equals 
        boolean comparacion =Nombres.equals (Apellidos);
        System.out.println("comparacion: "+comparacion);
        
        //imterplacion de variables
        
        String n= "Erik";
        String a= "Ivar";
        int e = 50;
        
        String mensaje = String.format("Mi nombre es %s %s y tengo %d años", n, a, e);
        System.out.println(mensaje);
       //hola
    }
    
}
