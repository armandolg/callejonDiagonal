package com.generation.callejonDiagonal.Repository;

import com.generation.callejonDiagonal.Model.Eventos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventosRepository extends CrudRepository<Eventos,Integer> {

    List<Eventos> findAll();
    //List<Eventos> findAllOrderByFechaDesc();
    //implementation 'org.springframework.boot:spring-boot-starter-security'
    //testImplementation 'org.springframework.security:spring-security-test'
}
