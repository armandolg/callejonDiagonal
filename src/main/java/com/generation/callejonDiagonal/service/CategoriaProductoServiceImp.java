package com.generation.callejonDiagonal.service;

import com.generation.callejonDiagonal.model.CategoriaProducto;
import com.generation.callejonDiagonal.repository.CategoriaProductoRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaProductoServiceImp implements CategoriaProductoService {

    //Traer la dependencia
    private CategoriaProductoRepository categoriaProductoRepository;

    public CategoriaProductoServiceImp(CategoriaProductoRepository categoriaProductoRepository) {
        this.categoriaProductoRepository=categoriaProductoRepository;
    }


    @Override
    public CategoriaProducto getCategoria(Integer id) {
        return categoriaProductoRepository.findByid(id);
    }
}
