
package com.dosideas.videojuegos.service;

import com.dosideas.videojuegos.repository.distribuidorRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import com.dosideas.videojuegos.domai.distribuidor;

@Service
public class distribuidorService {
    
    private final distribuidorRepository distribuidorRepository;

    public distribuidorService(distribuidorRepository distribuidorRepository) {
        this.distribuidorRepository = distribuidorRepository;
    }
    
    public List<distribuidor> buscarTodos(){
        return distribuidorRepository.findAll();
    }
    
    
}
