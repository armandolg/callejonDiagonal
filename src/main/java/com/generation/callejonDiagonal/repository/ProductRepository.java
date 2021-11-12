package com.generation.callejonDiagonal.repository;
import com.generation.callejonDiagonal.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    Product findById(int id);

    List<Product> findAll();

//    @Query("select * from callejon_diagonal.productos where id_est=3 or id_est=4")
//    List<Product> destacados();
}
