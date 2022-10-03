
package er10;

public class pago_matricula {
    public static double matricula1 (double patrimonio, double estrato){
        double matricula;
        if ((patrimonio > 2000000) && (estrato > 3)){
                matricula = (patrimonio*0.03)+50000;
                
                return matricula;
            }
        else{
                matricula = 50000;
                return matricula;
            }
    }
    
}
