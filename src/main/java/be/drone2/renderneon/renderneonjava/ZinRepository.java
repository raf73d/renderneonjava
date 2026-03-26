package be.drone2.renderneon.renderneonjava;

import java.util.List;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafde
 */
@Repository
public class ZinRepository {
 private final JdbcClient jdbcClient;
 
    public ZinRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }
   List<Zin> findByNaamBevat (String woord){
       var sql="""
               select id,uitspraak,datum
               from zinnen
               where uitspraak like ?
               """;
       return jdbcClient.sql(sql).param("%" + woord + "%").query(Zin.class).list();
   }
}
