
package parte2_fgeometricas;

public class clase_triangulorec {
    
    public static double area_triangulorec (double base, double altura){
        return (base * altura / 2);
    }
    
    
    
    public static double perimetro_triangulorec (double base, double altura, double hipotenusa){
        return (base + altura + hipotenusa);
    }
    
    
    public static double hipotenusa_triangulorec (double base, double altura){
        return Math.pow(base*base + altura*altura, 0.5);
    }
    
    
}
