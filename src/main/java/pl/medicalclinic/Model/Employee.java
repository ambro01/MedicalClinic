package pl.medicalclinic.Model;

import lombok.Data;

import javax.persistence.*;

@Data //biblioteka Lombok zalatwia metody setter / getter
@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
}
