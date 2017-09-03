package pl.medicalclinic.Model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name="patients")
@Data //biblioteka Lombok zalatwia metody setter / getter
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    @Column(name = "login", unique = true)
    private String login;
    private String password;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name="phone_number")
    private String phoneNumber;
}
