package co.edu.uniandes.dse.TallerPersistencia.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class PeliculaEntity extends BaseEntity {
    @Id
    public long id;
    
    public String titulo;
    public Integer anioLanzamiento;

    @ManyToOne
   	private DirectorEntity director; 
    
}
