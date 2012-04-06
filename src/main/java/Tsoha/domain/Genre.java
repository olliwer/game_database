
package Tsoha.domain;


import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Genre implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name="ID")
    private Integer id;
    
    @OneToMany
    private List<Peli> pelit;

    public Integer getId() {
        return id;
    }

    public List<Peli> getPelit() {
        return pelit;
    }

    public void setPelit(List<Peli> pelit) {
        this.pelit = pelit;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public void addPeli(Peli peli) {
        if(!pelit.contains(peli)){
            pelit.add(peli);
        }
        peli.setGenre(this);
    }
    
    
}
