package pl.medicalclinic.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name="privileges")
@Data
public class Privilege {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "privileges")
    private Collection<Role> roles;

    public Privilege(String name){
        this.name = name;
    }
}
