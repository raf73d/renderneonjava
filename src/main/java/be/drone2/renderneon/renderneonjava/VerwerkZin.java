/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be.drone2.renderneon.renderneonjava;

/**
 *
 * @author rafde
 */
public class VerwerkZin {

    public VerwerkZin() {
    }
    
    public int geefAantalKarakters (Zin zin){
        var lengte = zin.getUitspraak().replace(" ", "").length();
        
        return lengte;
    }
    
    
    
}
