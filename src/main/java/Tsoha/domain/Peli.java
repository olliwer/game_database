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
    @Column(name = "ID")
    private Integer id;
    
    //@Pattern(regexp="\\w+")
    @NotNull(message = "Pitäähän pelillä nyt nimi olla..")
    @Column(name = "Name")
    private String nimi;
    
    @ManyToOne(cascade = {CascadeType.ALL})
    private Genre genre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer peliId) {
        this.id = id;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
