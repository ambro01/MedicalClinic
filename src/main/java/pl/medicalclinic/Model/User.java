package pl.medicalclinic.Model;

import lombok.Data;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;


@Entity
@Table(name="users")
@Data //biblioteka Lombok zalatwia metody setter / getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username", unique = true)
    private String username;
    private String password;
    @Column(name = "email", unique = true)
    private String email;
    private Boolean enabled;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name="users_roles", catalog = "medicalclinic_db",
            joinColumns = {@JoinColumn(name="id_user", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name="id_role", referencedColumnName = "id")})
    private Collection<Role> roles;
}
