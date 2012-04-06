/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tsoha.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 *
 * @author Dragondejavu
 */
@Entity
public class Kommentti implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "Viesti")
    private String viesti;

    public Long getId() {
        return id;
    }

    public String getViesti() {
        return viesti;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setViesti(String viesti) {
        this.viesti = viesti;
    }
}
