/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package be.drone2.renderneon.renderneonjava;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (HttpStatus.NOT_FOUND)
public class ZinNotfoundException extends RuntimeException {

    
    public ZinNotfoundException(int id) {
        super("zin niet gevonden met idNummer: " + id);
    }
} 
