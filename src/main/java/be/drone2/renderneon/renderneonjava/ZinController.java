/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be.drone2.renderneon.renderneonjava;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ZinController {

    public ZinController(be.drone2.renderneon.renderneonjava.ZinService zinService) {
        this.zinService = zinService;
    }
    private final ZinService zinService;
    
    @GetMapping(value = "zinnen", params = "naamBevat") 
    List<Zin> findByNaamBevat(@RequestParam String naamBevat) { 
    return zinService.findByNaamBevat(naamBevat); 
} 
}
