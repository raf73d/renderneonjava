/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be.drone2.renderneon.renderneonjava;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author rafde
 */
@Service
@Transactional (readOnly = true)
public class ZinService {
 private final ZinRepository zinRepository;
    public ZinService(ZinRepository zinRepository) {
        this.zinRepository = zinRepository;
    }
   
    List<Zin> findByNaamBevat (String woord){
        return  zinRepository.findByNaamBevat(woord);
    }
    
    
}
