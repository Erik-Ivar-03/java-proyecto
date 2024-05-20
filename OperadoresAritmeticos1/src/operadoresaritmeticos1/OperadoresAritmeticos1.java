package operadoresaritmeticos1;
public class OperadoresAritmeticos1 {
    public static void main(String[] args) {
        
        int variableUno= 50;
        int variableDos= 20;

        //Incremento
        //variableUno =variableUno+1;
        
        variableUno ++;
        System.out.println("incremento: " + variableUno);
        
        //Decremento
        //variableDos = variableDos - 1;
        variableDos --;
        System.out.println("Decremento; "+variableDos);
        
        //suma
        int resultadosuma = variableDos + variableUno;
        System.out.println("Suma; "+resultadosuma);
        
        //resta
        int resultadoresta = variableDos - variableUno;
        System.out.println("Resta; "+resultadoresta);
        
        //Multi
        int resultadomulti = variableDos * variableUno;
        System.out.println("Multi; "+resultadomulti);
        
        //divi
        int resultadodivi = variableDos / variableUno;
        System.out.println("Divi; "+resultadodivi);
        
        //modulo
        int resultadomodu = variableDos % variableUno;
        System.out.println("Modulo; "+resultadomodu);
    }
    
}
