package pl.medicalclinic.Model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="doctors")
@Data //biblioteka Lombok zalatwia metody setter / getter
public class Doctor implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String specialization;
    @Column(name = "login", unique = true)
    private String login;
    private String password;
    @Column(name = "email", unique = true)
    private String email;
}
