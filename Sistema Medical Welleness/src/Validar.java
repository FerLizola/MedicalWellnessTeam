/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Bryan
 */
public class Validar {
    
    public static boolean telefono(String tel){
        String[] telefono = tel.split("-");
        for(String x:telefono){
            if(!isNumeric(x)){
                return false;
            }
        }
        return true;
    }
 
    public static boolean isNumeric( String s ){
        try{
            double y = Double.parseDouble( s );
            return true;
        }
        catch( NumberFormatException err ){
            return false;
        }
    }
}
