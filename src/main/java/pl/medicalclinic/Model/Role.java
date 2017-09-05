package pl.medicalclinic.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name="roles")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "roles")
    private Collection<User> users;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name="roles_privileges", catalog = "medicalclinic_db",
            joinColumns = {@JoinColumn(name="id_role", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name="id_privilege", referencedColumnName = "id")})
    private Collection<Privilege> privileges;

    public Role(String name){
        this.name = name;
    }
}
