package co.edu.uniandes.dse.TallerPersistencia.entities;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class PeliculaEntity extends BaseEntity {
    
    public String titulo;
    public Integer anioLanzamiento;

    @ManyToOne
   	private DirectorEntity director; 

    @ManyToMany
    private List<ActorEntity> actores =  new ArrayList<>();
    
}
