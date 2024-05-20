package operadores.de.comparacion;
public class OperadoresDeComparacion {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        //operador =
        boolean igual = a == b;
        System.out.println("igual: " + igual);
        
        //operador !=
        boolean noigual = a != b;
        System.out.println("no igual: " + noigual);
        
        //operador mayor que >
        boolean mayorque = a > b;
        System.out.println("mayor que : " + mayorque);
        
        //operador =
        boolean menorque =a  < b;
        System.out.println("menor que : " + menorque);
        
        //operador >=
        boolean mayorOigual = a >= b;
        System.out.println("mayor o igual que : " + mayorOigual);
        
        //operador >=
        boolean menorOigual = a <= b;
        System.out.println("menor o igual que : " + menorOigual);
    }
    
}
