package pl.medicalclinic.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="user_roles")
@Data
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
