
package ejercicio18_cap3;

public class salarioneto {
    public static double salario_neto (double salbruto,double porcentajerf ){
    
        double salneto;
        salneto = salbruto - (salbruto*(porcentajerf/100)); 
     
        return salneto;
    }
}
