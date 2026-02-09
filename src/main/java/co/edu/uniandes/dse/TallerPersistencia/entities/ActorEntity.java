package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;
import java.util.List;

import org.hsqldb.lib.RCData;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
public class ActorEntity extends BaseEntity {

    public String nombre;
    public String nacionalidad;

    @ManyToMany
    private List<PeliculaEntity> peliculas =  new ArrayList<>();

    
    
}

