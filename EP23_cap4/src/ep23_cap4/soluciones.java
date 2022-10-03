
package ep23_cap4;

public class soluciones {
    
    public static double calculo1(double a, double b, double c){
        double x1;
        x1 = ((-(b)+(Math.sqrt((b*b)-4*a*c)))/(2*a));
        return x1;
    }
    
    public static double calculo2(double a, double b, double c){
        double x2;
        x2 = ((-(b)-(Math.sqrt((b*b)-4*a*c)))/(2*a));
        return x2; 
    }
}
