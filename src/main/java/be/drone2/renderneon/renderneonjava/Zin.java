/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be.drone2.renderneon.renderneonjava;

import java.time.LocalDate;

/**
 *
 * @author rafde
 */
public class Zin {
    private final int id;
    private final String uitspraak;
    private final LocalDate datum;

    public Zin(int id, String uitspraak, LocalDate datum) {
        this.id = id;
        this.uitspraak = uitspraak;
        this.datum = datum;
    }

    public int getId() {
        return id;
    }

    public String getUitspraak() {
        return uitspraak;
    }

    public LocalDate getDatum() {
        return datum;
    }
    
    
}
