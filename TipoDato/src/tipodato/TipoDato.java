package tipodato;
public class TipoDato {
    public static void main(String[] args) {
        
        //Declarando 
        String Nombre;
        int Edad;
        double Saldo;
        boolean Estado;
        Object TodoTipoDato;        
        
       //asignar
        Nombre = "Erik Ivar Apaza Gordillo";
        Edad = 18;
        Saldo = 1000.34;
        TodoTipoDato = "Cadena";
        TodoTipoDato = 2;
        TodoTipoDato = true;
        TodoTipoDato = 23.23;
        
        //imprimendo
        System.out.println("Nombre: " + Nombre);
        System.out.println("Nombre; " + Edad);
        System.out.println("Saldo; " + Saldo);
        System.out.println("Dinamico ; " + TodoTipoDato);
    }
    
}
