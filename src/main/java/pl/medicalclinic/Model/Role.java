package pl.medicalclinic.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="user_roles")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "roles")
    private Set<User> users;
}
