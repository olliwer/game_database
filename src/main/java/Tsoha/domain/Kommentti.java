package Tsoha.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Kommentti implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "ID")
    private Integer id;
    
    @NotNull(message="Kenttä ei saa olla tyhjä")
    @Pattern(regexp="([a-zA-Z0-9]+[\\s|\\.|\\?|\\!|\\,]*)+",
    message="Virheellinen syöte")
    @Column(name = "Fields")
    private String fields;
    
    @ManyToOne
    private Peli peli;

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Peli getPeli() {
        return peli;
    }

    public void setPeli(Peli peli) {
        this.peli = peli;
    }

}
