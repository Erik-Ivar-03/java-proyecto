package operadoreslogicos;
public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean esVerdadero = true;
        boolean esFalso = false;
        
        //operador AND (&&)
        boolean resultadoAnd = esVerdadero && esFalso;
        System.out.println("AND: " + resultadoAnd);
        
        //operador (||)
        
        boolean resultadoOr = esVerdadero || esFalso;
        System.out.println("OR: " + resultadoOr);
        
        //Operador NOT (!)
        boolean resultadoNot = !esVerdadero;
        System.out.println("NOT: " + resultadoNot);
    }   
}
//Erik Ivar Apaza Gordillo