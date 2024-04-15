package com.dosideas.videojuegos.repository;
import java.util.List;
import com.dosideas.videojuegos.domai.videojuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface videojuegosRepository  extends JpaRepository<videojuego, Integer> {
    
    //PARTE10
    //SE CREA EL REPOSITORIO Y PARA HACER AJUSTES DE LA DB Y CONECTA Y QUE SEPA QUE LOS DATOS DE AHI LOS TOMAREMOS

    //metodo jpql para llamar todas las instancias
    //para ordernarlos por nombres 
    //@Query("select v from videojuego v order by v.nombre")
    
    //forma natyva de sql
    @Query(value = "select * from videojuego order by nombre", nativeQuery = true)
    List<videojuego> buscarTodos();

    @Query("from videojuego v where v.distribuidor.id = ?1 order by v.nombre")
    List<videojuego> buscarporDistribuidor(int distribuidor_id);
    
    //@Query("from videojuego v where v.nombre like %?1%")
    //List<videojuego> buscar(String consulta);
    // forma altermnativa
    List<videojuego> findBynombreContaining(String consulta);
    
}
