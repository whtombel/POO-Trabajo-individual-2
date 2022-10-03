
package ejercicio19_cap3;

public class calculos_equilatero {
    
    public static double perimetro_equilatero (double lado){
        
        double perimetro;
        
        perimetro = lado + lado + lado;
        
        return perimetro; 
    }
    
    public static double altura_equilatero (double lado){
        
        double altura;
        
        altura = (Math.sqrt(3)/2)*lado;
        
        return altura; 
    }
    
    public static double area_equilatero (double lado){
        
        double area;
        
        area= (Math.pow(lado, 2)*Math.sqrt(3))/4;
        
        return area;
        
    }
    
    
}
