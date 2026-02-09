package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class DirectorEntity extends BaseEntity {

  public String nombre;
  public String bibliografia;

  @OneToMany
  private List<PeliculaEntity> peliculas =  new ArrayList<>();
    
}
