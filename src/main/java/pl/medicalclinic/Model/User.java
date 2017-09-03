package pl.medicalclinic.Model;

import lombok.Data;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
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
    private Integer enabled;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name="role_of_user", catalog = "medicalclinic_db",
            joinColumns = {@JoinColumn(name="id_user", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name="id_role", nullable = false, updatable = false)})
    private Set<Role> roles;
}
