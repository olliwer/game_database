
package Tsoha.domain;


import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Peli implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name="ID")
    private Long id;
    
    //@Pattern(regexp="\\w+")
    @NotNull(message="Pitäähän pelillä nyt nimi olla..")
    private int nimi;
    
    @ManyToOne(cascade={CascadeType.ALL})
    private Genre genre;

    public Long getId() {
        return id;
    }

    public void setId(int peliId) {
        this.id = id;
    }

    public int getNimi() {
        return nimi;
    }

    public void setNimi(int nimi) {
        this.nimi = nimi;
    }
    
    public Genre getGenre(){
        return genre;
    }
    
    public void setGenre(Genre genre){
        this.genre = genre;
    }
    
}
