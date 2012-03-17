
package Tsoha.domain;


import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity(name="GENRE")
public class Genre implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name="ID")
    private Long id;
    
    @OneToMany
    private List<Peli> pelit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public void addPeli(Peli peli) {
        if(!pelit.contains(peli)){
            pelit.add(peli);
        }
        peli.setGenre(this);
    }
    
    
}