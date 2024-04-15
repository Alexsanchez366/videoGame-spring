package com.dosideas.videojuegos.domai;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

// SEEGUNDA PARTE
// SE CREA EL DISEÑO 

// PARTE 9 SE AGREGA ENTITY Y @ID ETC PARA QUE SEPA QUE ESTA EN UNA TABLA Y EN LA DB
@Entity
public class videojuego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String descripcion;
    private String imagen_Url;
    @ManyToOne // para hacer llamado del nombre no solo del id de la tabla distribuidor 
    private distribuidor distribuidor;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen_Url() {
        return imagen_Url;
    }

    public void setImagen_Url(String imagen_Url) {
        this.imagen_Url = imagen_Url;
    }

    public distribuidor getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(distribuidor distribuidor) {
        this.distribuidor = distribuidor;
    }

    @Override
    public String toString() {
        return "videojuego{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", imagen_Url=" + imagen_Url + ", distribuidor=" + distribuidor.getId() + '}';
    }
    
    
    
    
    
    
}


