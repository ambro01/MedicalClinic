package pl.medicalclinic.Model;

import lombok.Data;

import javax.persistence.*;


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
}
